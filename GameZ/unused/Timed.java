package me.Other;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Timed {
	public static Timer oneSecoundObject = null;
	public static int SecoundsPassed = 0;

	public static void TimedDraw(Graphics g, Color c, int x, int y, String string, int TimeAmount){
		int savedtime = SecoundsPassed;
		g.setColor(c);
		while(SecoundsPassed > savedtime+TimeAmount){
			g.drawString(string, x, y);
		}
	}
	
	public static void startTimer(){
		oneSecoundObject = new Timer (1000, new ActionListener(){
	        public void actionPerformed(ActionEvent e) {
	        	SecoundsPassed++;
	        }
	    });
		oneSecoundObject.start();
	}
}
