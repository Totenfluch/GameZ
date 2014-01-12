package me.security;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowListener;
import java.awt.image.BufferStrategy;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import me.Game.Main;
import me.Other.*;

public class LoginWindow extends JFrame implements MouseListener, KeyListener, MouseMotionListener{
	private JComponent Username;
	private JComponent Password;
	private JLabel or;
	private BufferStrategy strat;
	private JLabel background;
	private int mouseX, mouseY;
	private boolean login_button_pressed=false, register_button_pressed=false;
	private JLabel version;
	public static JTextArea MOTD;

	public LoginWindow(){
		setSize(806, 629);
		setResizable(false);

		
		setLayout(new BorderLayout());
		background = new JLabel(ResourceLoader.Iconload("/main_01.jpg"));
		background.setBounds(0, 0, 800, 600);
		add(background);
		
		background.setLayout(null);
		
		version = new JLabel("Epic Login Version: " + String.valueOf(Main.Version));
		version.setForeground(Color.WHITE);
		version.setBounds(12, 606, 100, 20);
		background.add(version);
		
		MOTD = new JTextArea("Welcome to the Epic Login!\n");
		MOTD.setBounds(128, 172, 541, 206);
		MOTD.setEditable(false);
		background.add(MOTD);
		
		Username = new JTextField("", 20);
		Username.setForeground(Color.WHITE);
		Username.setBounds(312, 433, 170, 40);
		Username.setFont(new Font("Impact", Font.BOLD, 25));
		Username.setBackground(Color.BLACK);
		Username.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.BLACK));
		background.add(Username);
		
		Password = new JPasswordField("", 20);
		Password.setForeground(Color.WHITE);
		Password.setBounds(312, 489, 170, 40);
		Password.setBackground(Color.BLACK);
		Password.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.BLACK));
		Password.setFont(new Font("Serif", Font.BOLD, 25));
		background.add(Password);
	}
	
	public void initialize()
	{
		makestrat();

		addKeyListener(this);
		requestFocus();
		addMouseListener(this);
		addMouseMotionListener(this);

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
		
	}

	public void Draw(Graphics g)
	{
		if(((mouseX >= 499) && (mouseX <=  669)) && ((mouseY >= 433)&&( mouseY <= 530))  && login_button_pressed == false && register_button_pressed == false){
			g.drawImage(ResourceLoader.ImageLoad("/login_02.jpg"), 502, 459, null);
		}else if(login_button_pressed == true){
			g.drawImage(ResourceLoader.ImageLoad("/login_03.jpg"), 502, 459, null);
		}else{
			g.drawImage(ResourceLoader.ImageLoad("/login_01.jpg"), 502, 459, null);
		}
		
		if(((mouseX >= 125) && (mouseX <=  295)) && ((mouseY >= 433)&&( mouseY <= 530)) && login_button_pressed == false && register_button_pressed == false){
			g.drawImage(ResourceLoader.ImageLoad("/register_02.jpg"), 125, 459, null);
		}else if(register_button_pressed == true){
			g.drawImage(ResourceLoader.ImageLoad("/register_03.jpg"), 125, 459, null);
		}else{
			g.drawImage(ResourceLoader.ImageLoad("/register_01.jpg"), 125, 459, null);
		}
	}
	
	private class thehandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
		
		}
		
	}
	
	public void mouseMoved(MouseEvent event)
	{
	    mouseY = event.getY()-26;
	    mouseX = event.getX()-3;
	    Repaint();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		PointerInfo a = MouseInfo.getPointerInfo();
		Point point = new Point(a.getLocation());
		SwingUtilities.convertPointFromScreen(point, e.getComponent());
		double mouseX = (int) point.getX();
		double mouseY = (int) point.getY();	
		System.out.println("(ContainerPos) Mouse clicked! X: " + mouseX + " Y: " + mouseY);
		Repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(((mouseX >= 499) && (mouseX <=  669)) && ((mouseY >= 433)&&( mouseY <= 530))){
			login_button_pressed = true;
		}
		
		if(((mouseX >= 125) && (mouseX <=  295)) && ((mouseY >= 433)&&( mouseY <= 530))){
			register_button_pressed = true;
		}
		Repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		login_button_pressed = false;
		register_button_pressed = false;
		Repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		Repaint(); 
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
