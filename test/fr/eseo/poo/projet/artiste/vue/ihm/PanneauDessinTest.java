package fr.eseo.poo.projet.artiste.vue.ihm;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PanneauDessinTest {
	
	public PanneauDessinTest() {
		testConstructeurParDefaut();
		testConstructeur();
	}
	
	private void testConstructeurParDefaut() {
		JFrame fenetre = new JFrame();
		PanneauDessin p1 = new PanneauDessin();
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setTitle("Etre un Artiste");
		fenetre.add(p1);
		fenetre.pack();
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
	}
	
	private void testConstructeur() {
		JFrame fenetre = new JFrame();
		PanneauDessin p1 = new PanneauDessin(500, 500, Color.BLACK);
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setTitle("Blues du Businessman");
		fenetre.add(p1);
		fenetre.pack();
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {;
			@Override
			public void run() {
				new PanneauDessinTest();
			}
		});
	}
}
