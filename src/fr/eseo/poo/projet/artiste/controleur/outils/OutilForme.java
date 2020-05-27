package fr.eseo.poo.projet.artiste.controleur.outils;

import java.awt.event.MouseEvent;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.vue.formes.VueForme;

public abstract class OutilForme extends Outil {

	public static final double EPSILON = 0.5;
	
	protected abstract VueForme creerVueForme();
	
	public void mousePressed (MouseEvent event) {
		this.setDebut(new Coordonnees(event.getX(), event.getY()));
	}
	
	public void mouseReleased (MouseEvent event) {
		this.setFin(new Coordonnees(event.getX(), event.getY()));
		if (((int)this.getFin().getAbscisse() != (int)this.getDebut().getAbscisse()) && ((int)this.getFin().getOrdonnee() != (int)this.getDebut().getOrdonnee())) {
			this.getPanneauDessin().ajouterVueForme(creerVueForme());
			this.getPanneauDessin().repaint();
		}
	}
	
	public void mouseClicked (MouseEvent event) {
		this.setDebut(new Coordonnees(event.getX(), event.getY()));
		if (event.getClickCount() == 2) {
			this.getPanneauDessin().ajouterVueForme(creerVueForme());
			this.getPanneauDessin().repaint();
		}
	}
}
