package fr.eseo.poo.projet.artiste.controleur.outils;

import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Forme;
import fr.eseo.poo.projet.artiste.vue.formes.VueForme;

public class OutilRedimensionner extends Outil {
	
	private Forme formeSelectionee;

	public void mouseClicked (MouseEvent event) {
		for (VueForme uneVueForme : super.getPanneauDessin().getVueFormes()) {
			if (uneVueForme.getForme().contient(new Coordonnees(event.getX(), event.getY()))) {
				this.formeSelectionee = uneVueForme.getForme();
			}
		}
		if (this.formeSelectionee != null) {
			double taille = this.formeSelectionee.getLargeur();
			double largeur = this.formeSelectionee.getLargeur();
			double hauteur = this.formeSelectionee.getHauteur();
			String nomClasse = this.formeSelectionee.getClass().getSimpleName();
			
			if (nomClasse.equalsIgnoreCase("Cercle") || nomClasse.equalsIgnoreCase("Etoile")) {
				taille = Double.valueOf(JOptionPane.showInputDialog(super.getPanneauDessin(),"Taille : ", this.formeSelectionee.getLargeur()));
				try {
					this.formeSelectionee.setLargeur(taille);
				} catch(Exception e) {
					JOptionPane.showMessageDialog(super.getPanneauDessin(), "La taille ne peux pas être négative", "Erreur", JOptionPane.WARNING_MESSAGE);
				}
				
			}
			else if (nomClasse.equalsIgnoreCase("Ellipse")){
				largeur = Double.valueOf(JOptionPane.showInputDialog(super.getPanneauDessin(),"Largeur : ", this.formeSelectionee.getLargeur()));
				hauteur = Double.valueOf(JOptionPane.showInputDialog(super.getPanneauDessin(),"Hauteur : ", this.formeSelectionee.getHauteur()));
				
				try {
					this.formeSelectionee.setLargeur(largeur);
				} catch(Exception e) {
					JOptionPane.showMessageDialog(super.getPanneauDessin(), "La largeur ne peux pas être négative", "Erreur", JOptionPane.WARNING_MESSAGE);
				}
				
				try {
					this.formeSelectionee.setHauteur(hauteur);
				} catch(Exception e) {
					JOptionPane.showMessageDialog(super.getPanneauDessin(), "La hauteur ne peux pas être négative", "Erreur", JOptionPane.WARNING_MESSAGE);
				}	
			}
			else {
				largeur = Double.valueOf(JOptionPane.showInputDialog(super.getPanneauDessin(),"Largeur : ", this.formeSelectionee.getLargeur()));
				hauteur = Double.valueOf(JOptionPane.showInputDialog(super.getPanneauDessin(),"Hauteur : ", this.formeSelectionee.getHauteur()));
				this.formeSelectionee.setLargeur(largeur);
				this.formeSelectionee.setHauteur(hauteur);
			}
			super.getPanneauDessin().repaint();
			this.formeSelectionee = null;
		}
	}
}
