package me.Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import me.Other.OtherStuff;
import me.Other.RememberMeClass;
import me.Other.ResourceLoader;
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
	int mousemoveX = 0;
	int mousemoveY = 0;
	RainParticle[] particles = new RainParticle[100];
	int gamespeed = 2;

	public static int[][] Destroyer = new int[999][2];
	public static int[][] Destroyer2 = new int[999][2];
	public static int[][] CubeDestroyer = new int[999][2];
	
	private int Score = 0;
	private int AntiCheat1 = -10;
	
	private int ticks = 0;
	private boolean lost = false;
	private int DestroyersOnline = 10;
	private int Destroyers2Online = 10;
	private int CubeDestroyerOnline = 0;
	private int GodMode = 300;
	private boolean GodModePowerup = false;
	private int GodModePowerupballx = OtherStuff.randInt(100, 1000);
	private int GodModePowerupbally = OtherStuff.randInt(100, 600);
	private boolean GodModePowerupballactive = false;
	private int tickdiff = 0;
	private boolean backgroundon = true;
	private boolean disco = false;
	private Color colorrng[] = {Color.red, Color.blue, Color.BLACK, Color.GRAY, Color.BLUE, Color.CYAN, Color.MAGENTA, Color.YELLOW, Color.WHITE, Color.LIGHT_GRAY, Color.darkGray}; 
	private int deescalate = 0;
	private Color currentbackground = null;
	private Color currentdestroyercolor = Color.RED;
	private int pausediff = 0;
	private int godmodesequence = 1;
	private int godmodesequencecount = 150;
	public static boolean scoreboard = false;
	private static boolean MouseInDashboard = false;
	private Font ftDefault = new Font("TimesRoman", Font.PLAIN, 20);
	private int WallDestroyerAmount = 30;
	private int[][] DestroyerWall = new int[WallDestroyerAmount+1][2];
	private int DestroyerWallXorY = 1;
	private int DestroyerWallMorP = 1;
	private int[] StartScoreLevel = {0, 10000, 20000, 25000, 35000, 40000, 60000, 80000, 85000, 100000};
	//								 1 		2 	 3	    4 	   5 	   6     7     8	   9	   10
	private int Leveluptickdiff = 0;
	private boolean ShowLevelUp = false;
	
	private int AntiCheat2 = 0;
	
	private int CircleDestestroyerAmount = 60;
	private double[] CircleDestroyerPos = new double[CircleDestestroyerAmount+1];
	private double[][] CircleDestroyer = new double[CircleDestestroyerAmount+1][2];
	private int CirclePointState = 270;

	private int SpiralDestestroyerAmount = 12;
	private double[][] SpiralDestroyer = new double[CircleDestestroyerAmount+1][2];
	private double[] SpiralDestroyerPos =  new double[CircleDestestroyerAmount+1];
	private double SpiralSpeed = 0.025;
	private int SpiralPointDistance = 10;

	private int CurrentLevel = 1;
	private String ActiveDestroyers = "1";


	public Frame()
	{
		setTitle("Reflection");
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);

		// Set Circles
		for(int i = 0; i < CircleDestestroyerAmount; i++){
			for(int b = 0; b < 2; b++){
				CircleDestroyer[i][0] = 510;
				CircleDestroyer[i][1] = 500;
			}
			CirclePointState = 270;
			CircleDestroyerPos[i] = i*10;
		}

		// Spiral to 0
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
		//Wall Movin
		
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
		}

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

			// Destroyer 2 Move

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
		}


		// CubeDestroyer Move
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
		}

		// GodmodePowerupball walldetection + move

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


		// SpiralDestroyer move
		// SpiralDestroyerPos -> t
		if(ActiveDestroyers.contains("4")){
			for(int i = 0; i < SpiralDestestroyerAmount; i++){
				SpiralDestroyerPos[i] = SpiralDestroyerPos[i]+SpiralSpeed;
				double x = 5*SpiralDestroyerPos[i]*Math.cos(SpiralDestroyerPos[i]);
				double y = 5*SpiralDestroyerPos[i]*Math.sin(SpiralDestroyerPos[i]);
				SpiralDestroyer[i][0] = x+510;
				SpiralDestroyer[i][1] = y+250;
				if(SpiralDestroyer[i][0] > 1020 || SpiralDestroyer[i][1] > 1020){
					SpiralDestroyerPos[i] = 0;
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
		}

		if(ActiveDestroyers.contains("1")){
			for(int c = 0; c < DestroyersOnline; c++){
				if(((Destroyer[c][0] - mousemoveX < 7 && Destroyer[c][0] - mousemoveX > -7) && (Destroyer[c][1] - mousemoveY < 7 && Destroyer[c][1] - mousemoveY > -7))){
					ForceDeath(c, 1);
				}else if(((GodModePowerupballx - mousemoveX < 7 && GodModePowerupballx - mousemoveX > -7) && (GodModePowerupbally - mousemoveY < 7 && GodModePowerupbally - mousemoveY > -7))  && GodModePowerupballactive == true){
					GodModePowerupballactive = false;
					GodModePowerup = true;
					tickdiff = ticks+300;
				}

			}

			for(int d = 0; d < Destroyers2Online; d++){
				if(((Destroyer2[d][0] - mousemoveX < 7 && Destroyer2[d][0] - mousemoveX > -7) && (Destroyer2[d][1] - mousemoveY < 7 && Destroyer2[d][1] - mousemoveY > -7 ))){
					ForceDeath(d, 2);
				}else if(((GodModePowerupballx - mousemoveX < 7 && GodModePowerupballx - mousemoveX > -7) && (GodModePowerupbally - mousemoveY < 7 && GodModePowerupbally - mousemoveY > -7))  && GodModePowerupballactive == true){
					GodModePowerupballactive = false;
					GodModePowerup = true;
					tickdiff = ticks+300;
				}
			}
		}


		if(ActiveDestroyers.contains("2")){
			for(int e = 0; e < CubeDestroyerOnline; e++){
				if(((CubeDestroyer[e][0] - mousemoveX < 7 && CubeDestroyer[e][0] - mousemoveX > -7) && (CubeDestroyer[e][1] - mousemoveY < 7 && CubeDestroyer[e][1] - mousemoveY > -7 ))){
					ForceDeath(e, 3);
				}else if(((GodModePowerupballx - mousemoveX < 7 && GodModePowerupballx - mousemoveX > -7) && (GodModePowerupbally - mousemoveY < 7 && GodModePowerupbally - mousemoveY > -7))  && GodModePowerupballactive == true){
					GodModePowerupballactive = false;
					GodModePowerup = true;
					tickdiff = ticks+300;
				}
			}
		}

		if(ActiveDestroyers.contains("3")){
			for(int e = 0; e < WallDestroyerAmount; e++){
				if(((DestroyerWall[e][0] - mousemoveX < 7 && DestroyerWall[e][0] - mousemoveX > -7) && (DestroyerWall[e][1] - mousemoveY < 7 && DestroyerWall[e][1] - mousemoveY > -7 ))){
					ForceDeath(e, 3);
				}else if(((GodModePowerupballx - mousemoveX < 7 && GodModePowerupballx - mousemoveX > -7) && (GodModePowerupbally - mousemoveY < 7 && GodModePowerupbally - mousemoveY > -7))  && GodModePowerupballactive == true){
					GodModePowerupballactive = false;
					GodModePowerup = true;
					tickdiff = ticks+300;
				}
			}
		}

		if(ActiveDestroyers.contains("4")){
			for(int e = 0; e < SpiralDestestroyerAmount; e++){
				if(((SpiralDestroyer[e][0] - mousemoveX < 7 && SpiralDestroyer[e][0] - mousemoveX > -7) && (SpiralDestroyer[e][1] - mousemoveY < 7 && SpiralDestroyer[e][1] - mousemoveY > -7 ))){
					ForceDeath(e, 3);
				}else if(((GodModePowerupballx - mousemoveX < 7 && GodModePowerupballx - mousemoveX > -7) && (GodModePowerupbally - mousemoveY < 7 && GodModePowerupbally - mousemoveY > -7))  && GodModePowerupballactive == true){
					GodModePowerupballactive = false;
					GodModePowerup = true;
					tickdiff = ticks+300;
				}
			}
		}
		
		if(ActiveDestroyers.contains("5")){
			for(int e = 0; e < CircleDestestroyerAmount; e++){
				if(((CircleDestroyer[e][0] - mousemoveX < 7 && CircleDestroyer[e][0] - mousemoveX > -7) && (CircleDestroyer[e][1] - mousemoveY < 7 && CircleDestroyer[e][1] - mousemoveY > -7 ))){
					ForceDeath(e, 3);
				}else if(((GodModePowerupballx - mousemoveX < 7 && GodModePowerupballx - mousemoveX > -7) && (GodModePowerupbally - mousemoveY < 7 && GodModePowerupbally - mousemoveY > -7))  && GodModePowerupballactive == true){
					GodModePowerupballactive = false;
					GodModePowerup = true;
					tickdiff = ticks+300;
				}
			}
		}


		// Godmode at Level change

		for(int i=0; i<StartScoreLevel.length; i++){
			if(((Score - StartScoreLevel[i] < 25 && Score - StartScoreLevel[i] > -25) && (Score - StartScoreLevel[i] < 25 && Score - StartScoreLevel[i] > -25 )) && GodModePowerup == false && Score > 500){
				TriggerLevelUp();
			}

			if(Score > StartScoreLevel[CurrentLevel+1]){
				TriggerLevelUp();
			}
		}

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

				if(backgroundon == true){
					Score++;
					AntiCheat1++;
				}
			}
		}

		ticks++;
		AntiCheat2 = ticks*5;
		if(Score < StartScoreLevel[2] || Score > StartScoreLevel[3]){
			if(OtherStuff.randInt(1, 500-gamespeed*35) == 25){
				Destroyers2Online++;
			}else if(OtherStuff.randInt(1, 500-gamespeed*35) == 26){
				DestroyersOnline++;
			}else if(OtherStuff.randInt(1, 400+gamespeed*80) == 125 && GodModePowerupballactive == false && GodModePowerup == false){
				GodModePowerupballactive = true;
			}else if(OtherStuff.randInt(1, 400-gamespeed*35) == 1 && Score > StartScoreLevel[1]){
				CubeDestroyerOnline ++;
			}
		}

		if(Score > StartScoreLevel[2])
			if(OtherStuff.randInt(1, 500-gamespeed*35) == 25){
				Destroyers2Online++;
			}else if(OtherStuff.randInt(1, 500-gamespeed*35) == 26){
				DestroyersOnline++;
			}else if(OtherStuff.randInt(1, 400+gamespeed*80) == 125 && GodModePowerupballactive == false && GodModePowerup == false){
				GodModePowerupballactive = true;
			}else if(OtherStuff.randInt(1, 400-gamespeed*35) == 1 && Score > StartScoreLevel[1]){
				CubeDestroyerOnline ++;
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
	}

	public void RestartGame(){
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
		GodModePowerupballactive = false;
		GodModePowerup = false;
		godmodesequencecount = 150;
		CubeDestroyerOnline = 0;
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
		g.drawImage(ResourceLoader.ImageLoad("/dashboard.png"), 0, 600, 1020, 200, null);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 

		DrawCenteredString(g, Color.ORANGE, "Level: " + CurrentLevel, JWidth/2, 625);

		//g.drawString("Score: " + Score, JWidth/2, 50);
		DrawCenteredString(g, Color.PINK, "Score: " + String.valueOf(Score), JWidth/2, 650);

		//g.drawString("(+" +gamespeed + ") Gamespeed: " + gamespeed + "  Adjust with 1 & 2 (more speed more score!)", JWidth/2, 675);
		DrawCenteredString(g, Color.PINK, "(+" +gamespeed + ") Gamespeed: " + gamespeed + "  Adjust with 1 & 2 (more speed more score!)", JWidth/2, 670);
		//g.drawString("Destroyers Active: " + String.valueOf(DestroyersOnline+Destroyers2Online+CubeDestroyerOnline), JWidth/2, 700);
		DrawCenteredString(g, Color.PINK, "Destroyers Active: " + String.valueOf(DestroyersOnline+Destroyers2Online+CubeDestroyerOnline), JWidth/2, 690);

		if(backgroundon == true){
			//g.drawString("(+1) Disable background with '5'", JWidth/2, 725);
			DrawCenteredString(g, Color.PINK, "(+1) Disable background with '5'", JWidth/2, 710);
		}else{
			//g.drawString("(+0) Enable background with '5'", JWidth/2, 725);
			DrawCenteredString(g, Color.PINK, "(+0) Enable background with '5'", JWidth/2, 710);
		}
		if(disco == false){
			//g.drawString("(+0) Turn Disco on with '9'", JWidth/2, 750);
			DrawCenteredString(g, Color.PINK, "(+0) Turn Disco on with '9'", JWidth/2, 730);
		}else{
			//g.drawString("(+Score*2) Disable Disco with '9'", JWidth/2, 750);
			DrawCenteredString(g, Color.PINK, "(+Score*2) Disable Disco with '9'", JWidth/2, 730);
		}

		if(pausediff > ticks){
			//g.drawString("No score for " + String.valueOf(pausediff-ticks), JWidth/2, 775);
			DrawCenteredString(g, Color.PINK, "No score for " + String.valueOf(pausediff-ticks), JWidth/2, 750);
		}else{
			//g.drawString("Press ESC for Pause (5s no Score)", JWidth/2, 775);
			DrawCenteredString(g, Color.PINK, "Press ESC for Pause (5s no Score)", JWidth/2, 750);
		}

		if(ticks < 300){
			//g.drawString("(Score locked at 1) GodMode Time Left: " + String.valueOf(GodMode-ticks), JWidth/2, 800);
			DrawCenteredString(g, Color.PINK, "(Score locked at 1) GodMode Time Left: " + String.valueOf(GodMode-ticks), JWidth/2, 770);
		}else if(GodModePowerup == true){
			//g.drawString("(+10) Special Godmode on! for: " + String.valueOf(tickdiff-ticks), JWidth/2, 800);
			DrawCenteredString(g, Color.PINK, "(+10) Special Godmode on! for: " + String.valueOf(tickdiff-ticks), JWidth/2, 770);
		}

		if(GodModePowerupballactive == true){
			g.setColor(Color.PINK);
			//g.drawImage(ResourceLoader.ImageLoad("/Feathercoin.png"), GodModePowerupballx, GodModePowerupbally, 30, 30, null);
			g.fillOval(GodModePowerupballx, GodModePowerupbally, 10, 10);
		}

		g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
		if(!Client.IsConnectedToServer == false){
			g.setColor(Color.GREEN);
			g.drawString("Connected to ScoreServer!", 800, 785);
		}else if(Client.disconnected == false){
			g.setColor(Color.RED);
			g.drawString("(" + Main.SecoundsToTimeout + ") Not Connected to ScoreServer!", 530, 785);
		}else{
			g.setColor(Color.RED);
			g.drawString("Disconnected.", 890, 785);
		}

		if(ShowLevelUp == true){
			DrawCenteredString(g, Color.ORANGE, "Level up!", JWidth/2, 75);
		}

		if(lost == true){
			g.setColor(Color.CYAN);
			g.fillOval(mousemoveX, mousemoveY, 10, 10);
		}else if(MouseInDashboard == true){
			g.setColor(Color.CYAN);
			g.fillOval(mousemoveX, mousemoveY, 10, 10);
			DrawCenteredString(g, Color.CYAN, "The Mouse is on the Dashboard, setting it to the cyan oval position.", JWidth/2, 625);
		}
		if(lost == false){
			g.setColor(Color.GREEN);
			g.drawString("Press STRG(CTRL) for a Scoreboard", 10, 785);
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

		/*if((Score >= StartScoreLevel[0] && Score <= StartScoreLevel[1])){
			DrawLevel(g, 0);
		}else
			if(Score >= StartScoreLevel[1] && Score <= StartScoreLevel[2]){
				DrawLevel(g, 1);
				DrawLevel(g, 0);
			}else
				if(Score >= StartScoreLevel[2] && Score <= StartScoreLevel[3]){
					DrawLevel(g, 2);
				}else
					if(Score >= StartScoreLevel[3] && Score <= StartScoreLevel[4]){
						DrawLevel(g, 1);
						DrawLevel(g, 2);
						DrawLevel(g, 0);
					}else
						if(Score >= StartScoreLevel[4] && Score <= StartScoreLevel[5]){
							DrawLevel(g, 1);
							DrawLevel(g, 2);
							DrawLevel(g, 3);
						}else
							if(Score >= StartScoreLevel[5] && Score <= StartScoreLevel[6]){
								//DrawLevel(g, 2);
								DrawLevel(g, 3);
								DrawLevel(g, 4);
							}
		*/
		
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

	}

	private void ForceDeath(int c, int origin){
		if(GodMode-ticks < 0 && GodModePowerup == false){
			lost = true;
			Repaint();
			Sound.stopSound();
			double diff = Score/(ticks-300);
			Object[] options = {"Retry",
					"Quit", "Submit Score & Retry", "Submit Score & Quit", "Submit, Logout & Quit"};
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
			}else if(n == 1){
				System.exit(0);
			}else if(n == 2){
				OtherStuff.PublishScore(Score, Login.ActiveUser);
				RestartGame();
			}else if(n == 3){
				OtherStuff.PublishScore(Score, Login.ActiveUser);
				JOptionPane.showMessageDialog(null, "Score published! bye");
				System.exit(0);
			}else if(n == 4){
				RememberMeClass.RememberMeLogout();
				System.exit(0);
			}else{
				RestartGame();
			}
		}else{
			if(GodMode-ticks < 0){
				if(origin == 1){
					Destroyer[c][0] = 1;
				}else if(origin ==2){
					Destroyer2[c][0] = 1;
				}else if(origin ==3){
					CubeDestroyer[c][0] = 1;
				}
				Score = Score+500;
				AntiCheat1 = AntiCheat1+500;
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
			Main.GamePaused = true;
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
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(Main.devbuild == true){
			PointerInfo a = MouseInfo.getPointerInfo();
			Point point = new Point(a.getLocation());
			SwingUtilities.convertPointFromScreen(point, e.getComponent());
			mouseX = (int) point.getX();
			mouseY = (int) point.getY();	
			System.out.println("Mouse clicked! X: " + point.getX() + " Y: " + point.getY());
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

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
