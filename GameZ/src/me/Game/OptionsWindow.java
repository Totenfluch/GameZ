package me.Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class OptionsWindow extends JFrame implements ChangeListener{
	private static final long serialVersionUID = 1L;
	public static JRadioButton Backgrounddefault, Backgroundon, Backgroundoff, Discodefault, Discoon, Discooff, Gamespeeddefault, Gamespeedrest;
	public JButton SaveandExit;
	int Volume_min = 0;
	int Volume_max = 150;
	int Volume_init = 45;
	public static float MasterVolume = 45;
	int JWidth, JHight;
	Font ft = new Font("Impact", Font.BOLD, 15);
	JSlider Volume = new JSlider(JSlider.HORIZONTAL, Volume_min, Volume_max, Volume_init);

	public OptionsWindow(){
		setSize(400, 600);
		JWidth = 400;
		JHight = 600;
		
		setResizable(false);
		setTitle("Options");
		setContentPane(new DrawPane());
		setLayout(null);
		setLocationRelativeTo(Main.mainmenu);

		Volume.addChangeListener(this);
		Volume.setBounds(50, 35, 300, 50);
		Volume.setBackground(Color.WHITE);
		add(Volume);
	
		
		Backgrounddefault = new JRadioButton("Leave to current state");
		Backgrounddefault.setBounds(5, 115, 150, 20);
		Backgrounddefault.setBackground(Color.WHITE);
		add(Backgrounddefault);
		
		Backgroundon = new JRadioButton("Permanently on");
		Backgroundon.setBounds(155, 115, 115, 20);
		Backgroundon.setBackground(Color.WHITE);
		add(Backgroundon);
		
		Backgroundoff = new JRadioButton("Permanently off");
		Backgroundoff.setBounds(270, 115, 115, 20);
		Backgroundoff.setBackground(Color.WHITE);
		add(Backgroundoff);
		
		ButtonGroup backgroundradio = new ButtonGroup();
		backgroundradio.add(Backgrounddefault);
		backgroundradio.add(Backgroundon);
		backgroundradio.add(Backgroundoff);
		
		Discodefault = new JRadioButton("Leave to current state");
		Discodefault.setBounds(5, 185, 150, 20);
		Discodefault.setBackground(Color.WHITE);
		add(Discodefault);
		
		Discoon = new JRadioButton("Permanently on");
		Discoon.setBounds(155, 185, 115, 20);
		Discoon.setBackground(Color.WHITE);
		add(Discoon);
		
		Discooff = new JRadioButton("Permanently off");
		Discooff.setBounds(270, 185, 115, 20);
		Discooff.setBackground(Color.WHITE);
		add(Discooff);
		
		ButtonGroup discoradio = new ButtonGroup();
		discoradio.add(Discodefault);
		discoradio.add(Discoon);
		discoradio.add(Discooff);
		
		Gamespeeddefault = new JRadioButton("Leave to current state");
		Gamespeeddefault.setBounds(5, 245, 180, 20);
		Gamespeeddefault.setBackground(Color.WHITE);
		add(Gamespeeddefault);
		
		Gamespeedrest = new JRadioButton("Reset after each try");
		Gamespeedrest.setBounds(200, 245, 180, 20);
		Gamespeedrest.setBackground(Color.WHITE);
		add(Gamespeedrest);
		
		ButtonGroup gamespeedradio = new ButtonGroup();
		gamespeedradio.add(Gamespeeddefault);
		gamespeedradio.add(Gamespeedrest);
		
		SaveandExit = new JButton("Save and Exit");
		SaveandExit.setBounds(100, 500, 200, 50);
		add(SaveandExit);

		LoadOptions();
		requestFocus();
		thehandler handler = new thehandler();
		SaveandExit.addActionListener(handler);
	}
	
	private class thehandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == SaveandExit){
				setVisible(false);
				// Save to file and set Options
			}
		}
		
	}
	
	@SuppressWarnings("serial")
	class DrawPane extends JPanel{
		public void paintComponent(Graphics g){
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, 400, 600);
			DrawCenteredString(g, ft, Color.BLACK, "Volume", JWidth/2, 25);
			DrawCenteredString(g, ft, Color.BLACK, "Background", JWidth/2, 100);
			DrawCenteredString(g, ft, Color.BLACK, "Disco", JWidth/2, 170);
			DrawCenteredString(g, ft, Color.BLACK, "Gamespeed", JWidth/2, 240);
		}
	}
	
	public static void LoadOptions(){
		// Load from file
		
		/*if()
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		Backgroundon.setSelected(true);
		Gamespeedrest.setSelected(true);
		Discooff.setSelected(true);
	}
	
	private void DrawCenteredString(Graphics g, Font ft, Color color, String s, int xPos, int yPos){
		FontMetrics fm = getFontMetrics(ft);
		Rectangle2D textsize = fm.getStringBounds(s, g);
		xPos = (int) ((JWidth - textsize.getWidth()) / 2);
		g.setColor(color);
		g.setFont(ft);
		g.drawString(s, xPos, yPos);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider source = (JSlider)e.getSource();
		MasterVolume = (int)source.getValue();
		System.out.println(MasterVolume);
	}


}
