package me.security;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import me.Game.Frame;
import me.Game.Main;

public class Login {
	static String admin = "Admin";
	static String password = "toten";
	
	public static void LogMeIn(String Username, String Password){
		if(Main.devbuild == true){
			System.out.println(Username + " " + Password);
			if(Username.equals(admin) && Password.equals(password)){
				Main.DisableLoginWindow();
				Main.StartGame();
			}else{
				JOptionPane.showMessageDialog(null, "Incorrect Credicals");
			}
		}else{
			Main.DisableLoginWindow();
			Main.StartGame();
		}
	}
}
