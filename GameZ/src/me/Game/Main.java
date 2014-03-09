package me.Game;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;

import me.Other.OtherStuff;
import me.Other.RememberMeClass;
import me.Other.StatSaver;
import me.Sound.Sound;
import me.Totenfluch.TServerClient.Client;
import me.security.Login;
import me.security.LoginWindow;
import me.security.RegisterWindow;

public class Main 
{
	
	//Version
	public static boolean devbuild = false;
	public static double Version = 11.2;
	public static String DevState = "Release";
	
	//Frames
	public static Frame frame = null;
	private static LoginWindow loginframe;
	private static RegisterWindow registerframe;
	public static ScoreboardPanel ScoreBoard;
	public static MainMenu mainmenu;
	public static OptionsWindow optionsframe = null;
	
	//Timers
	public static Timer timer = null;
	private static Timer logintimer = null;
	public static Timer timeout = null;
	public static Timer menutimer = null;
	public static Timer scoreboardtimer = null;
	public static Timer SaveToFileTimer = null;
	
	//ip stuff
	public static InetAddress lComputerIP;
	public static String ComputerIP;
	public static String ComputerMac;
	public static String ComputerName;
	
	//Offline mode
	public static int SecoundsToTimeout = 20;
	public static boolean OnlineMode = true;
	
	//Even I don't know :(
	public static boolean Valid = false;
	public static boolean GamePaused = false;
	private static ImageIcon img2;

	public static void main(String[] args)
	{
		try {
			lComputerIP = InetAddress.getLocalHost();
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		}
		ComputerMac = OtherStuff.getMacAdress();
		ComputerName = lComputerIP.getHostName();
		ComputerIP = lComputerIP.getHostAddress();

		java.net.URL imageURL = Main.class.getResource("/icon_login.png");
		ImageIcon img = null;
		if (imageURL != null) {
			img = new ImageIcon(imageURL);
		}

		java.net.URL imageURL2 = Main.class.getResource("/demgame.png");
		img2 = null;
		if (imageURL != null) {
			img2 = new ImageIcon(imageURL2);
		}

		registerframe = new RegisterWindow();

		loginframe = new LoginWindow();
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginframe.setIconImage(img.getImage());
		loginframe.setVisible(true);
		loginframe.initialize();
		loginframe.Repaint();
		logintimer = new Timer (10, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				loginframe.Repaint();
			}
		});

		timeout = new Timer (1000, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				SecoundsToTimeout--;
			}
		});
		SaveToFileTimer = new Timer (50, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				OtherStuff.SaveStatsToFile();
				SaveToFileTimer.stop();
			}
		});
		
		timer = new Timer (10, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(GamePaused == false){
					frame.Repaint();
					frame.Update();
				}
			}
		});
		logintimer.start();

		OtherStuff.MakeValid();	
		OtherStuff.ReadStatsFromFile();
		StatSaver.SyncStats();

		timeout.start();
		String host = "188.194.129.46";
		int port = Integer.parseInt("9977");
		@SuppressWarnings("unused")
		final Client chatframe = new Client(host, port);
		timeout.stop();
		
		OtherStuff.GetMOTD();
		OtherStuff.GettrueMOTD();

		ScoreBoard = new ScoreboardPanel();
		mainmenu = new MainMenu();
		optionsframe = new OptionsWindow();

		try {
			String[] temp = RememberMeClass.RememberMeLogin().split(" ");
			if(temp[0] != "nop"){
				LoginWindow.Username.setText(temp[1]);
				LoginWindow.Password.setText(temp[2]);
				LoginWindow.remembermecheckbox.setSelected(true);
				Login.LogMeIn(temp[1], temp[2]);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	public static void CloseScoreBoard(){
		ScoreBoard.setVisible(false);
	}
	public static void OpenScoreBoard(){
		ScoreBoard.setVisible(true);
	}

	public static void DisableLoginWindow(){
		loginframe.setVisible(false);
	}

	public static void StartGame(){
		frame = new Frame();
		frame.setSize(1020, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.initialize();
		frame.setIconImage(img2.getImage());
		Sound.playSound("Sound2.wav");
		CloseRegisterWindow();
		BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
		Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(
				cursorImg, new Point(0, 0), "blank cursor");
		frame.setCursor(blankCursor);
		timer.start();
		logintimer.stop();
	}

	public static void OpenRegisterWindow(){
		if(registerframe.isVisible() == false){
			registerframe.setVisible(true);
		}else{
			System.out.println("registerframe is visible and is set visible!");
		}
	}

	public static void CloseRegisterWindow(){
		if(registerframe.isVisible() == true){
			registerframe.setVisible(false);
		}else{
			System.out.println("registerframe is invisible and is set invisible!");
		}
	}

	public static void OpenMainMenu(){
		MainMenu.appendScoresNews();
		mainmenu.repaint();
		mainmenu.setVisible(true);
		loginframe.setVisible(false);
		logintimer.stop();
		menutimer = new Timer (50, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mainmenu.repaint();
			}
		});
		menutimer.start();
	}

	public static void CloseMainMenu(){
		if(mainmenu.isVisible() == true){
			mainmenu.setVisible(false);
			menutimer.stop();
		}else{
			System.out.println("MainMenu is not visible and is set invisible!");
		}
	}
	
	public static void OpenOptions(){
		if(optionsframe.isVisible() == false){
			optionsframe.setVisible(true);
		}else{
			System.out.println("Optionswindow is visible and is set visible!");
		}
	}
	
	public static void CloseOptions(){
		if(optionsframe.isVisible() == true){
			optionsframe.setVisible(false);
		}else{
			System.out.println("Optionswindow is not visible and is set invisible!");
		}
	}

	public static void Logout(){
		CloseMainMenu();
		loginframe.setVisible(true);
		logintimer.start();
		LoginWindow.remembermecheckbox.setSelected(false);
		RememberMeClass.RememberMeLogout();
		LoginWindow.Password.setText("");
		LoginWindow.Username.setText("");
	}
}
