package me.Totenfluch.TServerClient;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import me.Game.Main;
import me.security.DataCrypter;
import me.security.LoginWindow;

public class Client extends JFrame implements Runnable
{
	private static final long serialVersionUID = 1L;
	public static boolean IsConnectedToServer = false;
	private static TextField tf = new TextField("Input", 80);
	private TextArea ta = new TextArea("Server Cmd's will appear here\n\n", 30, 120);
	private static TextField ComputerName = new TextField("Client", 20);
	public static String LatestServerReply = "";
	public static boolean waitingforreply = false;
	public static boolean disconnected = false;

	static String format;
	public static Socket socket;
	private static DataOutputStream dout;
	private DataInputStream din;

	public Client( String host, int port ) {
		setSize(900, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(1);

		setLayout( new FlowLayout() );
		add(tf);
		add(ComputerName);
		add(ta);
		ComputerName.setEditable(false);
		tf.addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent e ) {
				processMessage( e.getActionCommand() );
			}
		} );

		try {
			socket = new Socket( host, port );
			din = new DataInputStream( socket.getInputStream() );
			dout = new DataOutputStream( socket.getOutputStream() );
			IsConnectedToServer = true;
			new Thread( this ).start();
		}catch( IOException ie ){ 		
			Main.timeout.stop();
			JOptionPane.showMessageDialog(null, "Couldn't connect to the Master Server.\nHight Scores/Server Backup won't be available this session\nRestart the Game to try to reconnect.");
			LoginWindow.StartOfflineMode.setEnabled(true);
			LoginWindow.StartOfflineMode.setVisible(true);
			Main.OnlineMode = false;
			disconnected = true;
		}
	}


	public static void processMessage( String message ) {
		if(IsConnectedToServer == true){
			try {
				format = DataCrypter.encrypt2((Main.ComputerName + " " + message));
				dout.writeUTF( format );
				tf.setText("");
				waitingforreply = true;
			} catch( Exception ie ){
				ie.printStackTrace();
				System.out.println( ie ); 
			}
		}
	}

	public void run() {
		try {
			while (true) {
				if(IsConnectedToServer == true){
					String message = null;
					try{
						message = DataCrypter.decrypt2(din.readUTF());
						LatestServerReply = message;
						GetServerMessages.CheckServerMessages(message);
						ta.append(message+"\n");
						waitingforreply = false;
					}catch(Exception e){
						System.out.println("Server read message exception.");
						IsConnectedToServer = false;
						disconnected = true;
					}
				}
			}
		}catch( Exception ie ){
			ie.printStackTrace();
			IsConnectedToServer = false;
			disconnected = true;
		}
	}
}