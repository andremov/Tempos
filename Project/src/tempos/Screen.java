/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempos;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Andres
 */
public class Screen extends Canvas implements Runnable {
	
	
	/**
	 * Create a GameDisplay custom canvas.
	 */
	public Screen() {
		setSize(500,500);
		setLocation(1,1);
		setBackground(Color.white);
	}

	@Override
	public void run() {
		createBufferStrategy(2);
		while (true) {
			Graphics g = getBufferStrategy().getDrawGraphics();
			
			try {
				g.drawImage(Handler.getImage(), 0, 0, this);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			getBufferStrategy().show();

			try {
				Thread.sleep(20);
			} catch (InterruptedException ex) {
			}
		}
	}

}
