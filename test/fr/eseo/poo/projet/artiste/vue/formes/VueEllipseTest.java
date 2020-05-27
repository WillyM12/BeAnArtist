package fr.eseo.poo.projet.artiste.vue.formes;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.poo.projet.artiste.modele.formes.Ellipse;
import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class VueEllipseTest {

	public VueEllipseTest() {
		testConstructeur();
	}
	
	private void testConstructeur() {
		JFrame fenetre = new JFrame();
		PanneauDessin p1 = new PanneauDessin();
		p1.ajouterVueForme(new VueEllipse(new Ellipse()));
		p1.ajouterVueForme(new VueEllipse(new Ellipse(200,200,400,300)));
		p1.ajouterVueForme(new VueEllipse(new Ellipse(100,100,200,250)));
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setTitle("Panneau ellipse test");
		fenetre.pack();
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {;
			@Override
			public void run() {
				new VueEllipseTest();
			}
		});
	}
}
