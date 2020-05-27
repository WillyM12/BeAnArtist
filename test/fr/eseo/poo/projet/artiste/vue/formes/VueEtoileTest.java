package fr.eseo.poo.projet.artiste.vue.formes;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Etoile;
import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class VueEtoileTest {

	public VueEtoileTest() {
		testConstructeur();
	}
	
	private void testConstructeur() {
		JFrame fenetre = new JFrame();
		PanneauDessin p1 = new PanneauDessin();
		p1.ajouterVueForme(new VueEtoile(new Etoile()));
		p1.ajouterVueForme(new VueEtoile(new Etoile(new Coordonnees(),200,6,Math.PI/2,0.75)));
		p1.ajouterVueForme(new VueEtoile(new Etoile(new Coordonnees(),50,12,Math.PI/4,0.25)));
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setTitle("Panneau étoile test");
		fenetre.add(p1);
		fenetre.pack();
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {;
			@Override
			public void run() {
				new VueEtoileTest();
			}
		});
	}
}
