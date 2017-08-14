/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class Handler {
	
	private static ArrayList<Creature> creatures = new ArrayList<>();
	
	public static void createCreature(int value, int x, Color color) {
		creatures.add(new Creature(value, x, color));
	}
	
	public static BufferedImage getImage() {
		int imageSize = 500;
		BufferedImage image = new BufferedImage(imageSize, imageSize, BufferedImage.TYPE_INT_ARGB);
		Graphics g = image.getGraphics();
		
		g.setColor(Color.black);
		g.fillRect(5,5,490,490);
		
		for (int i = 0; i < creatures.size(); i++) {
			g.drawImage(creatures.get(i).getImage(), creatures.get(i).getX(), 30, null);
		}
		
		return image;
	}
	
}
