package fr.eseo.poo.projet.artiste.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.poo.projet.artiste.controleur.outils.OutilSelectionner;
import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class ActionSelectionner extends AbstractAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Selectionner";
	
	
	private PanneauDessin panneauDessin;
	
	public ActionSelectionner(PanneauDessin panneauDessin) {
		super(NOM_ACTION);
		this.panneauDessin = panneauDessin;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		this.panneauDessin.associerOutil(new OutilSelectionner());
	}
}
