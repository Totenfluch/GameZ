package me.Other;

import me.Game.Main;

public class StatSaver {
	public static int TimesPlayed, MaxScore, BestRank, MostTicksSurvived, GodModesCollected, TimesDied, BestLevel;
	public static double[] Statvalues = new double[8];
	public static boolean waitfortask = false;
	public static void UpdateStats(){
		 TimesPlayed = (int) Math.floor(Statvalues[1]);
		 MaxScore = (int) Math.floor(Statvalues[2]);
		 BestRank = (int) Math.floor(Statvalues[3]);
		 MostTicksSurvived = (int) Math.floor(Statvalues[4]);
		 GodModesCollected = (int) Math.floor(Statvalues[5]);
		 TimesDied = (int) Math.floor(Statvalues[6]);
		 BestLevel = (int) Math.floor(Statvalues[7]);
	}
	
	public static void SyncStats(){
		Statvalues[1] = TimesPlayed;
		Statvalues[2] = MaxScore;
		Statvalues[3] = BestRank;
		Statvalues[4] = MostTicksSurvived;
		Statvalues[5] = GodModesCollected;
		Statvalues[6] = TimesDied;
		Statvalues[7] = BestLevel;
	}
	
	public static void SaveStat(String Stat, int Do1Plus2Minus3Set, double amount){
		int dowhat = Do1Plus2Minus3Set;
		int type = 0;
		if(Stat == "TimesPlayed"){
			type = 1;
		}else if(Stat == "MaxScore"){
			type = 2;
		}else if(Stat == "BestRank"){
			type = 3;
		}else if(Stat == "MostTicksSurvived"){
			type = 4;
		}else if(Stat == "GodModesCollected"){
			type = 5;
		}else if(Stat == "TimesDied"){
			type = 6;
		}else if(Stat == "BestLevel"){
			type = 7;
		}else{
			System.out.println("ERROR: false stat name!!!");
		}
		
		if(dowhat == 1){
			Statvalues[type] = Statvalues[type] + amount;
		}else if(dowhat == 2){
			Statvalues[type] = Statvalues[type] - amount;
		}else if(dowhat == 3){
			Statvalues[type] = amount;
		}else{
			System.out.println("ERROR: false dowhat amount!!!");
		}

		UpdateStats();

		
		Main.SaveToFileTimer.start();
		
	}
}
