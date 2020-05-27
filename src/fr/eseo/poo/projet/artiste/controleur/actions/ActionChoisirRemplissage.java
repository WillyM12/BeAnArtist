package fr.eseo.poo.projet.artiste.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class ActionChoisirRemplissage extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Remplissage";
	
	private PanneauDessin panneauDessin;

	public ActionChoisirRemplissage(PanneauDessin panneauDessin) {
		super(NOM_ACTION);
		this.panneauDessin = panneauDessin;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		this.panneauDessin.setModeRemplissage(!this.panneauDessin.getModeRemplissage());
	}
}
