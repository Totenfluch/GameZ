package me.Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.Timer;

import me.Other.OtherStuff;
import me.Totenfluch.TServerClient.Client;
import me.security.LoginWindow;

public class Main 
{
	public static boolean devbuild = true;
	public static double Version = 1.0;
	private static LoginWindow loginframe;
	private static Timer timer = null;
	public static InetAddress ComputerIP;
	public static String ComputerMac;
	public static String ComputerName;
	
	public static void main(String [ ] args)
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
		OtherStuff.GetMOTD();
		
		String host = "188.194.13.44";
		int port = Integer.parseInt("9977");
		final Client chatframe = new Client(host, port);
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
	    timer = new Timer (10, new ActionListener(){
	        public void actionPerformed(ActionEvent e) {
	            frame.Repaint();
	            frame.Update();
	        }
	    });
	    timer.start();
	}
}
