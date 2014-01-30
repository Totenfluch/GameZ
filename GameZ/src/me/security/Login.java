package me.security;


import javax.swing.JOptionPane;


import me.Game.Main;

public class Login {
	static String admin = "Admin";
	static String password = "toten";
	public static String ActiveUser;

	public static void LogMeIn(String Username, String Password){
		if(!Username.contains(" ") && !Username.contains("Hitler") && !Username.contains("Adolf") && !Username.equals("") && !Username.contains("-") && !Username.contains("<") && !Username.contains(">") && Username.length() >= 6 && Username.length() <= 12){
			if(Main.devbuild == true){
				// Don't check password
				Main.DisableLoginWindow();
				Main.StartGame();
				ActiveUser = Username;
			}else{
				// Check Password here
				ActiveUser = Username;
				Main.DisableLoginWindow();
				Main.StartGame();
			}
		}else{
			JOptionPane.showMessageDialog(null, "White Spaces, swear words/names, '-' '<' '>' in names not allowed. Between 6 and 12 Letters");
		}
	}
}
