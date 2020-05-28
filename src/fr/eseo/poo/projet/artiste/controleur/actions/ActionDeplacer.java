package fr.eseo.poo.projet.artiste.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.poo.projet.artiste.controleur.outils.OutilDeplacer;
import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class ActionDeplacer extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Deplacer";
	
	private PanneauDessin panneauDessin;
	
	public ActionDeplacer(PanneauDessin panneauDessin) {
		super(NOM_ACTION);
		this.panneauDessin = panneauDessin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.panneauDessin.associerOutil(new OutilDeplacer());
	}

}
