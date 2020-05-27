package fr.eseo.poo.projet.artiste.controleur.outils;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.poo.projet.artiste.vue.ihm.PanneauBarreOutils;
import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class OutilCercleTest {

	public OutilCercleTest() {
		testConstructeur();
	}
	
	private void testConstructeur() {
		JFrame fenetre = new JFrame();
		PanneauDessin p1 = new PanneauDessin();
		PanneauBarreOutils pb = new PanneauBarreOutils(p1);
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setTitle("Panneau outil cercle test");
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
				new OutilCercleTest();
			}
		});
	}
}
