package me.Game;

import javax.swing.JFrame;

import me.security.LoginWindow;

public class Main 
{
	public static boolean devbuild = false;
	
	public static void main(String [ ] args)
	{
		Frame frame = new Frame();
		frame.setVisible(true);
		frame.setSize(1020, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.initialize();
		
		LoginWindow loginframe = new LoginWindow();
		loginframe.setVisible(true);
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		while(true)
		{
			frame.Update();
			frame.Repaint();
		}
	}
}
