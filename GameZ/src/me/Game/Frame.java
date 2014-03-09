package me.Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import me.Other.OtherStuff;
import me.Other.RememberMeClass;
import me.Other.ResourceLoader;
import me.Other.StatSaver;
import me.Sound.Sound;
import me.Totenfluch.TServerClient.Client;
import me.security.Login;

public class Frame extends JFrame implements KeyListener, MouseListener, MouseMotionListener{

	private static final long serialVersionUID = 1L;
	private BufferStrategy strat;
	private static int JHeight;
	private static int JWidth;
	int mouseX = 0;
	int mouseY = 0;
	int mousemoveX =  0;
	int mousemoveY =  0;
	private static boolean MouseInDashboard = false;
	RainParticle[] particles = new RainParticle[100];
	int gamespeed = 2;
	private int PlusScore = 0;

	private int Score = 0;
	private int AntiCheat1 = -10;
	public static boolean scoreboard = false;
	private int tickdiff = 0;
	private int ticks = 0;
	private int AntiCheat2 = 0;

	private boolean lost = false;

	private int pausediff = 0;

	private boolean backgroundon = true;

	private Font ftDefault = new Font("TimesRoman", Font.PLAIN, 20);

	private boolean disco = false;
	private Color colorrng[] = {Color.red, Color.blue, Color.BLACK, Color.GRAY, Color.BLUE, Color.CYAN, Color.MAGENTA, Color.YELLOW, Color.WHITE, Color.LIGHT_GRAY, Color.darkGray}; 
	private int deescalate = 0;
	private Color currentbackground = null;
	private Color currentdestroyercolor = Color.RED;

	private int[] StartScoreLevel = {0, 10000, 20000, 25000, 30000, 40000, 60000, 80000, 85000, 100000, 115000, 10000000};
	//								 1 		2 	 3	    4 	   5 	   6     7     8	   9	   10      11      1337

	private int Leveluptickdiff = 0;
	private boolean ShowLevelUp = false;

	private int GodMode = 300;

	private boolean GodModePowerup = false;
	private int godmodesequence = 1;
	private int godmodesequencecount = 150;
	private int GodModePowerupballx = OtherStuff.randInt(100, 1000);
	private int GodModePowerupbally = OtherStuff.randInt(100, 600);
	private boolean GodModePowerupballactive = false;

	private int DestroyersOnline = 10;
	public static int[][] Destroyer = new int[999][2];

	private int Destroyers2Online = 10;
	public static int[][] Destroyer2 = new int[999][2];

	private int CubeDestroyerOnline = 0;
	public static int[][] CubeDestroyer = new int[999][2];

	private int WallDestroyerAmount = 30;
	private int[][] DestroyerWall = new int[WallDestroyerAmount+1][2];
	private int DestroyerWallXorY = 1;
	private int DestroyerWallMorP = 1;

	private int CircleDestestroyerAmount = 60;
	private double[] CircleDestroyerPos = new double[CircleDestestroyerAmount+1];
	private double[][] CircleDestroyer = new double[CircleDestestroyerAmount+1][2];
	private int CirclePointState = 270;

	private int SpiralDestestroyerAmount = 12;
	private double[][] SpiralDestroyer = new double[CircleDestestroyerAmount+1][2];
	private double[] SpiralDestroyerPos =  new double[CircleDestestroyerAmount+1];
	private double SpiralSpeed = 0.025;
	private int SpiralPointDistance = 10;

	private double[][] AreaDestroyerBounds = new double[2][2];

	private int CurrentLevel = 1;
	private String ActiveDestroyers = "1";


	public Frame()
	{
		setTitle("Reflection");
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);

		for(int i = 0; i < CircleDestestroyerAmount; i++){
			for(int b = 0; b < 2; b++){
				CircleDestroyer[i][0] = 510;
				CircleDestroyer[i][1] = 500;
			}
			CirclePointState = 270;
			CircleDestroyerPos[i] = i*10;
		}

		for(int i = 0; i < SpiralDestestroyerAmount; i++){
			for(int b = 0; b < 2; b++){
				SpiralDestroyer[i][0] = 510;
				SpiralDestroyer[i][1] = 500;
			}
			SpiralDestroyerPos[i] = i*SpiralPointDistance;
		}

		for(int i = 0; i < 999; i++){
			for(int b = 0; b < 2; b++){
				if(DestroyersOnline > i){
					Destroyer[i][b] = OtherStuff.randInt(0, 1020);
				}else{
					Destroyer[i][0] = OtherStuff.randInt(0, 1020);
					Destroyer[i][1] = 1;
				}
			}
		}

		for(int i = 0; i < 999; i++){
			for(int b = 0; b < 2; b++){
				if(Destroyers2Online > i){
					Destroyer2[i][b] = OtherStuff.randInt(0, 1020);
				}else{
					Destroyer2[i][0] = OtherStuff.randInt(0, 1020);
					Destroyer2[i][1] = 1;
				}
			}
		}

		for(int i = 0; i < WallDestroyerAmount; i++){
			DestroyerWall[i][0] = 10+(i*10);
			DestroyerWall[i][1] = 1;
		}


		for(int i = 0; i < 999; i++){
			for(int b = 0; b < 2; b++){
				if(CubeDestroyerOnline > i){
					CubeDestroyer[i][b] = OtherStuff.randInt(0, 1020);
				}else{
					CubeDestroyer[i][0] = OtherStuff.randInt(0, 1020);
					CubeDestroyer[i][1] = 1;
				}
			}
		}

	}

	public void initialize()
	{
		makestrat();

		JWidth = getSize().width;
		JHeight = getSize().height;

		addKeyListener(this);
		requestFocus();
		addMouseListener(this);
		addMouseMotionListener(this);

		for(int i = 0; i < particles.length; i++)
		{
			particles[i] = new RainParticle(JWidth, JHeight);
		}
	}

	public void makestrat()
	{
		createBufferStrategy(2);
		strat = getBufferStrategy();
	}

	public void Repaint()
	{
		Graphics g = strat.getDrawGraphics();
		paintComponents(g);
		Draw(g);
		g.dispose();
		strat.show();		
	}

	public void Update()
	{

		if(ActiveDestroyers.contains("1")){
			for(int i = 0; i < DestroyersOnline; i++){
				for(int b = 0; b < 2; b++){
					Destroyer[i][b] = Destroyer[i][b] + OtherStuff.randInt(1, gamespeed);

					if(Destroyer[i][0] > 1020){
						Destroyer[i][0] = 0;
					}else if(Destroyer[i][0] < 0){
						Destroyer[i][0] = 1020;
					}

					if(Destroyer[i][1] > 590){
						Destroyer[i][1] = 0;
					}else if(Destroyer[i][1] < 0){
						Destroyer[i][1] = 590;
					}
				}
			}

			for(int i = 0; i < Destroyers2Online; i++){
				for(int b = 0; b < 2; b++){
					Destroyer2[i][b] = Destroyer2[i][b] - OtherStuff.randInt(1, gamespeed);

					if(Destroyer2[i][0] > 1020){
						Destroyer2[i][0] = 0;
					}else if(Destroyer2[i][0] < 0){
						Destroyer2[i][0] = 1020;
					}

					if(Destroyer2[i][1] > 590){
						Destroyer2[i][1] = 0;
					}else if(Destroyer2[i][1] < 0){
						Destroyer2[i][1] = 590;
					}
				}
			}

			for(int c = 0; c < DestroyersOnline; c++){
				if(((Destroyer[c][0] - mousemoveX < 7 && Destroyer[c][0] - mousemoveX > -7) && (Destroyer[c][1] - mousemoveY < 7 && Destroyer[c][1] - mousemoveY > -7))){
					ForceDeath(c, 1);
				}else if(((GodModePowerupballx - mousemoveX < 7 && GodModePowerupballx - mousemoveX > -7) && (GodModePowerupbally - mousemoveY < 7 && GodModePowerupbally - mousemoveY > -7))  && GodModePowerupballactive == true){
					TriggerGodMode();
				}

			}

			for(int d = 0; d < Destroyers2Online; d++){
				if(((Destroyer2[d][0] - mousemoveX < 7 && Destroyer2[d][0] - mousemoveX > -7) && (Destroyer2[d][1] - mousemoveY < 7 && Destroyer2[d][1] - mousemoveY > -7 ))){
					ForceDeath(d, 2);
				}else if(((GodModePowerupballx - mousemoveX < 7 && GodModePowerupballx - mousemoveX > -7) && (GodModePowerupbally - mousemoveY < 7 && GodModePowerupbally - mousemoveY > -7))  && GodModePowerupballactive == true){
					TriggerGodMode();
				}
			}

			if(OtherStuff.randInt(1, 500-gamespeed*35) == 25){
				Destroyers2Online++;
			}else if(OtherStuff.randInt(1, 500-gamespeed*35) == 26){
				DestroyersOnline++;
			}
		}

		if(ActiveDestroyers.contains("2")){
			for(int i = 0; i < CubeDestroyerOnline; i++){
				for(int b = 0; b < 2; b++){
					if(b==0){
						CubeDestroyer[i][b] = CubeDestroyer[i][b] + OtherStuff.randInt(1, gamespeed);
					}else if(b==1){
						CubeDestroyer[i][b] = CubeDestroyer[i][b] - OtherStuff.randInt(1, gamespeed);
					}

					if(CubeDestroyer[i][0] > 1020){
						CubeDestroyer[i][0] = 0;
					}else if(CubeDestroyer[i][0] < 0){
						CubeDestroyer[i][0] = 1020;
					}

					if(CubeDestroyer[i][1] > 590){
						CubeDestroyer[i][1] = 0;
					}else if(CubeDestroyer[i][1] < 0){
						CubeDestroyer[i][1] = 590;
					}
				}
			}

			for(int e = 0; e < CubeDestroyerOnline; e++){
				if(((CubeDestroyer[e][0] - mousemoveX < 7 && CubeDestroyer[e][0] - mousemoveX > -7) && (CubeDestroyer[e][1] - mousemoveY < 7 && CubeDestroyer[e][1] - mousemoveY > -7 ))){
					ForceDeath(e, 3);
				}else if(((GodModePowerupballx - mousemoveX < 7 && GodModePowerupballx - mousemoveX > -7) && (GodModePowerupbally - mousemoveY < 7 && GodModePowerupbally - mousemoveY > -7))  && GodModePowerupballactive == true){
					TriggerGodMode();
				}
			}

			if(OtherStuff.randInt(1, 400-gamespeed*35) == 1 && Score > StartScoreLevel[1]){
				CubeDestroyerOnline ++;
			}
		}

		if(ActiveDestroyers.contains("3")){
			for(int i = 0; i < WallDestroyerAmount; i++){
				for(int b = 0; b < 2; b++){
					if(DestroyerWallXorY == 1 && DestroyerWallMorP == 1){
						DestroyerWall[i][1] = DestroyerWall[i][1] + gamespeed+5;
					}else if(DestroyerWallXorY == 0 && DestroyerWallMorP == 1){
						DestroyerWall[i][0] = DestroyerWall[i][0] + gamespeed+5;
					}else if(DestroyerWallXorY == 1 && DestroyerWallMorP == 0){
						DestroyerWall[i][1] = DestroyerWall[i][1] - (gamespeed+5);
					}else if(DestroyerWallXorY == 0 && DestroyerWallMorP == 0){
						DestroyerWall[i][0] = DestroyerWall[i][0] - (gamespeed+5);
					}

					if(DestroyerWall[i][1] > 595 && DestroyerWallXorY == 1 && DestroyerWallMorP == 1 ){
						for(int c = 0 ; c < WallDestroyerAmount; c++){
							DestroyerWall[c][0] = 1;
							DestroyerWall[c][1] = 600-(5+(c*10));
						}
						DestroyerWallXorY = 0;
						DestroyerWallMorP = 1;
					}else if(DestroyerWall[i][0] > 1020  && DestroyerWallXorY == 0 && DestroyerWallMorP == 1 ){
						for(int c = 0 ; c < WallDestroyerAmount; c++){
							DestroyerWall[c][0] = 1020-(5+(c*10));
							DestroyerWall[c][1] = 600;
						}
						DestroyerWallXorY = 1;
						DestroyerWallMorP = 0;
					}else if(DestroyerWall[i][1] < 0 && DestroyerWallXorY == 1 && DestroyerWallMorP == 0){
						for(int c = 0 ; c < WallDestroyerAmount; c++){
							DestroyerWall[c][0] = 1020;
							DestroyerWall[c][1] = 1+(c*10);
						}
						DestroyerWallXorY = 0;
						DestroyerWallMorP = 0;	
					}else if(DestroyerWall[i][0] < 0 && DestroyerWallXorY == 0 && DestroyerWallMorP == 0){
						for(int c = 0 ; c < WallDestroyerAmount; c++){
							DestroyerWall[c][0] = 10+(c*10);
							DestroyerWall[c][1] = 1;
						}
						DestroyerWallXorY = 1;
						DestroyerWallMorP = 1;	
					}
				}
			}

			for(int e = 0; e < WallDestroyerAmount; e++){
				if(((DestroyerWall[e][0] - mousemoveX < 7 && DestroyerWall[e][0] - mousemoveX > -7) && (DestroyerWall[e][1] - mousemoveY < 7 && DestroyerWall[e][1] - mousemoveY > -7 ))){
					ForceDeath(e, 4);
				}else if(((GodModePowerupballx - mousemoveX < 7 && GodModePowerupballx - mousemoveX > -7) && (GodModePowerupbally - mousemoveY < 7 && GodModePowerupbally - mousemoveY > -7))  && GodModePowerupballactive == true){
					TriggerGodMode();
				}
			}
		}

		if(ActiveDestroyers.contains("4")){
			for(int i = 0; i < SpiralDestestroyerAmount; i++){
				if(gamespeed > 1){
					SpiralDestroyerPos[i] = SpiralDestroyerPos[i]+SpiralSpeed*(gamespeed/2);
				}else{
					SpiralDestroyerPos[i] = SpiralDestroyerPos[i]+SpiralSpeed;
				}
				double x = 5*SpiralDestroyerPos[i]*Math.cos(SpiralDestroyerPos[i]);
				double y = 5*SpiralDestroyerPos[i]*Math.sin(SpiralDestroyerPos[i]);
				SpiralDestroyer[i][0] = x+510;
				SpiralDestroyer[i][1] = y+250;
				if(SpiralDestroyer[i][0] > 1020 || SpiralDestroyer[i][1] > 1020){
					SpiralDestroyerPos[i] = 0;
				}
			}

			for(int e = 0; e < SpiralDestestroyerAmount; e++){
				if(((SpiralDestroyer[e][0] - mousemoveX < 7 && SpiralDestroyer[e][0] - mousemoveX > -7) && (SpiralDestroyer[e][1] - mousemoveY < 7 && SpiralDestroyer[e][1] - mousemoveY > -7 ))){
					ForceDeath(e, 5);
				}else if(((GodModePowerupballx - mousemoveX < 7 && GodModePowerupballx - mousemoveX > -7) && (GodModePowerupbally - mousemoveY < 7 && GodModePowerupbally - mousemoveY > -7))  && GodModePowerupballactive == true){
					TriggerGodMode();
				}
			}
		}

		if(ActiveDestroyers.contains("5")){
			for(int i = 0; i < CircleDestestroyerAmount; i++){
				double x = 510 + CircleDestroyerPos[i]*Math.cos(Math.toRadians(CirclePointState));
				double y = 250 + CircleDestroyerPos[i]*Math.sin(Math.toRadians(CirclePointState));
				CircleDestroyer[i][0] = x;
				CircleDestroyer[i][1] = y;
			}
			CirclePointState = CirclePointState+(gamespeed/5)+1;
			if(CirclePointState > 360){
				CirclePointState = 0;
			}

			for(int e = 0; e < CircleDestestroyerAmount; e++){
				if(((CircleDestroyer[e][0] - mousemoveX < 7 && CircleDestroyer[e][0] - mousemoveX > -7) && (CircleDestroyer[e][1] - mousemoveY < 7 && CircleDestroyer[e][1] - mousemoveY > -7 ))){
					ForceDeath(e, 6);
				}else if(((GodModePowerupballx - mousemoveX < 7 && GodModePowerupballx - mousemoveX > -7) && (GodModePowerupbally - mousemoveY < 7 && GodModePowerupbally - mousemoveY > -7))  && GodModePowerupballactive == true){
					TriggerGodMode();
				}
			}
		}

		if(ActiveDestroyers.contains("6")){
			for(int i=0; i<1 ; i++){
				AreaDestroyerBounds[i][1]+=0.25;
				AreaDestroyerBounds[i][0]+=0.48;
				if(AreaDestroyerBounds[i][0] > 600){
					AreaDestroyerBounds[i][0] = 0;
				}
				if(AreaDestroyerBounds[i][1] > 1020){
					AreaDestroyerBounds[i][1] = 0;
				}

				if(mousemoveX <= AreaDestroyerBounds[0][0]-1 || mousemoveX >= 1009-AreaDestroyerBounds[0][0] || mousemoveY <= AreaDestroyerBounds[0][1] || mousemoveY >= 590-AreaDestroyerBounds[0][1]){
					ForceDeath(i, 7);
				}
			}	
		}

		if(GodModePowerupballx > 1020){
			GodModePowerupballx = 0;
		}else if(GodModePowerupballx < 0){
			GodModePowerupballx = 1020;
		}

		if(GodModePowerupbally > 590){
			GodModePowerupbally = 0;
		}else if(GodModePowerupbally < 0){
			GodModePowerupbally = 590;
		}

		if(GodModePowerupballactive == true){
			if(godmodesequence == 1){
				GodModePowerupballx = GodModePowerupballx + OtherStuff.randInt(1, 5);
				GodModePowerupbally = GodModePowerupbally + OtherStuff.randInt(1, 5);
				godmodesequencecount--;
				if(godmodesequencecount <= 0){
					godmodesequencecount = 150;
					godmodesequence = OtherStuff.randInt(1, 4);
				}

			}
			else if(godmodesequence == 2){
				GodModePowerupballx = GodModePowerupballx - OtherStuff.randInt(1, 5);
				GodModePowerupbally = GodModePowerupbally - OtherStuff.randInt(1, 5);
				godmodesequencecount--;
				if(godmodesequencecount <= 0){
					godmodesequencecount = 150;
					godmodesequence = OtherStuff.randInt(1, 4);
				}
			}
			else if(godmodesequence == 3){
				GodModePowerupballx = GodModePowerupballx - OtherStuff.randInt(1, 5);
				GodModePowerupbally = GodModePowerupbally + OtherStuff.randInt(1, 5);
				godmodesequencecount--;
				if(godmodesequencecount <= 0){
					godmodesequencecount = 150;
					godmodesequence = OtherStuff.randInt(1, 4);
				}
			}
			else if(godmodesequence == 4){
				GodModePowerupballx = GodModePowerupballx + OtherStuff.randInt(1, 5);
				GodModePowerupbally = GodModePowerupbally - OtherStuff.randInt(1, 5);
				godmodesequencecount--;
				if(godmodesequencecount <= 0){
					godmodesequencecount = 150;
					godmodesequence = OtherStuff.randInt(1, 4);
				}
			}
		}

		if(OtherStuff.randInt(1, 400+gamespeed*80) == 125 && GodModePowerupballactive == false && GodModePowerup == false){
			GodModePowerupballactive = true;
		}

		// Godmode at Level change
		for(int i=0; i<StartScoreLevel.length; i++){
			if(((Score - StartScoreLevel[i] < 25 && Score - StartScoreLevel[i] > -25) && (Score - StartScoreLevel[i] < 25 && Score - StartScoreLevel[i] > -25 )) && GodModePowerup == false && Score > 500){
				TriggerLevelUp();
			}

			else if(Score > StartScoreLevel[CurrentLevel]){
				TriggerLevelUp();
			}
		}

		// Background

		for(int i = 0; i < particles.length; i++)
		{
			particles[i].Update(JHeight);
		}


		// Cheatengine Protect

		if(pausediff < ticks){
			if(GodMode-ticks < 0){
				if(disco == false){
					Score = Score+gamespeed;
					AntiCheat1 = AntiCheat1+gamespeed;
				}else if(disco == true){
					Score = Score+(gamespeed*2);
					AntiCheat1 = AntiCheat1+(gamespeed*2);
				}
				if(ticks < tickdiff){
					Score+=5;
					AntiCheat1+=5;
				}

				if(backgroundon == true){
					Score++;
					AntiCheat1++;
				}
			}
		}

		ticks++;
		AntiCheat2 = ticks*5;

		PlusScore = 0;
		PlusScore = gamespeed;
		if(disco == true){
			PlusScore=gamespeed*2;
		}
		if(backgroundon == true){
			PlusScore++;
		}
		if(ticks < tickdiff){
			PlusScore+=5;
		}

		if(tickdiff < ticks ){
			GodModePowerup = false;
		}

		if(Leveluptickdiff < ticks){
			ShowLevelUp = false;
		}

		AntiCheat();
	}

	public void TriggerLevelUp(){
		GodModePowerupballactive = false;
		GodModePowerup = true;
		tickdiff = ticks+300;
		ShowLevelUp = true;
		CurrentLevel++;
		Leveluptickdiff = ticks+300;
		
		if(CurrentLevel == 1){
			ActiveDestroyers = "1";
		}else if(CurrentLevel == 2){
			ActiveDestroyers = "12";
		}else if(CurrentLevel == 3){
			ActiveDestroyers = "3";
		}else if(CurrentLevel == 4){
			ActiveDestroyers = "13";
		}else if(CurrentLevel == 5){
			ActiveDestroyers = "4";
		}else if(CurrentLevel == 6){
			ActiveDestroyers = "41";
		}else if(CurrentLevel == 7){
			ActiveDestroyers = "432";
		}else if(CurrentLevel == 8){
			ActiveDestroyers = "5";
		}else if(CurrentLevel == 9){
			ActiveDestroyers = "51";
		}else if(CurrentLevel == 10){
			ActiveDestroyers = "524";
		}else if(CurrentLevel == 11){
			ActiveDestroyers = "6";
		}
	}

	public void TriggerGodMode(){
		GodModePowerupballactive = false;
		GodModePowerup = true;
		tickdiff = ticks+300;
		StatSaver.SaveStat("GodModesCollected", 1, 1.0);
	}

	public void RestartGame(){
		StatSaver.SaveStat("TimesPlayed", 1, 1);
		ActiveDestroyers = "1";
		CurrentLevel = 1;
		Score = 0;
		AntiCheat1 = -10;
		AntiCheat2 = 0;
		ticks = 0;
		lost = false;
		gamespeed = 2;
		DestroyersOnline = 10;
		Destroyers2Online = 10;
		tickdiff = 0;
		pausediff = 0;
		GodModePowerupballactive = false;
		GodModePowerup = false;
		godmodesequencecount = 150;
		CubeDestroyerOnline = 0;
		disco = false;
		Sound.playSound("Sound2.wav");
		for(int i = 0; i < 999; i++){
			for(int b = 0; b < 2; b++){
				if(DestroyersOnline < i){
					Destroyer[i][b] = OtherStuff.randInt(0, 1020);
				}else{
					Destroyer[i][0] = OtherStuff.randInt(0, 1020);
				}
			}
		}

		for(int i = 0; i < 999; i++){
			for(int b = 0; b < 2; b++){
				if(Destroyers2Online < i){
					Destroyer2[i][b] = OtherStuff.randInt(0, 1020);
				}else{
					Destroyer2[i][0] = OtherStuff.randInt(0, 1020);
				}
			}
		}

		for(int i = 0; i < 999; i++){
			for(int b = 0; b < 2; b++){
				if(CubeDestroyerOnline < i){
					CubeDestroyer[i][b] = OtherStuff.randInt(0, 1020);
				}else{
					CubeDestroyer[i][0] = OtherStuff.randInt(0, 1020);
				}
			}
		}
	}

	public void Draw(Graphics g)
	{
		if(disco == true){

			g.setColor(currentbackground);
			if(deescalate == 70){
				currentbackground = colorrng[OtherStuff.randInt(0, 10)];
				g.setColor(currentbackground);
				deescalate = 0;
			}

			deescalate++;
		}else{
			g.setColor(Color.BLACK);
		}
		g.fillRect(0, 0, JWidth, JHeight);
		g.drawImage(ResourceLoader.ImageLoad("/dashboard.jpg"), 0, 600, 1020, 200, null);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 

		DrawCenteredString(g, Color.ORANGE, "Level: " + CurrentLevel, JWidth/2, 650);
		DrawCenteredString(g, Color.ORANGE, "Score: " + String.valueOf(Score), JWidth/2, 670);
		DrawCenteredString(g, Color.GRAY, "[+" +gamespeed + " Score/tick] Gamespeed: " + gamespeed + "  Adjust with 1 & 2 (more speed more score!)", JWidth/2, 690);
		DrawCenteredString(g, Color.GRAY, "Destroyers Active: " + String.valueOf(DestroyersOnline+Destroyers2Online+CubeDestroyerOnline), JWidth/2, 710);

		if(backgroundon == true){
			DrawCenteredString(g, Color.GRAY, "[-1 Score/tick] Disable background with '5'", JWidth/2, 730);
		}else{
			DrawCenteredString(g, Color.GRAY, "[+1 Score/tick] Enable background with '5'", JWidth/2, 730);
		}
		if(disco == false){
			DrawCenteredString(g, Color.GRAY, "[Multiplay Score by 2/tick] Turn Disco on with '9'", JWidth/2, 750);
		}else{
			DrawCenteredString(g, Color.GRAY, "[Divide Score by 2/tick] Disable Disco with '9'", JWidth/2, 750);
		}

		if(pausediff > ticks){
			DrawCenteredString(g, Color.GRAY, "[+Score Locked at 0] For another: " + String.valueOf(pausediff-ticks), JWidth/2, 770);
		}else{
			DrawCenteredString(g, Color.GRAY, "[5s no Score] Press ESC for Pause", JWidth/2, 770);
		}

		if(ticks < 300){
			DrawCenteredString(g, Color.GRAY, "[Score locked at 1] GodMode Time Left: " + String.valueOf(GodMode-ticks), JWidth/2, 790);
		}else if(GodModePowerup == true){
			DrawCenteredString(g, Color.GRAY, "[+5 Score/tick] Special Godmode on! for: " + String.valueOf(tickdiff-ticks), JWidth/2, 790);
			g.setFont(new Font("Impact", Font.PLAIN, 25)); 
			g.setColor(new Color(102, 51, 153));
			g.drawString(String.valueOf(tickdiff-ticks), mousemoveX, mousemoveY);
			if(tickdiff-ticks > 255){
				g.setColor(Color.GREEN);
			}else{
				g.setColor(new Color(0, tickdiff-ticks, 0));
			}
			g.drawRect(5, 26, 1010, 600);
			g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
		}

		g.setFont(new Font("Impact", Font.BOLD, 50));
		g.setColor(Color.GREEN);
		g.drawString("+" + PlusScore, 880, 725);
		g.drawString(""+ticks, 50, 725);
		g.setFont(ftDefault);


		if(GodModePowerupballactive == true){
			g.setColor(Color.PINK);
			g.fillOval(GodModePowerupballx, GodModePowerupbally, 10, 10);
		}

		g.setFont(new Font("TimesRoman", Font.PLAIN, 15)); 
		if(!Client.IsConnectedToServer == false){
			g.setColor(Color.GREEN);
			g.drawString("Connected to ScoreServer!", 850, 785);
		}else if(Client.disconnected == false){
			g.setColor(Color.RED);
			g.drawString("(" + Main.SecoundsToTimeout + ") Not Connected to ScoreServer!", 530, 785);
		}else{
			g.setColor(Color.RED);
			g.drawString("Disconnected.", 890, 785);
		}

		if(ShowLevelUp == true){
			ftDefault = new Font("Impact", Font.BOLD, 35);
			g.setFont(ftDefault);
			DrawCenteredString(g, Color.ORANGE, "Level up!", JWidth/2, (JHeight-200)/2);
			ftDefault = new Font("TimesRoman", Font.PLAIN, 20); 
			g.setFont(ftDefault);
		}

		if(lost == true){
			g.setColor(Color.CYAN);
			g.fillOval(mousemoveX, mousemoveY, 10, 10);
		}else if(MouseInDashboard == true){
			g.setColor(Color.CYAN);
			g.fillOval(mousemoveX, mousemoveY, 10, 10);
		}
		if(lost == false){
			g.setColor(Color.GREEN);
			g.drawString("[CTRL] Scoreboard", 10, 785);
		}

		if(disco == true && deescalate == 69){
			currentdestroyercolor = colorrng[OtherStuff.randInt(0, 10)];
		}

		if(backgroundon == true){
			for(int i = 0; i < particles.length; i++)
			{
				particles[i].Draw(g);
			}
		}

		g.setColor(Color.CYAN);
		g.fillOval(mousemoveX, mousemoveY, 10, 10);

		if(ActiveDestroyers.contains("1")){
			DrawLevel(g, 1);
		}
		if(ActiveDestroyers.contains("2")){
			DrawLevel(g, 2);
		}
		if(ActiveDestroyers.contains("3")){
			DrawLevel(g, 3);
		}
		if(ActiveDestroyers.contains("4")){
			DrawLevel(g, 4);
		}
		if(ActiveDestroyers.contains("5")){
			DrawLevel(g, 5);
		}
		if(ActiveDestroyers.contains("6")){
			DrawLevel(g, 6);
		}
	}

	private void ForceDeath(int c, int origin){
		if(GodMode-ticks < 0 && GodModePowerup == false){
			lost = true;
			Repaint();
			Sound.stopSound();
			Main.GamePaused = true;
			if(Score > StatSaver.MaxScore){
				StatSaver.SaveStat("MaxScore", 3, Score);
			}
			if(ticks >  StatSaver.MostTicksSurvived){
				StatSaver.SaveStat("MostTicksSurvived", 3, ticks);
			}
			StatSaver.SaveStat("TimesDied", 1, 1);
			if(CurrentLevel > StatSaver.BestLevel){
				StatSaver.SaveStat("BestLevel", 3, CurrentLevel);
			}
			double diff = Score/(ticks-300);
			Object[] options = {"Retry",
					"Quit", "Submit Score & Retry", "Submit Score & Quit", "Submit, Logout & Quit", "Return to Main Menu"};
			int n = JOptionPane.showOptionDialog(null,
					"You Faggot Lost!\nYou scored: " + Score + " Points\nIn " + ticks + " ticks.\n" + "Average Difficulty: " + diff ,
					"Question",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,
					options,
					options[0]);

			if(n == 0){
				RestartGame();
				Main.GamePaused = false;
			}else if(n == 1){
				System.exit(0);
			}else if(n == 2){
				OtherStuff.PublishScore(Score, Login.ActiveUser);
				RestartGame();
				Main.GamePaused = false;
			}else if(n == 3){
				OtherStuff.PublishScore(Score, Login.ActiveUser);
				JOptionPane.showMessageDialog(null, "Score published! bye");
				System.exit(0);
			}else if(n == 4){
				RememberMeClass.RememberMeLogout();
				System.exit(0);
			}else if( n == 5){
				Main.OpenMainMenu();
				setVisible(false);
				RestartGame();
				Main.GamePaused = true;
				MainMenu.Refresh();
			}else{
				RestartGame();
				Main.frame = null;
				Main.GamePaused = false;
			}
		}else{
			if(GodMode-ticks < 0){
				if(pausediff < ticks){
					if(origin == 1){
						Destroyer[c][0] = 1;
						Score = Score+500;
						AntiCheat1 = AntiCheat1+500;
					}else if(origin == 2){
						Destroyer2[c][0] = 1;
						Score = Score+500;
						AntiCheat1 = AntiCheat1+500;
					}else if(origin == 3){
						CubeDestroyer[c][0] = 1;
						Score = Score+750;
						AntiCheat1 = AntiCheat1+750;
					}
				}
			}
		}
	}


	private void DrawLevel(Graphics g, int level){
		if(level == 1){
			for(int i = 0; i < DestroyersOnline; i++){
				if(GodMode-ticks > 0 || GodModePowerup == true){
					g.setColor(Color.GREEN);
				}else if(disco == true){
					g.setColor(currentdestroyercolor);
				}else{
					g.setColor(Color.RED);
				}
				g.fillOval(Destroyer[i][0], Destroyer[i][1], 10, 10);
			}

			for(int i = 0; i < Destroyers2Online; i++){
				if(GodMode-ticks > 0 || GodModePowerup == true ){
					g.setColor(Color.GREEN);
				}else if(disco == true){
					g.setColor(currentdestroyercolor);
				}else{
					g.setColor(Color.YELLOW);
				}
				g.fillOval(Destroyer2[i][0], Destroyer2[i][1], 10, 10);
			}
		}else if(level == 2){
			for(int i = 0; i < CubeDestroyerOnline; i++){
				if(GodMode-ticks > 0 || GodModePowerup == true){
					g.setColor(Color.GREEN);
				}else if(disco == true){
					g.setColor(currentdestroyercolor);
				}else{
					g.setColor(Color.YELLOW);
				}
				g.fillRect(CubeDestroyer[i][0], CubeDestroyer[i][1], 10, 10);
			}
		}else if(level == 3){
			for(int i = 0; i < WallDestroyerAmount; i++){
				if(GodMode-ticks > 0 || GodModePowerup == true){
					g.setColor(Color.GREEN);
				}else if(disco == true){
					g.setColor(currentdestroyercolor);
				}else{
					g.setColor(Color.darkGray);
				}
				g.fillOval(DestroyerWall[i][0], DestroyerWall[i][1], 10, 10);
			}
		}
		else if(level == 4){
			g.setColor(Color.YELLOW);
			for(int i = 0; i < SpiralDestestroyerAmount; i++){
				if(GodMode-ticks > 0 || GodModePowerup == true){
					g.setColor(Color.GREEN);
				}else if(disco == true){
					g.setColor(currentdestroyercolor);
				}else{
					g.setColor(Color.ORANGE);
				}
				if(SpiralDestroyer[i][1] < 600){
					g.drawOval((int)Math.floor(SpiralDestroyer[i][0]), (int)Math.floor(SpiralDestroyer[i][1]), 10, 10);
				}
			}

		}
		else if(level == 5){
			g.setColor(Color.RED);
			for(int i = 0; i < CircleDestestroyerAmount; i++){
				if(GodMode-ticks > 0 || GodModePowerup == true){
					g.setColor(Color.GREEN);
				}else if(disco == true){
					g.setColor(currentdestroyercolor);
				}else{
					g.setColor(Color.ORANGE);
				}
				if(CircleDestroyer[i][1] < 600){
					g.drawOval((int)Math.floor(CircleDestroyer[i][0]), (int)Math.floor(CircleDestroyer[i][1]), 10, 10);
				}
			}
		}
		else if(level == 6){
			if(GodMode-ticks > 0 || GodModePowerup == true){
				g.setColor(Color.GREEN);
				g.fillRect(0, 0, 1020, (int) AreaDestroyerBounds[0][1]);
				g.fillRect((int) (1020-AreaDestroyerBounds[0][0]), 0, (int) AreaDestroyerBounds[0][0], 600);
				g.fillRect(0, (int)(600-AreaDestroyerBounds[0][1]), 1020, (int)(AreaDestroyerBounds[0][1]));
				g.fillRect(0, 0, (int)(AreaDestroyerBounds[0][0]), 600);
			}else if(disco == true){
				g.setColor(currentdestroyercolor);
				g.fillRect(0, 0, 1020, (int) AreaDestroyerBounds[0][1]);
				g.fillRect((int) (1020-AreaDestroyerBounds[0][0]), 0, (int) AreaDestroyerBounds[0][0], 600);
				g.fillRect(0, (int)(600-AreaDestroyerBounds[0][1]), 1020, (int)(AreaDestroyerBounds[0][1]));
				g.fillRect(0, 0, (int)(AreaDestroyerBounds[0][0]), 600);
			}else{
				g.setColor(Color.RED);
				g.fillRect(0, 0, 1020, (int) AreaDestroyerBounds[0][1]);
				g.setColor(Color.YELLOW);
				g.fillRect((int) (1020-AreaDestroyerBounds[0][0]), 0, (int) AreaDestroyerBounds[0][0], 600);
				g.setColor(Color.ORANGE);
				g.fillRect(0, (int)(600-AreaDestroyerBounds[0][1]), 1020, (int)(AreaDestroyerBounds[0][1]));
				g.setColor(Color.darkGray);
				g.fillRect(0, 0, (int)(AreaDestroyerBounds[0][0]), 600);
			}
		}
	}

	private void DrawCenteredString(Graphics g, Color color, String s, int xPos, int yPos){
		FontMetrics fm = getFontMetrics(ftDefault);
		Rectangle2D textsize = fm.getStringBounds(s, g);
		xPos = (int) ((JWidth - textsize.getWidth()) / 2);
		g.setColor(color);
		g.drawString(s, xPos, yPos);
	}

	private void AntiCheat(){
		if(GodMode != 300 || AntiCheat2/5 != ticks || tickdiff > ticks + 301 || Score != AntiCheat1+10 || gamespeed>10){
			System.out.println("Score:" + Score + " Anticheat1: " + AntiCheat1);
			Client.processMessage("/IamUsingCheatEngine");
			JOptionPane.showMessageDialog(null, "CHEATENGINE GAYYYYYYYYYYYY");
			System.exit(0);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_1){
			if(gamespeed < 10){
				gamespeed++;
			}
		}
		if(key == KeyEvent.VK_2){
			if(gamespeed >= 2){
				gamespeed--;
			}
		}
		if(key == KeyEvent.VK_5){
			if(backgroundon == true){
				backgroundon = false;
			}else if(backgroundon == false){
				backgroundon = true;
			}
		}
		if(key == KeyEvent.VK_9){
			if(disco == true){
				disco = false;
			}else if(disco == false){
				disco = true;
			}
		}
		if(key == KeyEvent.VK_CONTROL){
			Main.OpenScoreBoard();
			//Main.GamePaused = true;
		}
		if(key == KeyEvent.VK_ESCAPE){
			Main.GamePaused = true;
			pausediff = ticks+300;
			Object[] options = {"Resume",
					"Quit", "Logout and Quit"};
			int n = JOptionPane.showOptionDialog(null,
					"Game Paused",
					"Pause",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.INFORMATION_MESSAGE,
					null,
					options,
					options[0]);

			if(n == 0){
				Main.GamePaused = false;
			}else if(n == 1){
				System.exit(1);
			}else if(n ==2){
				RememberMeClass.RememberMeLogout();
				System.exit(0);
			}else{
				Main.GamePaused = false;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_CONTROL){
			Main.CloseScoreBoard();
			Main.GamePaused = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}

	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getY() > 594){
			mousemoveY = 594;
			MouseInDashboard = true;
		}else{
			mousemoveY = e.getY()-5;
			MouseInDashboard = false;
		}
		mousemoveX = e.getX()-5;
		Repaint();
	}	

	@Override
	public void mouseMoved(MouseEvent e) {
		if(e.getY() > 594){
			mousemoveY = 594;
			MouseInDashboard = true;
		}else{
			mousemoveY = e.getY()-5;
			MouseInDashboard = false;
		}
		mousemoveX = e.getX()-5;
		Repaint();
	}	
}
