package fr.eseo.poo.projet.artiste.controleur.outils;

import java.awt.event.MouseEvent;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Forme;
import fr.eseo.poo.projet.artiste.vue.formes.VueForme;

public class OutilDeplacer extends Outil {
	
	private Forme formeSelectionee;
	private Coordonnees debut;
	private Coordonnees fin;
	
	public void mousePressed (MouseEvent event) {
		Coordonnees clicked = new Coordonnees(event.getX(), event.getY());
		
		for (VueForme uneVueForme : super.getPanneauDessin().getVueFormes()) {
			if (uneVueForme.getForme().contient(clicked)) {
				this.formeSelectionee = uneVueForme.getForme();
			}
		}
		if (this.formeSelectionee != null) {
			this.debut = clicked;
		}
	}
	
	public void mouseReleased (MouseEvent event) {
		this.fin = new Coordonnees(event.getX(), event.getY());
		
		if (this.debut != null && this.formeSelectionee != null) {
			double ecartAbscisse = this.fin.getAbscisse() - this.debut.getAbscisse();
			double ecartOrdonnee = this.fin.getOrdonnee() - this.debut.getOrdonnee();
			Coordonnees newPosition = new Coordonnees(this.formeSelectionee.getPosition().getAbscisse() + ecartAbscisse, this.formeSelectionee.getPosition().getOrdonnee() + ecartOrdonnee);
			this.formeSelectionee.setPosition(newPosition);
			super.getPanneauDessin().repaint();
			this.formeSelectionee = null;
		}
	}
}
