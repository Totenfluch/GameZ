package me.Totenfluch.TServerClient;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import me.security.DataCrypter;

public class Client extends JFrame implements Runnable
{
	private static final long serialVersionUID = 1L;
	public static boolean IsConnectedToServer = false;
	private static TextField tf = new TextField("Input", 80);
	private TextArea ta = new TextArea("Text from other users will appear here\n\n", 30, 120);
	private static TextField ComputerName = new TextField("Client", 20);
	public static String LatestServerReply = "";
	public static boolean waitingforreply = false;

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

			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}

			JOptionPane.showMessageDialog(null, "Couldn't connect to the Master Server.\nHight Scores/Server Backup won't be available this session\nRestart the Game to try to reconnect."); 
		}
	}


	public static void processMessage( String message ) {
		if(IsConnectedToServer == true){
			try {
				format = DataCrypter.encrypt2((ComputerName.getText() +" " + message));
				dout.writeUTF( format );
				tf.setText("");
				waitingforreply = true;
			} catch( Exception ie ) { ie.printStackTrace(); System.out.println( ie ); }
		}
	}

	public void run() {
		try {

			while (true) {
				String message = DataCrypter.decrypt2(din.readUTF());
				LatestServerReply = message;
				GetServerMessages.CheckServerMessages(message);
				ta.append(message+"\n");
				waitingforreply = false;
			}
		} catch( Exception ie ) { ie.printStackTrace(); System.out.println( ie); IsConnectedToServer = false; }
	}
}