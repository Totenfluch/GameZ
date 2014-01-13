package me.Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

import me.Other.OtherStuff;
import me.security.LoginWindow;

public class Main 
{
	public static boolean devbuild = false;
	public static double Version = 1.0;
	private static LoginWindow loginframe;
	private static Timer timer = null;
	private static Timer timer2 = null;
	
	public static void main(String [ ] args)
	{	
		loginframe = new LoginWindow();
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginframe.setVisible(true);
		loginframe.initialize();
		OtherStuff.GetMOTD();
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
	    timer = new Timer (17, new ActionListener(){
	        public void actionPerformed(ActionEvent e) {
	            frame.Repaint();
	            frame.Update();
	        }
	    });
	    timer.start();
	}
}
