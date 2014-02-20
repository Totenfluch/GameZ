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
import me.Sound.Sound;
import me.Totenfluch.TServerClient.Client;
import me.security.LoginWindow;
import me.security.RegisterWindow;

public class Main 
{
	public static boolean devbuild = false;
	public static double Version = 7.1;
	public static String DevState = "Beta";
	private static LoginWindow loginframe;
	private static Timer timer = null;
	private static Timer logintimer = null;
	public static Timer timeout = null;
	public static int SecoundsToTimeout = 20;
	public static Timer scoreboardtimer = null;
	public static InetAddress ComputerIP;
	public static String ComputerMac;
	public static String ComputerName;
	public static boolean Valid = false;
	public static boolean GamePaused = false;
	private static ImageIcon img2;
	private static RegisterWindow registerframe;
	public static ScoreboardPanel ScoreBoard;
	public static boolean OnlineMode = true;

	public static void main(String[] args)
	{	
		try {
			ComputerIP = InetAddress.getLocalHost();
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		}
		ComputerMac = OtherStuff.getMacAdress();
		ComputerName = ComputerIP.getHostName();
		
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
		//registerframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		loginframe = new LoginWindow();
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//loginframe.setUndecorated(true);
		loginframe.setVisible(true);
		loginframe.initialize();
		loginframe.Repaint();
		loginframe.setIconImage(img.getImage());
		logintimer = new Timer (10, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				loginframe.Repaint();
			}
		});
		timeout = new Timer (10, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				SecoundsToTimeout--;
			}
		});
		logintimer.start();
		OtherStuff.GetMOTD();
		OtherStuff.GettrueMOTD();

		OtherStuff.MakeValid();
		
		timeout.start();
		String host = "188.194.13.44";
		int port = Integer.parseInt("9977");
		@SuppressWarnings("unused")
		final Client chatframe = new Client(host, port);
		timeout.stop();
		
		ScoreBoard = new ScoreboardPanel();
		
		/*menuframe = new ScoreboardWindow();
		menuframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuframe.setVisible(true);
		menuframe.setExtendedState(1);
		menuframe.initialize();
		menuframe.Repaint();
		menuframe.setVisible(false);
		menuframe.setExtendedState(0);*/

		try {
			String[] temp = RememberMeClass.RememberMeLogin().split(" ");
			if(temp[0] != "nop"){
				LoginWindow.Username.setText(temp[1]);
				LoginWindow.Password.setText(temp[2]);
				LoginWindow.remembermecheckbox.setSelected(true);
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
		final Frame frame = new Frame();
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
		timer = new Timer (10, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(GamePaused == false){
					frame.Repaint();
					frame.Update();
				}
			}
		});
		timer.start();
		logintimer.stop();
		/*scoreboardtimer = new Timer (10, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Main.menuframe.Repaint();
			}
		});*/
	}

	public static void OpenRegisterWindow(){
		registerframe.setVisible(true);
	}

	public static void CloseRegisterWindow(){
		if(registerframe.isVisible() == true){
			registerframe.setVisible(false);
		}
	}
}
