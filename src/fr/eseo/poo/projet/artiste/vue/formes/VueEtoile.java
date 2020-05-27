package fr.eseo.poo.projet.artiste.vue.formes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Etoile;

public class VueEtoile extends VueForme {
	
	public VueEtoile(Etoile etoile) {
		super(etoile);
	}

	@Override
	public void affiche(Graphics2D g2d) {
		Etoile etoile = (Etoile)super.forme;
		List<Integer> xPoints = new ArrayList<Integer>();
		List<Integer> yPoints = new ArrayList<Integer>();
		Color colorSave = g2d.getColor();
		g2d.setColor(etoile.getCouleur());
		for (Coordonnees uneCoordonnee : ((Etoile)super.getForme()).getCoordonnees()) {
			xPoints.add((int)Math.round(uneCoordonnee.getAbscisse()));
			yPoints.add((int)Math.round(uneCoordonnee.getOrdonnee()));
		}
		GeneralPath etoilePath = new GeneralPath(GeneralPath.WIND_EVEN_ODD, xPoints.size());
		
		etoilePath.moveTo(xPoints.get(0), yPoints.get(0));
		
		for (int i = 1; i < xPoints.size(); i++) {
			etoilePath.lineTo(xPoints.get(i), yPoints.get(i));
		}
		etoilePath.closePath();
		g2d.draw(etoilePath);
		
		if (((Etoile)super.getForme()).estRempli()) {
			g2d.fill(etoilePath);
		}
		g2d.setColor(colorSave);
	}

}
