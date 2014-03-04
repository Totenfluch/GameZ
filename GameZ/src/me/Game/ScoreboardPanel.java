package me.Game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.lang.reflect.Method;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import me.Other.OtherStuff;
import me.Other.ResourceLoader;

class ScoreboardPanel extends JFrame implements KeyListener{
	private static final long serialVersionUID = 1L;

	private double mousemoveX = 0.0;
	private double mousemoveY = 0.0;

	public ScoreboardPanel() {
		addKeyListener(this);
		requestFocus();

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
		}

		setUndecorated(true);
		setContentPane(new ContentPane());

		String version = System.getProperty("java.version");
		if (version.startsWith("1.7")) {
			setBackground(new Color(0, 0, 0, 0));
		} else if (version.startsWith("1.6")) {
			if (supportsPerAlphaPixel()) {
				setOpaque(this, false);
			} else {
				System.out.println("Per Pixel Alphering is not support with Java " + version);
				System.exit(1);
			}
		} else {
			System.out.println("Per Pixel Alphering is not support with Java " + version);
			System.exit(1);
		}

		/*close = new JButton(ResourceLoader.Iconload("/Close.png"));
		close.setBackground(Color.BLACK);
		close.setBounds(490, 520, 70, 20);
		add(close);

		reload = new JButton(ResourceLoader.Iconload("/reload.png"));
		reload.setBounds(690, 520, 70, 20);
		add(reload);*/

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		add(new ImagePane());
		pack();
		setLocationRelativeTo(null);



	}

	@SuppressWarnings("unused")
	public static boolean supportsPerAlphaPixel() {

		boolean support = false;

		try {

			Class<?> awtUtilsClass = Class.forName("com.sun.awt.AWTUtilities");
			support = true;

		} catch (Exception exp) {
		}

		return support;

	}

	public static void setOpaque(Window window, boolean opaque) {

		try {

			Class<?> awtUtilsClass = Class.forName("com.sun.awt.AWTUtilities");
			if (awtUtilsClass != null) {

				Method method = awtUtilsClass.getMethod("setWindowOpaque", Window.class, boolean.class);
				method.invoke(null, window, opaque);

			}

		} catch (Exception exp) {
		}

	}

	public class ContentPane extends JPanel {
		private static final long serialVersionUID = 1L;

		public ContentPane() {
			setOpaque(false);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
		}
	}

	public class ImagePane extends JPanel {
		private static final long serialVersionUID = 1L;
		private BufferedImage background;
		private BufferedImage offImage;
		private Ellipse2D offButton;
		private boolean mouseIn;

		public ImagePane() {
			setOpaque(false);
			background = ResourceLoader.loadBufferedImage("/scoreboard_02.png");
			offImage = ResourceLoader.loadBufferedImage("/reload.png");
			offButton = new Ellipse2D.Float(212, 330, 25, 25);
			MouseAdapter handler = new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getClickCount() == 1 && e.getButton() == MouseEvent.BUTTON1) {
						if (offButton.contains(e.getPoint())) {
							Window window = SwingUtilities.getWindowAncestor(ImagePane.this);
							if (window != null) {
								window.dispose();
							}
						}
						
						if(e.getX() >= 770 && e.getX() <= 790 && e.getY() >= 520 && e.getY() <= 540){
							OtherStuff.GetMOTD();
							repaint();
						}
						if(e.getX() >= 690 && e.getX() <= 760 && e.getY() >= 520 && e.getY() <= 540){
							Main.CloseScoreBoard();
						}
						System.out.println(e.getX() + " " + e.getY());
					}
				}

				@Override
				public void mouseMoved(MouseEvent e) {
					Cursor cursor = Cursor.getDefaultCursor();
					if (offButton.contains(e.getPoint())) {
						cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
					}
					setCursor(cursor);
					mousemoveX = e.getX();
					mousemoveY = e.getY();
					repaint();
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					mouseIn = true;
					repaint();
				}

				@Override
				public void mouseExited(MouseEvent e) {
					mouseIn = true;
					repaint();
				}
			};
			addMouseListener(handler);
			addMouseMotionListener(handler);
		}

		@Override
		public Dimension getPreferredSize() {
			return background == null ? new Dimension(400, 400) : new Dimension(background.getWidth(), background.getHeight());
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			if (background != null) {
				Graphics2D g2d = (Graphics2D) g.create();
				int x = (getWidth() - background.getWidth()) / 2;
				int y = (getHeight() - background.getHeight()) / 2;
				g2d.drawImage(background, x, y, this);
				if (mouseIn && offImage != null) {
					//g2d.drawImage(ResourceLoader.ImageLoad("/reload.png"), 770, 520, 20, 20, null);
					//g2d.drawImage(ResourceLoader.ImageLoad("/Close.png"), 690, 520, 70, 20, null);

					if(mousemoveX >= 770 && mousemoveX <= 790 && mousemoveY >= 520 && mousemoveY <= 540){
						g2d.drawImage(ResourceLoader.ImageLoad("/ReloadHover.png"), 770, 520, 20, 20, null);
					}else{
						g2d.drawImage(ResourceLoader.ImageLoad("/reload_02.png"), 770, 520, 20, 20, null);
					}
					if(mousemoveX >= 690 && mousemoveX <= 760 && mousemoveY >= 520 && mousemoveY <= 540){
						g2d.drawImage(ResourceLoader.ImageLoad("/CloseHover.png"), 690, 520, 70, 20, null);
					}else{
						g2d.drawImage(ResourceLoader.ImageLoad("/Close_02.png"), 690, 520, 70, 20, null);
					}
					for(int b = 0; b<5 ; b++){
						for(int i = 0; i< 20 ; i++){
							g2d.setColor(Color.ORANGE);
							g2d.drawString(OtherStuff.scores[i+(b*19)], 150+(b*125), 125+(i*20));
						}
					}
				}
				g2d.dispose();
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
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
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}