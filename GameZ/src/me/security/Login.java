package me.security;


import javax.swing.JOptionPane;


import me.Game.Main;

public class Login {
	static String admin = "Admin";
	static String password = "toten";
	public static String ActiveUser;
	
	public static void LogMeIn(String Username, String Password){
		if(Main.devbuild == true){
			System.out.println(Username + " " + Password);
			if(Username.equals(admin) && Password.equals(password)){
				Main.DisableLoginWindow();
				Main.StartGame();
				ActiveUser = Username;
			}else{
				JOptionPane.showMessageDialog(null, "Incorrect Credicals");
			}
		}else{
			ActiveUser = Username;
			Main.DisableLoginWindow();
			Main.StartGame();
		}
	}
}
