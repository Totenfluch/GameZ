package me.Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferStrategy;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import me.Other.OtherStuff;
import me.Other.ResourceLoader;

public class ScoreboardWindow extends JFrame implements KeyListener, MouseMotionListener, MouseListener{
	private static final long serialVersionUID = 1L;
	private BufferStrategy strat;
	private JButton reloadb;
	private JButton closeboard;
	private boolean reloading = false;
	private Font ftDefault = new Font("TimesRoman", Font.PLAIN, 45);

	@SuppressWarnings("unused")
	public ScoreboardWindow(){
		setSize(900, 650);
		setResizable(false);
		setVisible(false);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setLayout(null);
		ScoreboardPanel Panel = new ScoreboardPanel();
		setOpacity(0.10f);
		reloadb = new JButton();
		Image img = ResourceLoader.ImageLoad("/reload.jpg");
		reloadb.setIcon(new ImageIcon(img));
		reloadb.setBounds(670, 420, 20, 20);
		add(reloadb);

		closeboard = new JButton("Close");
		closeboard.setBounds(590, 420, 70, 20);
		add(closeboard);
		
		thehandler handler = new thehandler();
		reloadb.addActionListener(handler);
		closeboard.addActionListener(handler);
	}

	private class thehandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(arg0.getSource() == reloadb){
				reloading = true;
				Repaint();
				OtherStuff.GetMOTD();
				reloading = false;
				Repaint();
			}
			if(arg0.getSource() == closeboard){
				setVisible(false);
				Main.GamePaused = false;
			}

		}

	}


	public void initialize()
	{
		makestrat();

		addKeyListener(this);
		requestFocus();
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	private void makestrat()
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

	private void Draw(Graphics g) {
		if(reloading == true){
			g.setFont(ftDefault);
			g.drawImage(ResourceLoader.ImageLoad("/scoreboard_loading.png"), 0, 0, 700, 450, null);
			DrawCenteredString(g, Color.GREEN, "...loading scores ø", 350, 225);
		}else{
			g.setColor(new Color(0,0,0,0));
			//g.drawImage(ResourceLoader.ImageLoad("/scoreboard_scores.png"), 0, 0, 700, 450, null);
			//g.drawImage(ResourceLoader.ImageLoad("/scoreboard_01.png"), 0, 0, 900, 650, null);
			g.drawImage(ResourceLoader.ImageLoad("/reload.png"), 670, 420, 20, 20, null);
			g.drawImage(ResourceLoader.ImageLoad("/Close.png"), 590, 420, 70, 20, null);
			for(int b = 0; b<5 ; b++){
				for(int i = 0; i< 20 ; i++){
					g.drawString(OtherStuff.scores[i+(b*19)], 50+(b*125), 25+(i*20));
				}
			}
		}
	}


	private void DrawCenteredString(Graphics g, Color color, String s, int xPos, int yPos){
		FontMetrics fm = getFontMetrics(ftDefault);

		Rectangle2D textsize = fm.getStringBounds(s, g);

		xPos = (int) ((700 - textsize.getWidth()) / 2);

		g.setColor(color);
		g.drawString(s, xPos, yPos);
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {

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
	public void mouseDragged(MouseEvent arg0) {

	}


	@Override
	public void mouseMoved(MouseEvent arg0) {
		Repaint();

	}


	@Override
	public void keyPressed(KeyEvent arg0) {

	}


	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_CONTROL){
			Main.menuframe.setVisible(false);
			Main.GamePaused = false;
			//Main.scoreboardtimer.stop();
		}
	}


	@Override
	public void keyTyped(KeyEvent arg0) {

	}

}
