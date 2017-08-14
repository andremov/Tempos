/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempos;

import java.awt.Color;

/**
 *
 * @author Andres
 */
public class Tempos {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		new Window();
		Handler.createCreature(1,200,Color.red);
		Handler.createCreature(2,230,Color.green);
		Handler.createCreature(3,260,Color.cyan);
		Handler.createCreature(4,290,Color.magenta);
		Handler.createCreature(5,320,Color.orange);
		Handler.createCreature(6,350,Color.pink);
		Handler.createCreature(7,380,Color.yellow);
		Handler.createCreature(8,410,Color.blue);
	}
	
}
