package me.Totenfluch.TServerClient;

import java.io.IOException;

import javax.swing.JOptionPane;

import me.Game.Main;
import me.security.Login;
import me.security.LoginWindow;
import me.security.RegisterWindow;


public class GetServerMessages{
	public static String newestreply = null;

	public static void CheckServerMessages(String message){

		if(message.startsWith("YouGotkickednr")){
			JOptionPane.showMessageDialog(null, "Kicked by Server");
			System.exit(0);
		}


		else if(message.startsWith("YouGotkicked")){
			String [] kickreason = message.split(" ");
			if(kickreason.length == 1){
				JOptionPane.showMessageDialog(null, "Kicked by Server");
			}else if(kickreason.length == 2){
				JOptionPane.showMessageDialog(null, "Kicked by Server. Reason: " + kickreason[1]);
			}else{
				JOptionPane.showMessageDialog(null, "Kicked by Server");
			}
			System.exit(0);
		}

		else if(message.startsWith("You are connected to GameZ-Server-1")){
			Client.IsConnectedToServer = true;
		}

		else if(message.startsWith("ServerIsShuttingDown")){
			try {
				Client.socket.close();
			} catch (IOException e){
				e.printStackTrace();
			}
			Client.IsConnectedToServer = false;
		}

		else if(message.startsWith("broadcast")){
			if(message.startsWith("broadcast Your version is no longer supported.")){
				Client.disconnected = true;
				Main.OnlineMode = false;
			}
			String msg = message.replace("broadcast", "");
			msg = message.replace("*", "");
			msg = message.replace("_", " ");
			msg = message.replace("broadcast", "Server: ");
			JOptionPane.showMessageDialog(null, msg);
		}

		else if(message.startsWith("forcelogin")){
			String[] temp = message.split(" ");
			Login.ActiveUser = temp[1];
			Login.truelogin();
		}

		else if(message.equals("Authorized")){
			Login.truelogin();
		}

		else if(message.startsWith("Account") && message.contains("created")){
			Main.CloseRegisterWindow();
			if(LoginWindow.remembermecheckbox.isSelected() == false){
				LoginWindow.Username.setText(RegisterWindow.lastregisteredusername);
				LoginWindow.Password.setText(RegisterWindow.lastregisteredpassword);
				LoginWindow.remembermecheckbox.setSelected(true);
			}

		}
	}
}
