package me.security;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import java.awt.image.BufferStrategy;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import me.Game.Main;
import me.Other.*;

public class LoginWindow extends JFrame implements MouseListener, KeyListener{
	private JTextField Username;
	private JPasswordField Password;
	private JButton loginbutton;
	private JButton overridelogin;
	private JButton createAccount;
	private JLabel or;
	private BufferStrategy strat;
	private JLabel LoginButton_01;
	private JLabel LoginButton_02;
	private JLabel LoginButton_03;
	private JLabel RegisterButton_01;
	private JLabel RegisterButton_02;
	private JLabel RegisterButton_03;
	private JLabel background;
	private int mouseX, mouseY;
	
	public LoginWindow(){
		setSize(800, 600);
		setResizable(false);

		
		setLayout(new BorderLayout());
		background = new JLabel(ResourceLoader.Iconload("/main_01.jpg"));
		background.setBounds(0, 0, 800, 600);
		add(background);
		
		background.setLayout(null);
		
		
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
		
		LoginButton_01=new JLabel(ResourceLoader.Iconload("/login_01.jpg"));
		LoginButton_02=new JLabel(ResourceLoader.Iconload("/login_02.jpg"));
		LoginButton_03=new JLabel(ResourceLoader.Iconload("/login_03.jpg"));
		RegisterButton_01=new JLabel(ResourceLoader.Iconload("/register_01.jpg"));
		RegisterButton_02=new JLabel(ResourceLoader.Iconload("/register_02.jpg"));
		RegisterButton_03=new JLabel(ResourceLoader.Iconload("/register_03.jpg"));
		
		LoginButton_01.setBounds(499, 433, 170, 97);
		LoginButton_02.setBounds(560, 410, 170, 97);
		LoginButton_03.setBounds(499, 433, 170, 97);
		background.add(LoginButton_01);
		
		RegisterButton_01.setBounds(125, 433, 170, 97);
		RegisterButton_02.setBounds(125, 433, 170, 97);
		RegisterButton_03.setBounds(125, 433, 170, 97);
		background.add(RegisterButton_01);
	}
	
	public void initialize()
	{
		makestrat();

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
		
		//System.out.println(mouseX + " " + mouseY);
		
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
		g.drawImage(ResourceLoader.ImageLoad("/main_01.jpg"), 0, 0, null);
		
		PointerInfo a = MouseInfo.getPointerInfo();
		Point point = new Point(a.getLocation());
		int mouseX = (int) point.getX()-3;
		int mouseY = (int) point.getY()-25;
		if(((mouseX >= 499) && (mouseX <=  669)) && ((mouseY >= 433)&&( mouseY <= 530))){
			g.drawImage(ResourceLoader.ImageLoad("/login_02.jpg"), 499, 430, null);
			System.out.println("true");
		}else{
			g.drawImage(ResourceLoader.ImageLoad("/login_01.jpg"), 499, 430, null);
		}
	}
	
	private class thehandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == loginbutton){
				
			}
			
			if(event.getSource() == overridelogin){
				
			}
			
			if(event.getSource() == createAccount){
				
			}
		
		}
		
	}
	
	public void mouseMoved(MouseEvent event)
	{
	    mouseY = event.getY()-25;
	    mouseX = event.getX()-3;
	    System.out.println(mouseY + " " + mouseX);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		PointerInfo a = MouseInfo.getPointerInfo();
		Point point = new Point(a.getLocation());
		SwingUtilities.convertPointFromScreen(point, e.getComponent());
		double mouseX = (int) point.getX()-3;
		double mouseY = (int) point.getY()-25;	
		System.out.println("Mouse clicked! X: " + mouseX + " Y: " + mouseY);
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
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
