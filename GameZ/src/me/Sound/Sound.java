package me.Sound;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import me.Other.ResourceLoader;

public class Sound {
	private static Clip clip;
	public static synchronized void playSound(final String url) {
		  new Thread(new Runnable() {
		  // The wrapper thread is unnecessary, unless it blocks on the
		  // Clip finishing; see comments.
		    public void run() {
		      try {
		        clip = AudioSystem.getClip();
		        AudioInputStream inputStream = ResourceLoader.LoadSound(url);
		        clip.open(inputStream);
		        clip.loop(-1);
		        clip.start(); 
		      } catch (Exception e) {
		        System.err.println(e.getMessage());
		      }
		    }
		  }).start();
		}
	
	public static synchronized void stopSound(){
		try{
			clip.stop();
		} catch (Exception e) {
	        System.err.println(e.getMessage());
	    }
	}
}