package fr.eseo.poo.projet.artiste.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.poo.projet.artiste.controleur.outils.OutilCercle;
import fr.eseo.poo.projet.artiste.controleur.outils.OutilEllipse;
import fr.eseo.poo.projet.artiste.controleur.outils.OutilEtoile;
import fr.eseo.poo.projet.artiste.controleur.outils.OutilLigne;
import fr.eseo.poo.projet.artiste.vue.ihm.PanneauBarreOutils;
import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class ActionChoisirForme extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION_LIGNE = "Ligne";
	public static final String NOM_ACTION_ELLIPSE = "Ellipse";
	public static final String NOM_ACTION_CERCLE = "Cercle";
	public static final String NOM_ACTION_ETOILE = "Etoile";
	
	private PanneauDessin panneauDessin;
	private PanneauBarreOutils panneauBarreOutils;
	
	public ActionChoisirForme(PanneauDessin panneauDessin, PanneauBarreOutils panneauBarreOutils, String nomAction) {
		super(nomAction);
		this.panneauDessin = panneauDessin;
		this.panneauBarreOutils = panneauBarreOutils;
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getActionCommand() == NOM_ACTION_LIGNE) {
			this.panneauDessin.associerOutil(new OutilLigne());
		}
		else if (event.getActionCommand() == NOM_ACTION_ELLIPSE) {
			this.panneauDessin.associerOutil(new OutilEllipse());
		}
		else if (event.getActionCommand() == NOM_ACTION_CERCLE) {
			this.panneauDessin.associerOutil(new OutilCercle());
		}
		else if (event.getActionCommand() == NOM_ACTION_ETOILE) {
			this.panneauDessin.associerOutil(new OutilEtoile(this.panneauBarreOutils));
		}
		else {
			throw new IllegalArgumentException("Attention : Pas d'action de ce nom !");
		}
	}
}
