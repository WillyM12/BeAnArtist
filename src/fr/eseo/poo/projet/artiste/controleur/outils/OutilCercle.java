package fr.eseo.poo.projet.artiste.controleur.outils;


import java.awt.event.MouseEvent;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Cercle;
import fr.eseo.poo.projet.artiste.vue.formes.VueCercle;
import fr.eseo.poo.projet.artiste.vue.formes.VueForme;

public class OutilCercle extends OutilForme{

	@Override
	protected VueForme creerVueForme() {
		Cercle cercle = new Cercle(getDebut());
		Coordonnees position;
		double taille;
		
		if(this.getFin() != null && ((int)this.getFin().getAbscisse() != (int)this.getDebut().getAbscisse()) && ((int)this.getFin().getOrdonnee() != (int)this.getDebut().getOrdonnee())) {
			if (Math.abs(this.getFin().getAbscisse() - this.getDebut().getAbscisse()) > Math.abs(this.getFin().getOrdonnee() - this.getDebut().getOrdonnee())) {
				taille = Math.abs(this.getFin().getAbscisse() - this.getDebut().getAbscisse());
			}
			else {
				taille = Math.abs(this.getFin().getOrdonnee() - this.getDebut().getOrdonnee());
			}
			
			if (this.getDebut().getAbscisse() > this.getFin().getAbscisse() && this.getDebut().getOrdonnee() > this.getFin().getOrdonnee()) {
				position = new Coordonnees(this.getDebut().getAbscisse() - taille, this.getDebut().getOrdonnee() - taille);
			}
			else if(this.getDebut().getAbscisse() > this.getFin().getAbscisse() && this.getDebut().getOrdonnee() < this.getFin().getOrdonnee()) {
				position = new Coordonnees(this.getDebut().getAbscisse() - taille, this.getDebut().getOrdonnee());
			}
			else if(this.getDebut().getAbscisse() < this.getFin().getAbscisse() && this.getDebut().getOrdonnee() > this.getFin().getOrdonnee()) {
				position = new Coordonnees(this.getDebut().getAbscisse(), this.getDebut().getOrdonnee() - taille);
			}
			else {
				position = new Coordonnees(this.getDebut().getAbscisse(), this.getDebut().getOrdonnee());
			}
			
			cercle.setPosition(position);
			cercle.setLargeur(taille);
		}

		cercle.setCouleur(this.getPanneauDessin().getCouleurCourante());
		cercle.setRempli(this.getPanneauDessin().getModeRemplissage());
		
		return new VueCercle(cercle);
	}
	
	public void mouseClicked(MouseEvent event) {
		super.mouseClicked(event);
	}

}
