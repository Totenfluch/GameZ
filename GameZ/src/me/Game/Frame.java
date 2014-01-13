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
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import me.Other.OtherStuff;

public class Frame extends JFrame implements KeyListener, MouseListener, MouseMotionListener{

	private BufferStrategy strat;
	private int JHeight, JWidth;
	int mouseX = 0;
	int mouseY = 0;
	int mousemoveX = 0;
	int mousemoveY = 0;
	RainParticle[] particles = new RainParticle[1000];
    int FPS = 0;
    int FPSCount = 0;
    long FPSStartTime = 0;
    
	public Frame()
	{
		super("Game");
		setResizable(false);
		setLocationRelativeTo(null);
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
		super.paintComponents(g);
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
		for(int i = 0; i < particles.length; i++)
		{
		   particles[i].Update(JHeight);
		}
	}

	public void Draw(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, JWidth, JHeight);
		
		for(int i = 0; i < particles.length; i++)
		{
		   particles[i].Draw(g);
		}
	}

	@Override
	public void keyPressed(KeyEvent keyState) {
	}

	@Override
	public void keyReleased(KeyEvent keyState) {
	}

	@Override
	public void keyTyped(KeyEvent keyState) {
		System.out.println("Char: " + keyState.getKeyChar() + " Code: " +keyState.getKeyCode());
		ClientTest test = new ClientTest();
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
