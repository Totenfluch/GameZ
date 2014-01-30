package me.Totenfluch.TServerClient;

import java.io.IOException;

import javax.swing.JOptionPane;


public class GetServerMessages{
	public static String newestreply = null;
	public static boolean ActiveScoreConnection = false;

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
			ActiveScoreConnection = true;
		}
		
		else if(message.startsWith("ServerIsShuttingDown")){
			try {
				Client.socket.close();
			} catch (IOException e){
				e.printStackTrace();
			}
			ActiveScoreConnection = false;
		}
		
		else if(message.startsWith("broadcast")){
			String msg = message.replace("broadcast", "");
			msg = message.replace("*", "");
			JOptionPane.showMessageDialog(null, msg);;
		}

	}
}
