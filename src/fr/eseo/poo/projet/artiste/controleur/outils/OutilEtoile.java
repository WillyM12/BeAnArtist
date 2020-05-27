package fr.eseo.poo.projet.artiste.controleur.outils;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Etoile;
import fr.eseo.poo.projet.artiste.vue.formes.VueEtoile;
import fr.eseo.poo.projet.artiste.vue.formes.VueForme;
import fr.eseo.poo.projet.artiste.vue.ihm.PanneauBarreOutils;

public class OutilEtoile extends OutilForme {

	private PanneauBarreOutils panneauBarreOutil;
	
	public OutilEtoile(PanneauBarreOutils panneauBarreOutils) {
		this.panneauBarreOutil = panneauBarreOutils;
	}
	@Override
	protected VueForme creerVueForme() {
		Etoile etoile;
		Coordonnees position;
		double taille;
		
		if (this.getFin() != null && ((int)this.getFin().getAbscisse() != (int)this.getDebut().getAbscisse()) && ((int)this.getFin().getOrdonnee() != (int)this.getDebut().getOrdonnee())) {
			etoile = new Etoile();
			
			taille = this.getDebut().distanceVers(this.getFin())*2;
			position = new Coordonnees(this.getFin().getAbscisse() - taille/2, this.getFin().getOrdonnee() - taille/2);
			
			etoile.setPosition(position);
			etoile.setLargeur(taille);
			etoile.setNombreBranches(this.panneauBarreOutil.getNbBranches());
			etoile.setAnglePremiereBranche(this.getFin().angleVers(this.getDebut()));
			etoile.setLongueurBranche(this.panneauBarreOutil.getLongueurBranche());
		}
		else {
			etoile = new Etoile(this.getDebut());
		}
		
		etoile.setCouleur(this.getPanneauDessin().getCouleurCourante());
		etoile.setRempli(this.getPanneauDessin().getModeRemplissage());
		
		return new VueEtoile(etoile);
	}
}
