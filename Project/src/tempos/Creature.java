/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author Andres
 */
public class Creature {
	
	private int tempoValue;
	private int timer;
	private float x;
	private float y;
	private Color color;
	private int maxY;
	private int startY;

	public Creature(int tempoValue, float x, Color color) {
		this.tempoValue = tempoValue;
		this.color = color;
		this.timer = 0;
		this.x = x;
		this.maxY = 20 * tempoValue;
		this.startY = 300;
	}
	
	private void tick() {
		timer++;
		
		this.y = (float) Math.abs(Math.cos(this.timer/(5f*this.tempoValue)));
	}
	
	public BufferedImage getImage() {
		BufferedImage image = new BufferedImage(50, 500, BufferedImage.TYPE_INT_ARGB);
		Graphics g = image.getGraphics();
		
		tick();
		
		g.setColor(color);
		g.fillRect(0,getY(),20,20);
		
		g.setColor(Color.white);
		g.drawString(""+tempoValue, 5, 350);
		
		return image;
	}

	/**
	 * @return the tempoValue
	 */
	public int getTempoValue() {
		return tempoValue;
	}

	/**
	 * @return the timer
	 */
	public int getTimer() {
		return timer;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return (int) x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return (int) (this.startY - (this.y*this.maxY));
//		return (int) (this.y * this.maxY);
	}

	
	
}
