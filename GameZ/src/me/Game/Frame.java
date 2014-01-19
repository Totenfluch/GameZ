package me.Game;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
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
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import me.Other.OtherStuff;

public class Frame extends JFrame implements KeyListener, MouseListener, MouseMotionListener{

	private BufferStrategy strat;
	private int JHeight, JWidth;
	int mouseX = 0;
	int mouseY = 0;
	int mousemoveX = 0;
	int mousemoveY = 0;
	RainParticle[] particles = new RainParticle[100];
	int FPS = 0;
	int FPSCount = 0;
	int gamespeed = 3;
	
	long FPSStartTime = 0;
	public static int[][] Destroyer = new int[50][2];
	public static int[][] Destroyer2 = new int[50][2];
	private int Score = 1;
	private int Scoreold = 0;
	private JLabel ScoreLabel;
	private int ticks = 0;
	private boolean lost = false;

	public Frame()
	{
		super("Game");
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		
		/*super.setBackground(Color.black);
		
		ScoreLabel = new JLabel("Score: " + Score);
		ScoreLabel.setForeground(Color.PINK);
		ScoreLabel.setBounds(482, 78, 200, 25);
		ScoreLabel.setFont(new Font("Serif", Font.BOLD, 25));
		add(ScoreLabel);*/

		for(int i = 0; i < 50; i++){
			for(int b = 0; b < 2; b++){
				Destroyer[i][b] = OtherStuff.randInt(100, 600);
				System.out.println("Row: "+ i + " digit: " + b  + " = " + Destroyer[i][b]);
			}
		}
		
		for(int i = 0; i < 50; i++){
			for(int b = 0; b < 2; b++){
				Destroyer2[i][b] = OtherStuff.randInt(100, 600);
				System.out.println("Row: "+ i + " digit: " + b  + " = " + Destroyer[i][b]);
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

		FPSCount++;
		if(System.currentTimeMillis()-FPSStartTime >= 1000)
		{
			FPS = FPSCount;
			FPSCount = 0;
			System.out.println("FPS: " + FPS);
			FPSStartTime = System.currentTimeMillis();
		}

		strat.show();		
	}

	public void Update()
	{
		for(int i = 0; i < 50; i++){
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
		
		for(int i = 0; i < 50; i++){
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
		
			for(int c = 0; c < 50; c++){
				if(((Destroyer[c][0] - mousemoveX < 5 && Destroyer[c][0] - mousemoveX > -5) && (Destroyer[c][1] - mousemoveY < 5 && Destroyer[c][1] - mousemoveY > -5))
				  || ((Destroyer2[c][0] - mousemoveX < 5 && Destroyer2[c][0] - mousemoveX > -5) && (Destroyer2[c][1] - mousemoveY < 5 && Destroyer2[c][1] - mousemoveY > -5 ))){
					lost = true;
					Repaint();
					double diff = Score/ticks;

					Object[] options = {"Retry",
					"Quit"};
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
						gamespeed = 3;
						for(int i = 0; i < 50; i++){
							for(int b = 0; b < 2; b++){
								Destroyer[i][b] = OtherStuff.randInt(100, 600);
								System.out.println("Row: "+ i + " digit: " + b  + " = " + Destroyer[i][b]);
							}
						}
						
						for(int i = 0; i < 50; i++){
							for(int b = 0; b < 2; b++){
								Destroyer2[i][b] = OtherStuff.randInt(100, 600);
								System.out.println("Row: "+ i + " digit: " + b  + " = " + Destroyer[i][b]);
							}
						}
					}else{
						System.exit(1);
					}
				}
			}
		

		for(int i = 0; i < particles.length; i++)
		{
			particles[i].Update(JHeight);
		}
		if(Score-1 != Scoreold){
			JOptionPane.showMessageDialog(null, "CHEATENGINE GAYYYYYYYYYYYY");
			System.exit(1);
		}
		Score = Score+gamespeed;
		Scoreold = Scoreold+gamespeed;
		ticks++;
	}

	public void Draw(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, JWidth, JHeight);
		
		g.setColor(Color.pink);
		g.drawString("Score: " + Score, 480, 50);
		g.drawString("Gamespeed: " + gamespeed + "  Adjust with 1 & 2 (more speed more score!)", 480, 60);
		
		if(lost == true){
			g.setColor(Color.CYAN);
			g.fillOval(mousemoveX, mousemoveY, 10, 10);
		}

		for(int i = 0; i < 50; i++){
			g.setColor(Color.RED);
			g.fillOval(Destroyer[i][0], Destroyer[i][1], 10, 10);
		}
		
		for(int i = 0; i < 50; i++){
			g.setColor(Color.YELLOW);
			g.fillOval(Destroyer2[i][0], Destroyer2[i][1], 10, 10);
		}

		for(int i = 0; i < particles.length; i++)
		{
			particles[i].Draw(g);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_1){
			System.out.println("ddd");
			if(gamespeed < 50){
				gamespeed++;
			}
		}
		if(key == KeyEvent.VK_2){
			System.out.println("dddf");
			if(gamespeed >= 3){
				gamespeed--;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Char: " + e.getKeyChar() + " Code: " + e.getKeyCode());
		//ClientTest test = new ClientTest();
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
