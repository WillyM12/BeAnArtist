package fr.eseo.poo.projet.artiste.modele.formes;

import java.text.DecimalFormat;
import java.util.Locale;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class Cercle extends Ellipse {	
	
	public Cercle(Coordonnees position, double taille){
		super(position, taille ,taille);
		super.setRempli(false);
	}
	
	public Cercle(){
		this(new Coordonnees(), LARGEUR_PAR_DEFAUT);
	}
	
	public Cercle(double taille){
		this(new Coordonnees(), taille);
	}
	
	public Cercle(double x, double y, double taille){ 
		this(new Coordonnees(x,y),taille);
	}
	
	public Cercle(Coordonnees position){
		this(position, LARGEUR_PAR_DEFAUT);
	}
	
	public void setLargeur(double largeur){
		if (largeur <= 0) {
			throw new IllegalArgumentException("Attention : Taille négative impossible !");
		}
		else {
			super.setLargeur(largeur);
			super.setHauteur(largeur);
		}
	}
	
	public void setHauteur(double hauteur) {
		if (hauteur <= 0) {
			throw new IllegalArgumentException("Attention : Taille négative impossible !");
		}
		else {
			super.setLargeur(hauteur);
			super.setHauteur(hauteur);	
		}
	}
	
	public double perimetre() {
		return 2*Math.PI*(super.getLargeur()/2);
	}
	
	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#0.0#");
		Locale locale = Locale.getDefault();
		String nomClasse;
		String remplissage;
		String valeurs;
		String couleur;
		
		nomClasse = "[" + getClass().getSimpleName();
		
		if (estRempli()) {
			remplissage = "-Rempli";
		}
		else {
			remplissage = "";
		}
		
		valeurs =  "] : pos (" + decimalFormat.format(super.getPosition().getAbscisse()) + " , " + decimalFormat.format(super.getPosition().getOrdonnee()) + ") dim " + decimalFormat.format(super.getLargeur()) + " x " + decimalFormat.format(super.getHauteur()) + " périmètre : " + decimalFormat.format(perimetre()) + " aire : " + decimalFormat.format(super.aire());
		if (locale.getLanguage() == "fr") {
			 couleur = " couleur = R" + getCouleur().getRed() + ",V" + getCouleur().getGreen() + ",B" + getCouleur().getBlue();
		}
		else {
			 couleur = " couleur = R" + getCouleur().getRed() + ",G" + getCouleur().getGreen() + ",B" + getCouleur().getBlue();
		}
		return nomClasse+remplissage+valeurs+couleur;
	}
}
