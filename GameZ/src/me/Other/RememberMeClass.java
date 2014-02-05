package me.Other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import me.Game.Main;
import me.security.DataCrypter;
import me.security.Login;

public class RememberMeClass {
	public static String[] RememberMeCredicals = new String[7];

	public static void RememberMeSave(String Username, String Password){
		String gameFolderPath, gameFilePath;
		gameFolderPath = System.getenv().get("APPDATA") + "\\Reflection";
		gameFilePath = gameFolderPath + "\\RememberMe.txt";
		
		File gameFolder = new File(gameFolderPath);
		if (!gameFolder.exists()) {
		    // Folder doesn't exist. Create it
		    if (gameFolder.mkdir()) {
		        // Folder created
		        File gameFile = new File(gameFilePath);
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
		
	    File file = new File(gameFilePath);    
	    PrintWriter writer = null;
	    try {
	        writer = new PrintWriter(new FileWriter(file, true));
	        writer.println(DataCrypter.encrypt3(Username));
	        writer.println(DataCrypter.encrypt3(Password));
	    } catch (IOException e) {
	        throw new RuntimeException(e);
	    } finally {
	        writer.close();
	    }
		
	}
	
	public static void RememberMeLogout(){
		String Filepath = System.getenv().get("APPDATA") + "\\Reflection\\RememberMe.txt";
		File file = new File(Filepath);
		file.delete();
	}
	
	public static String RememberMeLogin() throws Exception{
		String Filepath = System.getenv().get("APPDATA") + "\\Reflection\\RememberMe.txt";
		File file = new File(Filepath);
		if(file.exists()){
			BufferedReader br = new BufferedReader(new FileReader(Filepath));
		    try {
		        StringBuilder sb = new StringBuilder();
		        String line = br.readLine();
		        int i = 0;
		        while (line != null) {
		            RememberMeCredicals[i] = DataCrypter.decrypt3(line);
		            line = br.readLine();
		            i++;
		        }
		        i = 0;
		        String everything = sb.toString();
		        System.out.println(everything);
		        String logmein = "/login " + RememberMeCredicals[0] + " " + RememberMeCredicals[1] + " "  + Main.ComputerIP + " " + Main.ComputerMac;
		        Login.ActiveUser = RememberMeCredicals[0];
		        return logmein;
		    } finally {
		        br.close();
		    }
		}else{
			return "nop";
		}
	}
}
