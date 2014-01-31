package me.Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.Timer;

import me.Other.OtherStuff;
import me.Sound.Sound;
import me.Totenfluch.TServerClient.Client;
import me.security.LoginWindow;

public class Main 
{
	public static boolean devbuild = false;
	public static double Version = 4.3;
	private static LoginWindow loginframe;
	private static Timer timer = null;
	private static Timer logintimer = null;
	public static InetAddress ComputerIP;
	public static String ComputerMac;
	public static String ComputerName;
	public static boolean Valid = false;
	public static boolean GamePaused = false;
	
	public static void main(String[] args)
	{	
		try {
			ComputerIP = InetAddress.getLocalHost();
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		}
		ComputerMac = OtherStuff.getMacAdress();
		ComputerName = ComputerIP.getHostName();
		
		loginframe = new LoginWindow();
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginframe.setVisible(true);
		loginframe.initialize();
		loginframe.Repaint();
		logintimer = new Timer (10, new ActionListener(){
	        public void actionPerformed(ActionEvent e) {
	            loginframe.Repaint();
	        }
	    });
		logintimer.start();
		OtherStuff.GetMOTD();
		
		
		String host = "188.194.13.44";
		int port = Integer.parseInt("9977");
		@SuppressWarnings("unused")
		final Client chatframe = new Client(host, port);
		
		OtherStuff.MakeValid();
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				if(Client.IsConnectedToServer == true){
					try {
						Client.socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
	}
	
	public static void DisableLoginWindow(){
		loginframe.setVisible(false);
	}
	
	public static void StartGame(){
		final Frame frame = new Frame();
		frame.setSize(1020, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.initialize();
		Sound.playSound("Sound2.wav");
	    timer = new Timer (10, new ActionListener(){
	        public void actionPerformed(ActionEvent e) {
	        	if(GamePaused == false){
	        		frame.Repaint();
	            	frame.Update();
	        	}
	        }
	    });
	    timer.start();
	    logintimer.stop();
	}
}
