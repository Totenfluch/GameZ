package me.Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import me.Other.OtherStuff;
import me.Totenfluch.TServerClient.Client;
import me.security.Login;

public class Frame extends JFrame implements KeyListener, MouseListener, MouseMotionListener{
	
	private static final long serialVersionUID = 1L;
	private BufferStrategy strat;
	private int JHeight, JWidth;
	int mouseX = 0;
	int mouseY = 0;
	int mousemoveX = 0;
	int mousemoveY = 0;
	RainParticle[] particles = new RainParticle[100];
	int FPS = 0;
	int FPSCount = 0;
	int gamespeed = 2;

	long FPSStartTime = 0;
	public static int[][] Destroyer = new int[9999][2];
	public static int[][] Destroyer2 = new int[9999][2];
	private int Score = 1;
	private int Scoreold = 0;
	private int ticks = 0;
	private boolean lost = false;
	private int DestroyersOnline = 10;
	private int Destroyers2Online = 10;
	private int GodMode = 300;
	private boolean GodModePowerup = false;
	private int GodModePowerupballx = OtherStuff.randInt(100, 1000);
	private int GodModePowerupbally = OtherStuff.randInt(100, 600);
	private boolean GodModePowerupballactive = false;
	private int tickdiff = 0;
	private boolean backgroundon = true;
	private boolean disco = false;
	private Color colorrng[] = {Color.red, Color.blue, Color.BLACK, Color.GRAY, Color.BLUE, Color.CYAN, Color.MAGENTA, Color.YELLOW, Color.WHITE, Color.LIGHT_GRAY, Color.darkGray}; 
	private int deescalate = 0;
	private Color currentbackground = null;
	private Color currentdestroyercolor = Color.RED;

	public Frame()
	{
		super("Game");
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);

		for(int i = 0; i < 9999; i++){
			for(int b = 0; b < 2; b++){
				Destroyer[i][b] = OtherStuff.randInt(100, 600);
			}
		}

		for(int i = 0; i < 9999; i++){
			for(int b = 0; b < 2; b++){
				Destroyer2[i][b] = OtherStuff.randInt(100, 600);
			}
		}
	}

	public void initialize()
	{
		makestrat();

		JWidth = getSize().width;
		JHeight = getSize().height;

		addKeyListener(this);
		requestFocus();
		addMouseListener(this);
		addMouseMotionListener(this);

		for(int i = 0; i < particles.length; i++)
		{
			particles[i] = new RainParticle(JWidth, JHeight);
		}
	}

	public void makestrat()
	{
		createBufferStrategy(2);
		strat = getBufferStrategy();
	}

	public void Repaint()
	{
		Graphics g = strat.getDrawGraphics();
		paintComponents(g);
		Draw(g);
		g.dispose();

		/*FPSCount++;
		if(System.currentTimeMillis()-FPSStartTime >= 1000)
		{
			FPS = FPSCount;
			FPSCount = 0;
			System.out.println("FPS: " + FPS);
			FPSStartTime = System.currentTimeMillis();
		}*/

		strat.show();		
	}

	public void Update()
	{
		for(int i = 0; i < DestroyersOnline; i++){
			for(int b = 0; b < 2; b++){
				Destroyer[i][b] = Destroyer[i][b] + OtherStuff.randInt(1, gamespeed);

				if(Destroyer[i][0] > 1020){
					Destroyer[i][0] = 0;
				}else if(Destroyer[i][0] < 0){
					Destroyer[i][0] = 1020;
				}

				if(Destroyer[i][1] > 600){
					Destroyer[i][1] = 0;
				}else if(Destroyer[i][1] < 0){
					Destroyer[i][1] = 600;
				}
			}

		}

		for(int i = 0; i < Destroyers2Online; i++){
			for(int b = 0; b < 2; b++){
				Destroyer2[i][b] = Destroyer2[i][b] - OtherStuff.randInt(1, gamespeed);

				if(Destroyer2[i][0] > 1020){
					Destroyer2[i][0] = 0;
				}else if(Destroyer2[i][0] < 0){
					Destroyer2[i][0] = 1020;
				}

				if(Destroyer2[i][1] > 600){
					Destroyer2[i][1] = 0;
				}else if(Destroyer2[i][1] < 0){
					Destroyer2[i][1] = 600;
				}
			}
		}

		if(GodModePowerupballx > 1020){
			GodModePowerupballx = 0;
		}else if(GodModePowerupballx < 0){
			GodModePowerupballx = 1020;
		}

		if(GodModePowerupbally > 600){
			GodModePowerupbally = 0;
		}else if(GodModePowerupbally < 0){
			GodModePowerupbally = 600;
		}

		if(GodModePowerupballactive == true){
			GodModePowerupballx = GodModePowerupballx + OtherStuff.randInt(1, 5);
			GodModePowerupbally = GodModePowerupbally - OtherStuff.randInt(1, 5);
		}

		if(GodMode-ticks < 0 && GodModePowerup == false){
			for(int c = 0; c < DestroyersOnline; c++){
				if(((Destroyer[c][0] - mousemoveX < 5 && Destroyer[c][0] - mousemoveX > -5) && (Destroyer[c][1] - mousemoveY < 5 && Destroyer[c][1] - mousemoveY > -5))
						|| ((Destroyer2[c][0] - mousemoveX < 5 && Destroyer2[c][0] - mousemoveX > -5) && (Destroyer2[c][1] - mousemoveY < 5 && Destroyer2[c][1] - mousemoveY > -5 ))){
					lost = true;
					Repaint();
					double diff = Score/ticks;


					Object[] options = {"Retry",
							"Quit", "Submit Score & Retry", "Submit Score & Quit"};
					int n = JOptionPane.showOptionDialog(null,
							"You Faggot Lost!\nYou scored: " + Score + " Points\nIn " + ticks + " ticks.\n" + "Average Difficulty: " + diff ,
							"Question",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null,
							options,
							options[0]);

					if(n == 0){
						Score = 1;
						Scoreold = 0;
						ticks = 0;
						lost = false;
						gamespeed = 2;
						DestroyersOnline = 10;
						Destroyers2Online = 10;
						tickdiff = 0;
						GodModePowerupballactive = false;
						GodModePowerup = false;
						for(int i = 0; i < 50; i++){
							for(int b = 0; b < 2; b++){
								Destroyer[i][b] = OtherStuff.randInt(100, 600);
							}
						}

						for(int i = 0; i < 50; i++){
							for(int b = 0; b < 2; b++){
								Destroyer2[i][b] = OtherStuff.randInt(100, 600);
							}
						}
					}else if(n == 1){
						System.exit(1);
					}else if(n == 2){
						OtherStuff.PublishScore(Score, Login.ActiveUser);
						Score = 1;
						Scoreold = 0;
						ticks = 0;
						lost = false;
						gamespeed = 2;
						DestroyersOnline = 10;
						Destroyers2Online = 10;
						tickdiff = 0;
						GodModePowerupballactive = false;
						GodModePowerup = false;
						for(int i = 0; i < 50; i++){
							for(int b = 0; b < 2; b++){
								Destroyer[i][b] = OtherStuff.randInt(100, 600);
							}
						}

						for(int i = 0; i < 50; i++){
							for(int b = 0; b < 2; b++){
								Destroyer2[i][b] = OtherStuff.randInt(100, 600);
							}
						}
					}else if(n == 3){
						OtherStuff.PublishScore(Score, Login.ActiveUser);
						JOptionPane.showMessageDialog(null, "Score published! bye");
						System.exit(1);
					}
				}else if(((GodModePowerupballx - mousemoveX < 5 && GodModePowerupballx - mousemoveX > -5) && (GodModePowerupbally - mousemoveY < 5 && GodModePowerupbally - mousemoveY > -5))  && GodModePowerupballactive == true){
					GodModePowerupballactive = false;
					GodModePowerup = true;
					tickdiff = ticks+300;
				}
			}
		}


		for(int i = 0; i < particles.length; i++)
		{
			particles[i].Update(JHeight);
		}
		if(Score-1 != Scoreold || GodMode != 300){
			JOptionPane.showMessageDialog(null, "CHEATENGINE GAYYYYYYYYYYYY");
			System.exit(1);
		}
		if(GodMode-ticks < 0){
			Score = Score+gamespeed;
			Scoreold = Scoreold+gamespeed;
		}
		ticks++;

		if(OtherStuff.randInt(1, 150) == 25){
			Destroyers2Online++;
		}else if(OtherStuff.randInt(1, 150) == 26){
			DestroyersOnline++;
		}else if(OtherStuff.randInt(1, 500) == 125){
			GodModePowerupballactive = true;
		}

		if(tickdiff < ticks ){
			GodModePowerup = false;
		}
	}

	public void Draw(Graphics g)
	{
		if(disco == true){

			/*int b = OtherStuff.randInt(0, 3);
			if(b == 0){
				g.setColor(Color.BLACK);
			}else if(b == 1){
				g.setColor(Color.GRAY);
			}else if(b == 2){
				g.setColor(Color.darkGray);
			}else if(b == 3){
				g.setColor(Color.DARK_GRAY);
			}*/
			g.setColor(currentbackground);
			if(deescalate == 70){
				currentbackground = colorrng[OtherStuff.randInt(0, 10)];
				g.setColor(currentbackground);
				deescalate = 0;
			}

			deescalate++;
		}else{
			g.setColor(Color.BLACK);
		}
		g.fillRect(0, 0, JWidth, JHeight);

		/*g.setColor(Color.CYAN);
		TheFox.drawcat(g);*/

		g.setColor(Color.pink);
		g.drawString("Score: " + Score, 480, 50);
		g.drawString("Gamespeed: " + gamespeed + "  Adjust with 1 & 2 (more speed more score!)", 480, 60);
		g.drawString("Destroyers Active: " + String.valueOf(DestroyersOnline+Destroyers2Online), 480, 70);
		g.drawString("Disable background with '5'", 480, 80);
		if(ticks < 300){
			g.drawString("GodMode Time Left: " + String.valueOf(GodMode-ticks), 480, 90);
		}else
			if(GodModePowerup == true){
				g.drawString("Special Godmode on! for: " + String.valueOf(tickdiff-ticks), 480, 90);
			}

		if(GodModePowerupballactive == true){
			g.setColor(Color.PINK);
			g.fillOval(GodModePowerupballx, GodModePowerupbally, 10, 10);
		}

		if(lost == true){
			g.setColor(Color.CYAN);
			g.fillOval(mousemoveX, mousemoveY, 10, 10);
		}

		if(disco == true && deescalate == 69){
			currentdestroyercolor = colorrng[OtherStuff.randInt(0, 10)];
		}

		for(int i = 0; i < DestroyersOnline; i++){
			if(GodMode-ticks > 0 || GodModePowerup == true){
				g.setColor(Color.GREEN);
			}else if(disco == true){
				g.setColor(currentdestroyercolor);
			}else{
				g.setColor(Color.RED);
			}
			g.fillOval(Destroyer[i][0], Destroyer[i][1], 10, 10);
		}

		for(int i = 0; i < Destroyers2Online; i++){
			if(GodMode-ticks > 0 || GodModePowerup == true ){
				g.setColor(Color.GREEN);
			}else if(disco == true){
				g.setColor(currentdestroyercolor);
			}else{
				g.setColor(Color.YELLOW);
			}
			g.fillOval(Destroyer2[i][0], Destroyer2[i][1], 10, 10);
		}
		if(backgroundon == true){
			for(int i = 0; i < particles.length; i++)
			{
				particles[i].Draw(g);
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_1){
			if(gamespeed < 5){
				gamespeed++;
			}
		}
		if(key == KeyEvent.VK_2){
			if(gamespeed >= 2){
				gamespeed--;
			}
		}
		if(key == KeyEvent.VK_5){
			if(backgroundon == true){
				backgroundon = false;
			}else if(backgroundon == false){
				backgroundon = true;
			}
		}
		if(key == KeyEvent.VK_9){
			if(disco == true){
				disco = false;
				Client.processMessage("hii");
			}else if(disco == false){
				disco = true;
				Client.processMessage("hii2");
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		PointerInfo a = MouseInfo.getPointerInfo();
		Point point = new Point(a.getLocation());
		SwingUtilities.convertPointFromScreen(point, e.getComponent());
		mouseX = (int) point.getX();
		mouseY = (int) point.getY();	
		System.out.println("Mouse clicked! X: " + point.getX() + " Y: " + point.getY());
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		mousemoveX = e.getX();
		mousemoveY = e.getY();
		Repaint();
	}	
}
