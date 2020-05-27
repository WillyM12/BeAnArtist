package fr.eseo.poo.projet.artiste.controleur.actions;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JColorChooser;

import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class ActionChoisirCouleur extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String NOM_ACTION = "Choisir couleur";
	
	private PanneauDessin panneauDessin;
	
	public ActionChoisirCouleur(PanneauDessin panneauDessin) {
		super(NOM_ACTION);
		this.panneauDessin = panneauDessin;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		Color couleur = JColorChooser.showDialog(this.panneauDessin, ActionChoisirCouleur.NOM_ACTION, this.panneauDessin.getCouleurCourante());
		this.panneauDessin.setCouleurCourante(couleur);
		
	}

}
