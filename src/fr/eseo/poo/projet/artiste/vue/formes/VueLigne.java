package fr.eseo.poo.projet.artiste.vue.formes;

import java.awt.Color;
import java.awt.Graphics2D;

import fr.eseo.poo.projet.artiste.modele.formes.Ligne;

public class VueLigne extends VueForme {
	
	public VueLigne(Ligne ligne) {
		super(ligne);
	}

	@Override
	public void affiche(Graphics2D g2d) {
		Ligne ligne = (Ligne)super.forme;
		Color colorSave = g2d.getColor();
		g2d.setColor(super.getForme().getCouleur());
		g2d.drawLine((int)Math.round(ligne.getC1().getAbscisse()), (int)Math.round(ligne.getC1().getOrdonnee()), (int)Math.round(ligne.getC2().getAbscisse()), (int)Math.round(ligne.getC2().getOrdonnee()));
		g2d.setColor(colorSave);
	}
}
