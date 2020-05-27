package fr.eseo.poo.projet.artiste.vue.formes;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.poo.projet.artiste.modele.formes.Ligne;
import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class VueLigneTest {

	public VueLigneTest() {
		testConstructeur();
	}
	
	private void testConstructeur() {
		JFrame fenetre = new JFrame();
		PanneauDessin p1 = new PanneauDessin();
		p1.ajouterVueForme(new VueLigne(new Ligne()));
		p1.ajouterVueForme(new VueLigne(new Ligne(5,5,10,14)));
		p1.ajouterVueForme(new VueLigne(new Ligne(100,100,49,38)));
		
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setTitle("Vue Ligne Test");
		fenetre.add(p1);
		fenetre.pack();
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {;
			@Override
			public void run() {
				new VueLigneTest();
			}
		});
	}
}
