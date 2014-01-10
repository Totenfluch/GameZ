package me.security;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import me.Other.*;

public class LoginWindow extends JFrame{
	private JTextField Username;
	private JPasswordField Password;
	private JButton login;
	private JButton overridelogin;
	private JButton createAccount;
	
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
		 
	}
}
