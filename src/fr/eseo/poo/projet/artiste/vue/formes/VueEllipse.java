package fr.eseo.poo.projet.artiste.vue.formes;

import java.awt.Color;
import java.awt.Graphics2D;

import fr.eseo.poo.projet.artiste.modele.formes.Ellipse;

public class VueEllipse extends VueForme {
	
	public VueEllipse(Ellipse ellipse) {
		super(ellipse);
	}

	@Override
	public void affiche(Graphics2D g2d) {
		Color colorSave = g2d.getColor();
		
		Ellipse ellipse = (Ellipse)super.forme;
		g2d.setColor(ellipse.getCouleur());
		
		g2d.drawOval((int)Math.round(ellipse.getCadreMinX()), (int)Math.round(ellipse.getCadreMinY()), (int)Math.round(ellipse.getLargeur()), (int)Math.round(ellipse.getHauteur()));
		
		if (ellipse.estRempli()) {
			g2d.fillOval((int)Math.round(ellipse.getCadreMinX()), (int)Math.round(ellipse.getCadreMinY()), (int)Math.round(ellipse.getLargeur()), (int)Math.round(ellipse.getHauteur()));
		}
		g2d.setColor(colorSave);
	}
}
