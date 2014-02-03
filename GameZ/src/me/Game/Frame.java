package me.Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import me.Other.OtherStuff;
import me.Other.ResourceLoader;
import me.Sound.Sound;
import me.security.Login;

public class Frame extends JFrame implements KeyListener, MouseListener, MouseMotionListener{

	private static final long serialVersionUID = 1L;
	private BufferStrategy strat;
	private static int JHeight;
	private static int JWidth;
	int mouseX = 0;
	int mouseY = 0;
	int mousemoveX = 0;
	int mousemoveY = 0;
	RainParticle[] particles = new RainParticle[100];
	int gamespeed = 2;

	long FPSStartTime = 0;
	public static int[][] Destroyer = new int[999][2];
	public static int[][] Destroyer2 = new int[999][2];
	public static int[][] CubeDestroyer = new int[999][2];
	private int Score = 1;
	private int Scoreold = 0;
	private int ticks = 0;
	private boolean lost = false;
	private int DestroyersOnline = 10;
	private int Destroyers2Online = 10;
	private int CubeDestroyerOnline = 0;
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
	private int godmodesequence = 1;
	private int godmodesequencecount = 150;
	public static boolean scoreboard = false;
	private static boolean MouseInDashboard = false;
	private Font ftDefault = new Font("TimesRoman", Font.PLAIN, 20);

	public Frame()
	{
		super("The Epic Game");
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);

		for(int i = 0; i < 999; i++){
			for(int b = 0; b < 2; b++){
				Destroyer[i][b] = OtherStuff.randInt(100, 600);
			}
		}

		for(int i = 0; i < 999; i++){
			for(int b = 0; b < 2; b++){
				Destroyer2[i][b] = OtherStuff.randInt(100, 600);
			}
		}
		
		for(int i = 0; i < 999; i++){
			for(int b = 0; b < 2; b++){
				CubeDestroyer[i][b] = OtherStuff.randInt(100, 600);
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

				if(Destroyer[i][1] > 590){
					Destroyer[i][1] = 0;
				}else if(Destroyer[i][1] < 0){
					Destroyer[i][1] = 590;
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

				if(Destroyer2[i][1] > 590){
					Destroyer2[i][1] = 0;
				}else if(Destroyer2[i][1] < 0){
					Destroyer2[i][1] = 590;
				}
			}
		}
		
		for(int i = 0; i < CubeDestroyerOnline; i++){
			for(int b = 0; b < 2; b++){
				if(b==0){
					CubeDestroyer[i][b] = CubeDestroyer[i][b] + OtherStuff.randInt(1, gamespeed);
				}else if(b==1){
					CubeDestroyer[i][b] = CubeDestroyer[i][b] - OtherStuff.randInt(1, gamespeed);
				}

				if(CubeDestroyer[i][0] > 1020){
					CubeDestroyer[i][0] = 0;
				}else if(CubeDestroyer[i][0] < 0){
					CubeDestroyer[i][0] = 1020;
				}

				if(CubeDestroyer[i][1] > 590){
					CubeDestroyer[i][1] = 0;
				}else if(CubeDestroyer[i][1] < 0){
					CubeDestroyer[i][1] = 590;
				}
			}

		}

		if(GodModePowerupballx > 1020){
			GodModePowerupballx = 0;
		}else if(GodModePowerupballx < 0){
			GodModePowerupballx = 1020;
		}

		if(GodModePowerupbally > 590){
			GodModePowerupbally = 0;
		}else if(GodModePowerupbally < 0){
			GodModePowerupbally = 590;
		}

		if(GodModePowerupballactive == true){
			if(godmodesequence == 1){
				GodModePowerupballx = GodModePowerupballx + OtherStuff.randInt(1, 5);
				GodModePowerupbally = GodModePowerupbally + OtherStuff.randInt(1, 5);
				godmodesequencecount--;
				if(godmodesequencecount <= 0){
					godmodesequencecount = 150;
					godmodesequence = OtherStuff.randInt(1, 4);
				}

			}
			else if(godmodesequence == 2){
				GodModePowerupballx = GodModePowerupballx - OtherStuff.randInt(1, 5);
				GodModePowerupbally = GodModePowerupbally - OtherStuff.randInt(1, 5);
				godmodesequencecount--;
				if(godmodesequencecount <= 0){
					godmodesequencecount = 150;
					godmodesequence = OtherStuff.randInt(1, 4);
				}
			}
			else if(godmodesequence == 3){
				GodModePowerupballx = GodModePowerupballx - OtherStuff.randInt(1, 5);
				GodModePowerupbally = GodModePowerupbally + OtherStuff.randInt(1, 5);
				godmodesequencecount--;
				if(godmodesequencecount <= 0){
					godmodesequencecount = 150;
					godmodesequence = OtherStuff.randInt(1, 4);
				}
			}
			else if(godmodesequence == 4){
				GodModePowerupballx = GodModePowerupballx + OtherStuff.randInt(1, 5);
				GodModePowerupbally = GodModePowerupbally - OtherStuff.randInt(1, 5);
				godmodesequencecount--;
				if(godmodesequencecount <= 0){
					godmodesequencecount = 150;
					godmodesequence = OtherStuff.randInt(1, 4);
				}
			}
		}


			for(int c = 0; c < DestroyersOnline; c++){
				if(((Destroyer[c][0] - mousemoveX < 5 && Destroyer[c][0] - mousemoveX > -5) && (Destroyer[c][1] - mousemoveY < 5 && Destroyer[c][1] - mousemoveY > -5))
						|| ((Destroyer2[c][0] - mousemoveX < 5 && Destroyer2[c][0] - mousemoveX > -5) && (Destroyer2[c][1] - mousemoveY < 5 && Destroyer2[c][1] - mousemoveY > -5 ))
						|| ((CubeDestroyer[c][0] - mousemoveX < 5 && CubeDestroyer[c][0] - mousemoveX > -5) && (CubeDestroyer[c][1] - mousemoveY < 5 && CubeDestroyer[c][1] - mousemoveY > -5 ))){
					if(GodMode-ticks < 0 && GodModePowerup == false){
						lost = true;
						Repaint();
						Sound.stopSound();
						double diff = Score/(ticks-300);
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
							System.exit(0);
						}else if(n == 2){
							OtherStuff.PublishScore(Score, Login.ActiveUser);
							RestartGame();
						}else if(n == 3){
							OtherStuff.PublishScore(Score, Login.ActiveUser);
							JOptionPane.showMessageDialog(null, "Score published! bye");
							System.exit(0);
						}else{
							RestartGame();
						}
					}else{
						Destroyer2[c][0] = 1;
						Destroyer[c][0] = 1;
					}

				}else if(((GodModePowerupballx - mousemoveX < 5 && GodModePowerupballx - mousemoveX > -5) && (GodModePowerupbally - mousemoveY < 5 && GodModePowerupbally - mousemoveY > -5))  && GodModePowerupballactive == true){
					GodModePowerupballactive = false;
					GodModePowerup = true;
					tickdiff = ticks+300;
				}

			}


			for(int i = 0; i < particles.length; i++)
			{
				particles[i].Update(JHeight);
			}
			if(Score-1 != Scoreold || GodMode != 300 || tickdiff > ticks+301){
				JOptionPane.showMessageDialog(null, "CHEATENGINE GAYYYYYYYYYYYY");
				System.exit(0);
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
			}else if(OtherStuff.randInt(1, 400-gamespeed*35) == 1 && Score > 10000){
				CubeDestroyerOnline ++;
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
			godmodesequencecount = 150;
			CubeDestroyerOnline = 0;
			Sound.playSound("Sound2.wav");
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
			g.drawImage(ResourceLoader.ImageLoad("/dashboard.png"), 0, 600, 1020, 200, null);
			
			
			//g.drawString("Score: " + Score, JWidth/2, 50);
			g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
			DrawCenteredString(g, Color.PINK, "Score: " + String.valueOf(Score), JWidth/2, 650);
			
			//g.drawString("(+" +gamespeed + ") Gamespeed: " + gamespeed + "  Adjust with 1 & 2 (more speed more score!)", JWidth/2, 675);
			DrawCenteredString(g, Color.PINK, "(+" +gamespeed + ") Gamespeed: " + gamespeed + "  Adjust with 1 & 2 (more speed more score!)", JWidth/2, 670);
			//g.drawString("Destroyers Active: " + String.valueOf(DestroyersOnline+Destroyers2Online+CubeDestroyerOnline), JWidth/2, 700);
			DrawCenteredString(g, Color.PINK, "Destroyers Active: " + String.valueOf(DestroyersOnline+Destroyers2Online+CubeDestroyerOnline), JWidth/2, 690);
			
			if(backgroundon == true){
				//g.drawString("(+1) Disable background with '5'", JWidth/2, 725);
				DrawCenteredString(g, Color.PINK, "(+1) Disable background with '5'", JWidth/2, 710);
			}else{
				//g.drawString("(+0) Enable background with '5'", JWidth/2, 725);
				DrawCenteredString(g, Color.PINK, "(+0) Enable background with '5'", JWidth/2, 710);
			}
			if(disco == false){
				//g.drawString("(+0) Turn Disco on with '9'", JWidth/2, 750);
				DrawCenteredString(g, Color.PINK, "(+0) Turn Disco on with '9'", JWidth/2, 730);
			}else{
				//g.drawString("(+Score*2) Disable Disco with '9'", JWidth/2, 750);
				DrawCenteredString(g, Color.PINK, "(+Score*2) Disable Disco with '9'", JWidth/2, 730);
			}

			if(pausediff > ticks){
				//g.drawString("No score for " + String.valueOf(pausediff-ticks), JWidth/2, 775);
				DrawCenteredString(g, Color.PINK, "No score for " + String.valueOf(pausediff-ticks), JWidth/2, 750);
			}else{
				//g.drawString("Press ESC for Pause (5s no Score)", JWidth/2, 775);
				DrawCenteredString(g, Color.PINK, "Press ESC for Pause (5s no Score)", JWidth/2, 750);
			}

			if(ticks < 300){
				//g.drawString("(Score locked at 1) GodMode Time Left: " + String.valueOf(GodMode-ticks), JWidth/2, 800);
				DrawCenteredString(g, Color.PINK, "(Score locked at 1) GodMode Time Left: " + String.valueOf(GodMode-ticks), JWidth/2, 770);
			}else if(GodModePowerup == true){
				//g.drawString("(+10) Special Godmode on! for: " + String.valueOf(tickdiff-ticks), JWidth/2, 800);
				DrawCenteredString(g, Color.PINK, "(+10) Special Godmode on! for: " + String.valueOf(tickdiff-ticks) + String.valueOf(GodMode-ticks), JWidth/2, 770);
			}

			if(GodModePowerupballactive == true){
				g.setColor(Color.PINK);
				//g.drawImage(ResourceLoader.ImageLoad("/Feathercoin.png"), GodModePowerupballx, GodModePowerupbally, 30, 30, null);
				g.fillOval(GodModePowerupballx, GodModePowerupbally, 10, 10);
			}
			
			

			if(lost == true || MouseInDashboard == true){
				g.setColor(Color.CYAN);
				g.fillOval(mousemoveX, mousemoveY, 10, 10);
				//g.drawString("                          The Mouse is on the Dashboard, setting it to the cyan oval position.", 20, 625);
				DrawCenteredString(g, Color.CYAN, "The Mouse is on the Dashboard, setting it to the cyan oval position.", JWidth/2, 625);
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
			
			for(int i = 0; i < CubeDestroyerOnline; i++){
				if(GodMode-ticks > 0 || GodModePowerup == true){
					g.setColor(Color.GREEN);
				}else if(disco == true){
					g.setColor(currentdestroyercolor);
				}else{
					g.setColor(Color.YELLOW);
				}
				g.fillRect(CubeDestroyer[i][0], CubeDestroyer[i][1], 10, 10);
			}
			
			if(backgroundon == true){
				for(int i = 0; i < particles.length; i++)
				{
					particles[i].Draw(g);
				}
			}
		}
		
		private void DrawCenteredString(Graphics g, Color color, String s, int xPos, int yPos){
			FontMetrics fm = getFontMetrics(ftDefault);

			Rectangle2D textsize = fm.getStringBounds(s, g);

			xPos = (int) ((JWidth - textsize.getWidth()) / 2);

			g.setColor(color);
			g.drawString(s, xPos, yPos);
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
			if(e.getY() > 594){
				mousemoveY = 594;
				MouseInDashboard = true;
			}else{
				mousemoveY = e.getY();
				MouseInDashboard = false;
			}
			mousemoveX = e.getX();
			Repaint();
		}	
	}
