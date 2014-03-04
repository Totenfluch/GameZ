package me.Other;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
import me.security.DataCrypter;
import me.security.LoginWindow;

public class OtherStuff {
	public static String[] scores = new String[103];
	public static String[] news = new String[9999];

	public static void openwebsite(String url){
		try {
			Desktop dt = Desktop.getDesktop();
			URI uri = new URI(url);
			dt.browse(uri.resolve(uri));

		} catch (Exception e) {
			e.printStackTrace();
		}
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
		for(int i = 0; i<100 ; i++ ){
			scores[i] = "--- Empty ---";
		}
		try{
			URL oracle = new URL("https://dl.dropboxusercontent.com/u/88851086/MOTD.txt");
			BufferedReader in = new BufferedReader(
					new InputStreamReader(oracle.openStream()));

			String inputLine;
			int p = 0;
			while ((inputLine = in.readLine()) != null){
				LoginWindow.MOTD.append(inputLine + "\n");

				if(p < 100 && p > 1){
					scores[p-2] = inputLine;
				}
				p++;
			}
			p = 0;
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
		if(Client.IsConnectedToServer == false){
			String host = "188.194.13.44";
			int port = Integer.parseInt("9977");
			@SuppressWarnings("unused")
			final Client chatframe = new Client(host, port);
		}
		Client.processMessage("/pushscore " + username + " " + score);
	}

	public static void MakeValid(){
		try{
			URL oracle = new URL("https://dl.dropboxusercontent.com/u/88851086/GameZVersion.txt");
			BufferedReader in = new BufferedReader(
					new InputStreamReader(oracle.openStream()));

			String inputLine;
			while ((inputLine = in.readLine()) != null){
				if(Double.valueOf(inputLine) <= Main.Version){
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
						openwebsite("https://dl.dropboxusercontent.com/u/88851086/Reflection.jar");
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
			int i = 0;
			String inputLine;
			while ((inputLine = in.readLine()) != null){
				LoginWindow.trueMOTD.append(inputLine + "\n");
				news[i] = inputLine;
				i++;
			}               
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static String TheNormalTime(){
		Calendar cal = Calendar.getInstance();
		cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String time = sdf.format(cal.getTime());
		String currenttime =  time ;
		return currenttime;
	}

	public static void ReadStatsFromFile(){
		String filepath = System.getenv().get("APPDATA") + "\\Reflection\\Stats.txt";
		String folderpath = System.getenv().get("APPDATA") + "\\Reflection";
		File file = new File(filepath);
		if(file.exists()){
			try{
				BufferedReader br = new BufferedReader(new FileReader(filepath));

				String inputLine;
				int i = 0;
				while ((inputLine = br.readLine()) != null){
					String[] temp;
					temp = inputLine.split(" ");
					inputLine = temp[0];
					
					if(i == 0){
						StatSaver.TimesPlayed = Integer.parseInt(DataCrypter.decrypt2(inputLine));
					}else if(i == 1){
						StatSaver.MaxScore = Integer.parseInt(DataCrypter.decrypt2(inputLine));
					}else if(i == 2){
						StatSaver.BestRank = Integer.parseInt(DataCrypter.decrypt2(inputLine));
					}else if(i == 3){
						StatSaver.MostTicksSurvived = Integer.parseInt(DataCrypter.decrypt2(inputLine));
					}else if(i == 4){
						StatSaver.GodModesCollected = Integer.parseInt(DataCrypter.decrypt2(inputLine));
					}else if(i == 5){
						StatSaver.TimesDied = Integer.parseInt(DataCrypter.decrypt2(inputLine));
					}else if(i == 6){
						StatSaver.BestLevel = Integer.parseInt(DataCrypter.decrypt2(inputLine));
					}
					i++;			
				}
				if(i!=7){
					StatSaver.TimesPlayed = 0;
					StatSaver.MaxScore = 0;
					StatSaver.BestRank = 0;
					StatSaver.MostTicksSurvived = 0;
					StatSaver.GodModesCollected = 0;
					StatSaver.TimesDied = 0;
					StatSaver.BestLevel = 0;
					JOptionPane.showMessageDialog(null, "Thanks for editing the Stats.txt! you've broken it now ! Congratulations! Delete it to reset it...");
				}
				i = 0;
				br.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}else{
			File gameFolder = new File(folderpath);
			if (!gameFolder.exists()) {
			    // Folder doesn't exist. Create it
			    if (gameFolder.mkdir()) {
			        // Folder created
			        File gameFile = new File(filepath);
			        if (!gameFile.exists()) {
			            // File doesn't exists, create it
			            try {
			                if (gameFile.createNewFile()) {
			                    // mGameFile created in %APPDATA%\myGame !
			                }
			                else {
			                    // Error
			                }
			            } catch (IOException ex) {
			                // Handle exceptions here
			            }
			        }
			        else {
			            // File exists
			        }
			    }
			    else {
			        // Error
			    }
			}
			else {
			    // Folder exists
			}
			
			PrintWriter out = null;
			try {
				out = new PrintWriter(new BufferedWriter(new FileWriter(filepath, true)));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			out.println(DataCrypter.encrypt2("0"));
			out.println(DataCrypter.encrypt2("0"));
			out.println(DataCrypter.encrypt2("0"));
			out.println(DataCrypter.encrypt2("0"));
			out.println(DataCrypter.encrypt2("0"));
			out.println(DataCrypter.encrypt2("0"));
			out.println(DataCrypter.encrypt2("0"));
			out.close();
			
			StatSaver.TimesPlayed = 0;
			StatSaver.MaxScore = 0;
			StatSaver.BestRank = 0;
			StatSaver.MostTicksSurvived = 0;
			StatSaver.GodModesCollected = 0;
			StatSaver.TimesDied = 0;
			StatSaver.BestLevel = 0;
			
		}
	}

	public static void SaveStatsToFile(){
		StatSaver.waitfortask = true;
		String filepath = System.getenv().get("APPDATA") + "\\Reflection\\Stats.txt";
		try {
			File file = new File(filepath);
			file.delete();
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		PrintWriter out;
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter(filepath, true)));
			out.println(DataCrypter.encrypt2(""+StatSaver.TimesPlayed));
			out.println(DataCrypter.encrypt2(""+StatSaver.MaxScore));
			out.println(DataCrypter.encrypt2(""+StatSaver.BestRank));
			out.println(DataCrypter.encrypt2(""+StatSaver.MostTicksSurvived));
			out.println(DataCrypter.encrypt2(""+StatSaver.GodModesCollected));
			out.println(DataCrypter.encrypt2(""+StatSaver.TimesDied));
			out.println(DataCrypter.encrypt2(""+StatSaver.BestLevel));
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		StatSaver.waitfortask = false;
	}


}