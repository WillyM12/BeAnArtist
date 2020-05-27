package fr.eseo.poo.projet.artiste.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class ActionEffacer extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Effacer tout";
	
	private PanneauDessin panneauDessin;
	
	public ActionEffacer(PanneauDessin panneauDessin) {
		super(NOM_ACTION);
		this.panneauDessin = panneauDessin;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		int answer = JOptionPane.showConfirmDialog(this.panneauDessin, "Êtes-vous sûr de vouloir tout supprmier ?", NOM_ACTION, JOptionPane.YES_NO_OPTION);
		if (answer == JOptionPane.YES_OPTION) {
			this.panneauDessin.getVueFormes().clear();
			this.panneauDessin.repaint();
		}
	}
}
