package fr.eseo.poo.projet.artiste.controleur.outils;

import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import fr.eseo.poo.projet.artiste.controleur.actions.ActionSelectionner;
import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Forme;
import fr.eseo.poo.projet.artiste.vue.formes.VueForme;

public class OutilSelectionner extends Outil {

	private Forme formeSelectionee;
	
	public void mouseClicked (MouseEvent event) {
		for (VueForme uneVueForme : super.getPanneauDessin().getVueFormes()) {
			if (uneVueForme.getForme().contient(new Coordonnees(event.getX(), event.getY()))) {
				this.formeSelectionee = uneVueForme.getForme();
			}
		}
		if (this.formeSelectionee != null) {
			JOptionPane.showMessageDialog(super.getPanneauDessin(), this.formeSelectionee.toString(), ActionSelectionner.NOM_ACTION, JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
