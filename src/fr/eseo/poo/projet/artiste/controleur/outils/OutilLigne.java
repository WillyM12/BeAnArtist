package fr.eseo.poo.projet.artiste.controleur.outils;

import fr.eseo.poo.projet.artiste.modele.formes.Ligne;
import fr.eseo.poo.projet.artiste.vue.formes.VueForme;
import fr.eseo.poo.projet.artiste.vue.formes.VueLigne;

public class OutilLigne extends OutilForme {

	@Override
	protected VueForme creerVueForme() {
		Ligne ligne = new Ligne(this.getDebut());
		if(this.getFin() != null && ((int)this.getFin().getAbscisse() != (int)this.getDebut().getAbscisse()) && ((int)this.getFin().getOrdonnee() != (int)this.getDebut().getOrdonnee())){
			ligne.setC2(this.getFin());
		}
		ligne.setCouleur(super.getPanneauDessin().getCouleurCourante());
		return new VueLigne(ligne);
	}
}
