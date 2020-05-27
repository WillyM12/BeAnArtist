package fr.eseo.poo.projet.artiste.controleur.outils;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Ellipse;
import fr.eseo.poo.projet.artiste.vue.formes.VueEllipse;
import fr.eseo.poo.projet.artiste.vue.formes.VueForme;

public class OutilEllipse extends OutilForme {

	@Override
	protected VueForme creerVueForme() {
		Coordonnees position;
		double largeur;
		double hauteur;
		Ellipse ellipse = new Ellipse(this.getDebut());
		
		if (this.getFin() != null && ((int)this.getFin().getAbscisse() != (int)this.getDebut().getAbscisse()) && ((int)this.getFin().getOrdonnee() != (int)this.getDebut().getOrdonnee())) {
			largeur = Math.abs(this.getFin().getAbscisse() - this.getDebut().getAbscisse());
			hauteur = Math.abs(this.getFin().getOrdonnee() - this.getDebut().getOrdonnee());
			
			if (this.getDebut().getAbscisse() > this.getFin().getAbscisse() && this.getDebut().getOrdonnee() > this.getFin().getOrdonnee()) {
				position = new Coordonnees(this.getFin().getAbscisse(), this.getFin().getOrdonnee());
			}
			else if(this.getDebut().getAbscisse() > this.getFin().getAbscisse() && this.getDebut().getOrdonnee() < this.getFin().getOrdonnee()) {
				position = new Coordonnees(this.getFin().getAbscisse(), this.getDebut().getOrdonnee());
			}
			else if(this.getDebut().getAbscisse() < this.getFin().getAbscisse() && this.getDebut().getOrdonnee() > this.getFin().getOrdonnee()) {
				position = new Coordonnees(this.getDebut().getAbscisse(), this.getFin().getOrdonnee());
			}
			else {
				position = new Coordonnees(this.getDebut().getAbscisse(), this.getDebut().getOrdonnee());
			}
			
			ellipse.setLargeur(largeur);
			ellipse.setHauteur(hauteur);
			ellipse.setPosition(position);
		}
		
		ellipse.setCouleur(this.getPanneauDessin().getCouleurCourante());
		ellipse.setRempli(this.getPanneauDessin().getModeRemplissage());
		
		return new VueEllipse(ellipse);
	}
}
