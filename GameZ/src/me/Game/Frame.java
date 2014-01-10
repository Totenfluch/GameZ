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
import java.awt.image.BufferStrategy;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Frame extends JFrame implements KeyListener, MouseListener{

	private BufferStrategy strat;
	private int JHeight, JWidth;
	private Random rand = new Random();
	int mouseX = 0;
	int mouseY = 0;

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

	}

	public void makestrat()
	{
		createBufferStrategy(2);
		strat = getBufferStrategy();
	}

	public void Repaint()
	{
		Graphics g = strat.getDrawGraphics();
		Draw(g);
		g.dispose();

		strat.show();		
	}

	public void Update()
	{
	}

	public void Draw(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, JWidth, JHeight);

		g.setColor(Color.GREEN);
		g.fillRect(100, 100, 400, 100);
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
}
