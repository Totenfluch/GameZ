package me.Game;

public class Main 
{
	public static void main(String [ ] args)
	{
     Frame frame = new Frame();
     frame.setSize(1020, 600);
     frame.setVisible(true);
     frame.setResizable(false);
     frame.setLocationRelativeTo(null);
     frame.setDefaultCloseOperation(3);

     frame.initialize();
    
     while(true)
     {
 	    frame.Update();
 	    frame.Repaint();
     }
	}
}
