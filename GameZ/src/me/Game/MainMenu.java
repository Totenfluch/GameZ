package me.Game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import me.Other.OtherStuff;
import me.Other.ResourceLoader;
import me.Other.StatSaver;
import me.security.Login;

@SuppressWarnings("serial")
public class MainMenu extends JFrame implements MouseMotionListener, MouseListener{
	public Font f = new Font("Impact", Font.ITALIC, 50);
	public Font fd = new Font("Times", Font.PLAIN, 30);
	int JWidth;
	int JHight;
	int mousemoveX;
	int mousemoveY;
	boolean LogoutPressed;
	boolean PlayPressed;
	boolean OptionsPressed;
	
	public static JTextPane Scores, News;
	
	
	public static StyledDocument ScoresDoc;
	public static StyledDocument NewsDoc;
	
	public static SimpleAttributeSet OwnScore;
	public static SimpleAttributeSet OtherScores;
	public static SimpleAttributeSet NewsStyle;
	
	
	public MainMenu(){
		super("Main Menu");
		setSize(1027, 630);
		JWidth = 1020;
		JHight = 600;

		setContentPane(new DrawPane());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		//setVisible(true);
		requestFocus();
		addMouseMotionListener(this);
		addMouseListener(this);
		
		setLayout(null);
		Scores = new JTextPane();
		Scores.setBounds(25, 50, 300, 400);
		Scores.setEditable(false);
		add(Scores);
		ScoresDoc = Scores.getStyledDocument();
		Scores.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 2));
		
		News = new JTextPane();
		News.setBounds(695, 50, 300, 400);
		News.setEditable(false);
		add(News);
		NewsDoc = News.getStyledDocument();
		News.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		
		OwnScore = new SimpleAttributeSet();
		StyleConstants.setForeground(OwnScore, Color.RED);
		StyleConstants.setBold(OwnScore, true);
		
		OtherScores = new SimpleAttributeSet();
		StyleConstants.setForeground(OtherScores, Color.BLACK);
		StyleConstants.setBold(OtherScores, false);
		
		NewsStyle = new SimpleAttributeSet();
		StyleConstants.setForeground(NewsStyle, Color.BLUE);
		StyleConstants.setBold(NewsStyle, false);
		
		//appendScoresNews();
	}
	
	private void DrawCenteredString(Graphics g, Font ft, Color color, String s, int xPos, int yPos){
		FontMetrics fm = getFontMetrics(ft);
		Rectangle2D textsize = fm.getStringBounds(s, g);
		xPos = (int) ((JWidth - textsize.getWidth()) / 2);
		g.setColor(color);
		g.setFont(ft);
		g.drawString(s, xPos, yPos);
	}
	
	public static void appendScoresNews(){
		boolean n = false;
		for(int i = 0; i<28; i++){
			if(OtherStuff.scores[i].contains(Login.ActiveUser)){
				if(n == false){
					if(i < StatSaver.BestRank || StatSaver.BestRank == 0){
						StatSaver.SaveStat("BestRank", 3, i+1);
					}
					n = true;
				}
				AppendToDoc(ScoresDoc, OtherStuff.scores[i].replace("<", "[").replace(">", "] ~ "), OwnScore);
			}else{
				AppendToDoc(ScoresDoc, OtherStuff.scores[i].replace("<", "[").replace(">", "] ~ "), OtherScores);
			}
		}
		
		for(int i = 0; i<28; i++){
			AppendToDoc(NewsDoc, OtherStuff.news[i], NewsStyle);
		}
	}
	
	private static void AppendToDoc(StyledDocument doc, String s, SimpleAttributeSet Style){
		try
		{
		    doc.insertString(doc.getLength(), s+"\n", Style);
		}
		catch(Exception e) { System.out.println(e); }
	}
	
	public static void Refresh(){
		OtherStuff.GetMOTD();
		OtherStuff.GettrueMOTD();
		Scores.setText("");
		News.setText("");
		appendScoresNews();
	}
	
	
	class DrawPane extends JPanel{
		public void paintComponent(Graphics g){
			g.drawImage(ResourceLoader.ImageLoad("/MainMenuBack.png"), 0, 0, null);
			DrawCenteredString(g, f, Color.ORANGE, "Stats", JWidth/2, 45);
			
			g.setColor(Color.ORANGE);
			g.setFont(fd);
			g.drawString("Times played:", 335, 100);
			g.drawString("Max Score:", 335, 140);
			g.drawString("Best Rank:", 335, 180);
			g.drawString("Most ticks survived:", 335, 220);
			g.drawString("Godmodes collected:", 335, 260);
			g.drawString("Times died:", 335, 300);
			g.drawString("Best Level:", 335, 340);
			
			g.setColor(Color.RED);
			g.setFont(new Font("Impact", Font.PLAIN, 20));
			g.drawString(""+StatSaver.TimesPlayed, 615, 100);
			g.drawString(""+StatSaver.MaxScore, 615, 140);
			g.drawString(""+StatSaver.BestRank, 615, 180);
			g.drawString(""+StatSaver.MostTicksSurvived, 615, 220);
			g.drawString(""+StatSaver.GodModesCollected, 615, 260);
			g.drawString(""+StatSaver.TimesDied, 615, 300);
			g.drawString(""+StatSaver.BestLevel, 615, 340);
			g.setColor(Color.BLACK);
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(2));
			g.drawRect(330, 51, 360, 398);
			
			g.setFont(new Font("Times New Roman", Font.ITALIC, 40));
			g.setColor(Color.GREEN);
			g.drawString(Login.ActiveUser, 75, 535);
			g.setColor(Color.ORANGE);
			g.drawString(OtherStuff.TheNormalTime(), 25, 40);
			g.setColor(Color.GRAY);
			//g.drawString("Logout", 695, 40);
			if(StatSaver.BestLevel == 1){
				g.drawImage(ResourceLoader.ImageLoad("/a1.png"), (JWidth-64)/2, 375, 64, 64, null);
			}else if(StatSaver.BestLevel == 2){
				g.drawImage(ResourceLoader.ImageLoad("/a2.png"), (JWidth-64)/2, 375, 64, 64, null);
			}else if(StatSaver.BestLevel == 3){
				g.drawImage(ResourceLoader.ImageLoad("/a3.png"), (JWidth-64)/2, 375, 64, 64, null);
			}else if(StatSaver.BestLevel == 4){
				g.drawImage(ResourceLoader.ImageLoad("/a4.png"), (JWidth-64)/2, 375, 64, 64, null);
			}else if(StatSaver.BestLevel == 5){
				g.drawImage(ResourceLoader.ImageLoad("/a5.png"), (JWidth-64)/2, 375, 64, 64, null);
			}else if(StatSaver.BestLevel == 6){
				g.drawImage(ResourceLoader.ImageLoad("/a6.png"), (JWidth-64)/2, 375, 64, 64, null);
			}else if(StatSaver.BestLevel == 7){
				g.drawImage(ResourceLoader.ImageLoad("/a7.png"), (JWidth-64)/2, 375, 64, 64, null);
			}else if(StatSaver.BestLevel == 8){
				g.drawImage(ResourceLoader.ImageLoad("/a8.png"), (JWidth-64)/2, 375, 64, 64, null);
			}else if(StatSaver.BestLevel == 9){
				g.drawImage(ResourceLoader.ImageLoad("/a9.png"), (JWidth-64)/2, 375, 64, 64, null);
			}else if(StatSaver.BestLevel == 10){
				g.drawImage(ResourceLoader.ImageLoad("/a10.png"), (JWidth-64)/2, 375, 64, 64, null);
			}

			if(mousemoveX > 695 && mousemoveX < 870 && mousemoveY > 0 && mousemoveY < 50){
				g.drawImage(ResourceLoader.ImageLoad("/logouthover_02.png"), 695, 0, null);
			}else{
				g.drawImage(ResourceLoader.ImageLoad("/logout_02.png"), 695, 0, null);
			}

			if(mousemoveX > 345 && mousemoveX < 670 && mousemoveY > 475 && mousemoveY < 585){
				g.drawImage(ResourceLoader.ImageLoad("/PlayButtonHover.png"), 345, 475, null);
			}else{
				g.drawImage(ResourceLoader.ImageLoad("/PlayButton.png"), 345, 475, null);
			}
			
			//Options.setBounds(750, 500, 200, 50);
			if(mousemoveX > 750 && mousemoveX < 950 && mousemoveY > 500 && mousemoveY < 550){
				g.drawImage(ResourceLoader.ImageLoad("/OptionsHover.png"), 750, 500, null);
			}else{
				g.drawImage(ResourceLoader.ImageLoad("/Options.png"), 750, 500, null);
			}
		}
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		mousemoveY = e.getY()-26;
		mousemoveX = e.getX()-3;
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		mousemoveY = e.getY()-26;
		mousemoveX = e.getX()-3;
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getX() > 695 && e.getX() < 870 && e.getY() > 0 && e.getY() < 75){
			LogoutPressed = true;
		}else{
			LogoutPressed = false;
		}
		if(mousemoveX > 345 && mousemoveX < 670 && mousemoveY > 475 && mousemoveY < 585){
			PlayPressed = true;
		}else{
			PlayPressed = false;
		}
		if(mousemoveX > 750 && mousemoveX < 950 && mousemoveY > 500 && mousemoveY < 550){
			OptionsPressed = true;
		}else{
			OptionsPressed = false;
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getX() > 695 && e.getX() < 870 && e.getY() > 0 && e.getY() < 75 && LogoutPressed == true){
			Main.Logout();
		}
		if(mousemoveX > 345 && mousemoveX < 670 && mousemoveY > 475 && mousemoveY < 585 && PlayPressed == true){
			Main.CloseMainMenu();
			Login.truelogin();
			Main.CloseOptions();
		}
		if(mousemoveX > 750 && mousemoveX < 950 && mousemoveY > 500 && mousemoveY < 550 && OptionsPressed == true){
			Main.OpenOptions();
		}
	}
}
