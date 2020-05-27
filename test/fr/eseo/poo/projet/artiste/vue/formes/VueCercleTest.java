package fr.eseo.poo.projet.artiste.vue.formes;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.poo.projet.artiste.modele.formes.Cercle;
import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class VueCercleTest {

	public VueCercleTest() {
		testConstructeur();
	}
	
	private void testConstructeur() {
		JFrame fenetre = new JFrame();
		PanneauDessin p1 = new PanneauDessin();
		p1.ajouterVueForme(new VueCercle(new Cercle()));
		p1.ajouterVueForme(new VueCercle(new Cercle(200,200,400)));
		p1.ajouterVueForme(new VueCercle(new Cercle(100,100,200)));
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setTitle("Vue Cercle Test");
		fenetre.add(p1);
		fenetre.pack();
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {;
			@Override
			public void run() {
				new VueCercleTest();
			}
		});
	}
}
