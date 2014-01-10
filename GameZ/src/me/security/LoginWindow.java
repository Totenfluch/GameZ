package me.security;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import me.Game.Main;
import me.Other.*;

public class LoginWindow extends JFrame{
	private JTextField Username;
	private JPasswordField Password;
	private JButton loginbutton;
	private JButton overridelogin;
	private JButton createAccount;
	private JLabel or;
	
	public LoginWindow(){
		setSize(800, 600);
		setResizable(false);
		
		setLayout(new BorderLayout());
		JLabel background=new JLabel(ResourceLoader.Iconload("/LoginBackgroundTest.jpg"));
		background.setSize(800, 600);
		add(background);
		
		background.setLayout(null);
		
		Username = new JTextField("Username", 20);
		Username.setForeground(Color.GREEN);
		Username.setBounds(259, 190, 249, 53);
		Username.setFont(new Font("Serif", Font.BOLD, 30));
		background.add(Username);
		
		Password = new JPasswordField("Password", 20);
		Password.setForeground(Color.GREEN);
		Password.setBounds(259, 297, 249, 53);
		Password.setFont(new Font("Serif", Font.BOLD, 30));
		background.add(Password);
		
		// Replace mim image - der standart button ist hart schwul
		loginbutton = new JButton("   Login   ");
		loginbutton.setBounds(300, 390, 170, 30);
		loginbutton.setForeground(Color.BLACK);
		loginbutton.setFont(new Font("Serif", Font.BOLD, 20));
		background.add(loginbutton);
		
		if(Main.devbuild == true){
			overridelogin = new JButton("Override Login");
			overridelogin.setBounds(300, 440, 170, 30);
			overridelogin.setFont(new Font("Serif", Font.BOLD, 20));
			background.add(overridelogin);
		}else{
			or = new JLabel("or");
			or.setForeground(Color.WHITE);
			or.setBounds(370, 420, 170, 30);
			or.setFont(new Font("Serif", Font.BOLD, 30));
			background.add(or);
			
			createAccount = new JButton("Create Account");
			createAccount.setBounds(300, 460, 170, 30);
			createAccount.setFont(new Font("Serif", Font.BOLD, 20));
			background.add(createAccount);
		}
		
		thehandler handler = new thehandler();
		loginbutton.addActionListener(handler);
		overridelogin.addActionListener(handler);
		createAccount.addActionListener(handler);
		 
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
}
