package fr.eseo.poo.projet.artiste.vue.ihm;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PanneauBarreOutilsTest {

	public PanneauBarreOutilsTest() {
		testConstructeur();
	}
	
	private void testConstructeur() {
		JFrame fenetre = new JFrame();
		PanneauDessin p1 = new PanneauDessin();
		PanneauBarreOutils pb = new PanneauBarreOutils(p1);
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setTitle("Panneau barre outils test");
		fenetre.add(p1);
		fenetre.add(pb, BorderLayout.EAST);
		fenetre.pack();
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {;
			@Override
			public void run() {
				new PanneauBarreOutilsTest();
			}
		});
	}
}
