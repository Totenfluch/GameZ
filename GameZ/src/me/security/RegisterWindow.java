package me.security;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import me.Other.OtherStuff;
import me.Other.ResourceLoader;

public class RegisterWindow extends JFrame implements MouseMotionListener, MouseListener{
	private static final long serialVersionUID = 1L;
	private JTextField Username;
	private JPasswordField Password;
	private JPasswordField ConfirmPassword;
	private JTextField Email;
	private JTextField BetaKey;
	private JLabel background;
	private JButton RegisterButton;
	public static String lastregisteredusername = "";
	public static String lastregisteredpassword = "";
	
	public RegisterWindow(){
		setTitle("Register Beta account");
		setSize(398, 598);
		setResizable(false);
		setLocationRelativeTo(null);


		setLayout(new BorderLayout());
		background = new JLabel(ResourceLoader.Iconload("/register_window_01.jpg"));
		background.setBounds(0, 0, 410, 610);
		add(background);
		background.setLayout(null);
		
		Username = new JTextField("");
		Username.setForeground(Color.WHITE);
		Username.setBounds(50, 100, 300, 50);
		Username.setFont(new Font("Impact", Font.BOLD, 25));
		Username.setBackground(Color.BLACK);
		Username.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.BLACK));
		background.add(Username);
		
		Password = new JPasswordField("");
		Password.setForeground(Color.WHITE);
		Password.setBounds(50, 175, 300, 50);
		Password.setFont(new Font("Impact", Font.BOLD, 25));
		Password.setBackground(Color.BLACK);
		Password.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.BLACK));
		background.add(Password);
		
		ConfirmPassword = new JPasswordField("");
		ConfirmPassword.setForeground(Color.WHITE);
		ConfirmPassword.setBounds(50, 250, 300, 50);
		ConfirmPassword.setFont(new Font("Impact", Font.BOLD, 25));
		ConfirmPassword.setBackground(Color.BLACK);
		ConfirmPassword.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.BLACK));
		background.add(ConfirmPassword);
		
		Email = new JTextField("");
		Email.setForeground(Color.WHITE);
		Email.setBounds(50, 325, 300, 50);
		Email.setFont(new Font("Impact", Font.BOLD, 25));
		Email.setBackground(Color.BLACK);
		Email.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.BLACK));
		background.add(Email);
		
		BetaKey = new JTextField("");
		BetaKey.setForeground(Color.CYAN);
		BetaKey.setBounds(50, 400, 300, 25);
		BetaKey.setFont(new Font("Serif", Font.ITALIC, 13));
		BetaKey.setBackground(Color.BLACK);
		BetaKey.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.BLACK));
		background.add(BetaKey);
		
		RegisterButton = new JButton(ResourceLoader.Iconload("/register_01.jpg"));
		RegisterButton.setBounds(114, 450, 170, 97);
		background.add(RegisterButton);
		
		thehandler handler = new thehandler();
		RegisterButton.addActionListener(handler);
		
	}
	
	private class thehandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == RegisterButton){
				if(Username.getText().contains(" ") || Username.getText().contains("-") || Username.getText().contains("~") || Username.getText().length() <= 4){
					JOptionPane.showMessageDialog(null, "Invalid Username");
				}else if(!String.valueOf(Password.getPassword()).equals(String.valueOf(ConfirmPassword.getPassword()))){
					JOptionPane.showMessageDialog(null, "Passwords don't match");
				}else if(String.valueOf(Password.getPassword()).length() <= 5 ){
					JOptionPane.showMessageDialog(null, "Password too short");
				}else if(!Email.getText().contains("@") || !Email.getText().contains(".")){
					JOptionPane.showMessageDialog(null, "Invalid Email address");
				}else if(!BetaKey.getText().contains("-") || BetaKey.getText().contains(" ") || BetaKey.getText().length() != 41){
					JOptionPane.showMessageDialog(null, "Invalid BetaKey");
				}else{
					OtherStuff.RegisterMe(Username.getText(), String.valueOf(Password.getPassword()), String.valueOf(ConfirmPassword.getPassword()), Email.getText(), BetaKey.getText());
					lastregisteredpassword = String.valueOf(Password.getPassword());
					lastregisteredusername = Username.getText();
				}
			}
			
		}
		
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
	
	}

}
