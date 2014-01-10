package me.Game;

import javax.swing.JFrame;

public class Main 
{
	public static void main(String [ ] args)
	{
		Frame frame = new Frame();
		frame.setSize(1020, 600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.initialize();

		while(true)
		{
			frame.Update();
			frame.Repaint();
		}
	}
}
