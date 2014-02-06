package me.Other;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URI;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import javax.swing.JOptionPane;

import me.Game.Main;
import me.Totenfluch.TServerClient.Client;
import me.Totenfluch.TServerClient.GetServerMessages;
import me.security.LoginWindow;

public class OtherStuff {
	
	public static void openwebsite(String url){
		try {
			Desktop dt = Desktop.getDesktop();
			URI uri = new URI(url);
			dt.browse(uri.resolve(uri));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String TheNormalTime(){
		Calendar cal = Calendar.getInstance();
		cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String time = sdf.format(cal.getTime());
		String closebracket = "[";
		String openbracket = "]";
		String currenttime = closebracket + time + openbracket ;
		return currenttime;
	}

	public static String TheAuthmeTime(){
		Calendar cal = Calendar.getInstance();
		cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
		String time = sdf.format(cal.getTime());
		return time;
	}

	public static int intTheAuthmeTime(){
		Calendar cal = Calendar.getInstance();
		cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
		String time = sdf.format(cal.getTime());
		return Integer.parseInt(time);
	}

	public static int Authmetimer(){
		Calendar cal = Calendar.getInstance();
		cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("ss");
		String time = sdf.format(cal.getTime());
		int intime = Integer.parseInt(time);
		return intime;
	}
	
	public static String getMacAdress(){
		String ComputerMac = null;
		try{
			InetAddress ComputerIP = InetAddress.getLocalHost();
			NetworkInterface network = NetworkInterface.getByInetAddress(ComputerIP);
			byte[] mac = network.getHardwareAddress();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < mac.length; i++) {
				sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
			}
			ComputerMac = sb.toString();

		}catch ( Exception e){
			e.printStackTrace();
		}
		return ComputerMac;
	}
	

	public static void GetMOTD(){
		try{
			URL oracle = new URL("https://dl.dropboxusercontent.com/u/88851086/MOTD.txt");
			BufferedReader in = new BufferedReader(
					new InputStreamReader(oracle.openStream()));

			String inputLine;
			while ((inputLine = in.readLine()) != null){
					LoginWindow.MOTD.append(inputLine + "\n");
			}               
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	

	public static int randInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}
	
	public static void PublishScore(int score, String username){
		if(GetServerMessages.ActiveScoreConnection == false){
			String host = "188.194.13.44";
			int port = Integer.parseInt("9977");
			@SuppressWarnings("unused")
			final Client chatframe = new Client(host, port);
		}
			Client.processMessage("/pushscore " + username + " " + score);
	}
	
	public static void pubscpre(int score, String username){
		Client.processMessage("/pushscore " + username + " " + score);
	}
	
	public static void MakeValid(){
		try{
			URL oracle = new URL("https://dl.dropboxusercontent.com/u/88851086/GameZVersion.txt");
			BufferedReader in = new BufferedReader(
					new InputStreamReader(oracle.openStream()));

			String inputLine;
			while ((inputLine = in.readLine()) != null){
					if(Double.valueOf(inputLine) == Main.Version){
						Main.Valid = true;
					}else{
						Object[] options = {"Update",
								"Quit"};
						int n = JOptionPane.showOptionDialog(null,
								"You don't have the newest Version.\nYour Version: "+Main.Version + " Newest: " + Double.valueOf(inputLine) ,
								"Update Found!",
								JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE,
								null,
								options,
								options[0]);

						if(n == 0){
							openwebsite("https://dl.dropboxusercontent.com/u/88851086/GameZ.jar");
						}
					}
			}               
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void RegisterMe(String Username, String Password, String ConfirmPassword, String Email, String BetaKey){
		Client.processMessage("/register" + " " + Username + " " + Password + " " + Email + " " + BetaKey);
	}

	public static void GettrueMOTD() {
		try{
			URL oracle = new URL("https://dl.dropboxusercontent.com/u/88851086/ReflectionNews.txt");
			BufferedReader in = new BufferedReader(
					new InputStreamReader(oracle.openStream()));

			String inputLine;
			while ((inputLine = in.readLine()) != null){
					LoginWindow.trueMOTD.append(inputLine + "\n");
			}               
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	

}