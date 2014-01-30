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
	private int pausediff = 0;

	public Frame()
	{
		super("The Epic Game");
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
					double diff = Score/ticks-300;

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
						RestartGame();
					}else if(n == 1){
						System.exit(1);
					}else if(n == 2){
						OtherStuff.PublishScore(Score, Login.ActiveUser);
						RestartGame();
					}else if(n == 3){
						OtherStuff.PublishScore(Score, Login.ActiveUser);
						JOptionPane.showMessageDialog(null, "Score published! bye");
						System.exit(1);
					}else{
						RestartGame();
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
		if(Score-1 != Scoreold || GodMode != 300 || tickdiff > ticks+301){
			JOptionPane.showMessageDialog(null, "CHEATENGINE GAYYYYYYYYYYYY");
			System.exit(1);
		}
		if(pausediff < ticks){
			if(GodMode-ticks < 0){
				if(disco == false){
					Score = Score+gamespeed;
					Scoreold = Scoreold+gamespeed;
				}else if(disco == true){
					Score = Score+(gamespeed*2);
					Scoreold = Scoreold+(gamespeed*2);
				}

				if(backgroundon == true){
					Score++;
					Scoreold++;
				}
			}
		}
		ticks++;

		if(OtherStuff.randInt(1, 500-gamespeed*35) == 25){
			Destroyers2Online++;
		}else if(OtherStuff.randInt(1, 500-gamespeed*35) == 26){
			DestroyersOnline++;
		}else if(OtherStuff.randInt(1, 250+gamespeed*80) == 125){
			GodModePowerupballactive = true;
		}

		if(tickdiff < ticks ){
			GodModePowerup = false;
		}
	}

	public void RestartGame(){
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
	}

	public void Draw(Graphics g)
	{
		if(disco == true){

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

		g.setColor(Color.pink);
		g.drawString("Score: " + Score, 470, 50);
		g.drawString("(+" +gamespeed + ") Gamespeed: " + gamespeed + "  Adjust with 1 & 2 (more speed more score!)", 470, 60);
		g.drawString("Destroyers Active: " + String.valueOf(DestroyersOnline+Destroyers2Online), 470, 70);
		if(backgroundon == true){
			g.drawString("(+1) Disable background with '5'", 470, 80);
		}else{
			g.drawString("(+0) Enable background with '5'", 470, 80);
		}
		if(disco == false){
			g.drawString("(+0) Turn Disco on with '9'", 470, 90);
		}else{
			g.drawString("(+Score*2) Disable Disco with '9'", 470, 90);
		}

		if(pausediff > ticks){
			g.drawString("No score for " + String.valueOf(pausediff-ticks), 470, 100);
		}else{
			g.drawString("Press ESC for Pause (5s no Score)", 470, 100);
		}

		if(ticks < 300){
			g.drawString("(Score locked at 1) GodMode Time Left: " + String.valueOf(GodMode-ticks), 470, 110);
		}else
			if(GodModePowerup == true){
				g.drawString("(+10) Special Godmode on! for: " + String.valueOf(tickdiff-ticks), 470, 110);
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
			if(gamespeed < 10){
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
			}else if(disco == false){
				disco = true;
			}
		}
		if(key == KeyEvent.VK_ESCAPE){
			Main.GamePaused = true;
			pausediff = ticks+300;
			Object[] options = {"Resume",
			"Quit"};
			int n = JOptionPane.showOptionDialog(null,
					"Game Paused",
					"Pause",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.INFORMATION_MESSAGE,
					null,
					options,
					options[0]);

			if(n == 0){
				Main.GamePaused = false;
			}else if(n == 1){
				System.exit(1);
			}else{
				Main.GamePaused = false;
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
		if(Main.devbuild == true){
			PointerInfo a = MouseInfo.getPointerInfo();
			Point point = new Point(a.getLocation());
			SwingUtilities.convertPointFromScreen(point, e.getComponent());
			mouseX = (int) point.getX();
			mouseY = (int) point.getY();	
			System.out.println("Mouse clicked! X: " + point.getX() + " Y: " + point.getY());
		}
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
