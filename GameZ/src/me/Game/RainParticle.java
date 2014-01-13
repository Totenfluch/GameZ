package me.Game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;

import me.Other.OtherStuff;

public class RainParticle 
{
	private float PosX = 0;
    private float PosY = 0;
	private float Speed = 0;
	private float AdjustmentX = 0;
	private float randomAdjustment = 0;
	public float DrawPositionX = 0;
	public float DrawPositionY = 0;
	
	public RainParticle(int Width, int Height)
	{
	  PosX = OtherStuff.randInt(0, Width);
	  PosY = OtherStuff.randInt(0, Height);
	  Speed = OtherStuff.randInt(1, 5);
	  randomAdjustment = OtherStuff.randInt(1,20);
	  
	  Update(Height);
	}
	
	public void Update(int Height)
	{
		PosY += Speed;
		if(PosY > Height)
			PosY = 0;
		
		AdjustmentX = (float)Math.sin(PosY/(100+randomAdjustment))*30;
		
		DrawPositionY = PosY;
		DrawPositionX = PosX + AdjustmentX;
	}
	
	public void Draw(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillRect((int)DrawPositionX, (int)DrawPositionY, 2, 6);
	}
}
