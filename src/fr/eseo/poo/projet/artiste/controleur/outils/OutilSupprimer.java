package fr.eseo.poo.projet.artiste.controleur.outils;

import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import fr.eseo.poo.projet.artiste.controleur.actions.ActionSupprimer;
import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.vue.formes.VueForme;

public class OutilSupprimer extends Outil {

	private VueForme vueFormeSelectionee;
	
	public void mouseClicked (MouseEvent event) {
		for (VueForme uneVueForme : super.getPanneauDessin().getVueFormes()) {
			if (uneVueForme.getForme().contient(new Coordonnees(event.getX(), event.getY()))) {
				this.vueFormeSelectionee = uneVueForme;
			}
		}
		if (this.vueFormeSelectionee != null) {
			int answer = JOptionPane.showConfirmDialog(super.getPanneauDessin(), "Êtes-vous sûr de vouloir supprimer : " + this.vueFormeSelectionee.getForme().toString() + " ?", ActionSupprimer.NOM_ACTION, JOptionPane.YES_NO_OPTION);
			if (answer == JOptionPane.YES_OPTION)
				super.getPanneauDessin().supprimerVueForme(this.vueFormeSelectionee);
				super.getPanneauDessin().repaint();
				this.vueFormeSelectionee = null;
		}
	}
}
