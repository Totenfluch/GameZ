package me.security;


import javax.swing.JOptionPane;




import me.Game.Main;
import me.Other.RememberMeClass;
import me.Totenfluch.TServerClient.Client;

public class Login {
	public static String ActiveUser;

	public static void LogMeIn(String Username, String Password){
		if(!Username.contains(" ") && !Username.contains("Hitler") && !Username.contains("Adolf") && !Username.equals("") && !Username.contains("-") && !Username.contains("<") && !Username.contains(">") && Username.length() >= 5 && Username.length() <= 12){
			if(Main.devbuild == true){
				// Don't check password
				Main.DisableLoginWindow();
				Main.StartGame();
				ActiveUser = Username;
			}else{
				// Check Password here
				ActiveUser = Username;
				Client.processMessage("/login " + Username + " " + Password + " " + Main.ComputerIP + " " + Main.ComputerMac);
				if(LoginWindow.remembermecheckbox.isSelected() == true){
					try {
						RememberMeClass.RememberMeSave(Username, Password);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		}else{
			JOptionPane.showMessageDialog(null, "White Spaces, swear words/names, '-' '<' '>' in names not allowed. Between 6 and 12 Letters");
		}
	}

	public static void truelogin(){
		Main.DisableLoginWindow();
		Main.StartGame();
	}
}
