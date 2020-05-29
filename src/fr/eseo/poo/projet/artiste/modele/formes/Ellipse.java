package fr.eseo.poo.projet.artiste.modele.formes;

import java.text.DecimalFormat;
import java.util.Locale;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.Remplissable;
import fr.eseo.poo.projet.artiste.modele.formes.Forme;

public class Ellipse extends Forme implements Remplissable{
	
	public static final String NOM_FORME = "Ellipse";
	
	private boolean modeRemplissage;
	
	public Ellipse(Coordonnees position, double largeur, double hauteur){
		super(position);
		this.setLargeur(largeur);
		this.setHauteur(hauteur);
		this.setRempli(false);
	}
	
	public Ellipse(){
		this(new Coordonnees(), LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
	}
	
	public Ellipse(double largeur, double hauteur){
		this(new Coordonnees(), largeur, hauteur);
	}
	
	public Ellipse(double x, double y, double largeur, double hauteur){
		this(new Coordonnees(x,y),largeur,hauteur);
	}
	
	public Ellipse(Coordonnees position){
		this(position, LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
	}
	
	public void setLargeur(double largeur) {
		if (largeur < 0) {
			throw new IllegalArgumentException("Attention : Largeur négative impossible !");
		}
		else {
			super.setLargeur(largeur);
		}
	}
	
	public void setHauteur(double hauteur) {
		if (hauteur < 0) {
			throw new IllegalArgumentException("Attention : Hauteur négative impossible !");
		}
		else {
			super.setHauteur(hauteur);	
		}
	}
	
	public double aire(){
		return Math.PI*(getHauteur()/2)*(getLargeur()/2);
	}
	
	public double perimetre(){
		double a;
		double b;
		if (super.getHauteur() < super.getLargeur()) {
			a = super.getHauteur()/2;
			b = super.getLargeur()/2;
		}
		else {
			a = super.getLargeur()/2;
			b = super.getHauteur()/2;
		}
		double h = Math.pow((a-b) / (a+b), 2);
		return Math.PI*(a+b) * (1 + ((3*h) / (10+Math.sqrt(4-3*h))));
	}

	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#0.0#");
		Locale locale = Locale.getDefault();
		String nomClasse;
		String valeurs;
		String couleur;
		String remplissage;
		
		nomClasse = "[" + getClass().getSimpleName();
		
		if (estRempli()) {
			remplissage = "-Rempli";
		}
		else {
			remplissage = "";
		}
		
		valeurs =  "] : pos (" + decimalFormat.format(super.getPosition().getAbscisse()) + " , " + decimalFormat.format(super.getPosition().getOrdonnee()) + ") dim " + decimalFormat.format(super.getLargeur()) + " x " + decimalFormat.format(super.getHauteur()) + " périmètre : " + decimalFormat.format(perimetre()) + " aire : " + decimalFormat.format(aire());
		if (locale.getLanguage() == "fr") {
			 couleur = " couleur = R" + getCouleur().getRed() + ",V" + getCouleur().getGreen() + ",B" + getCouleur().getBlue();
		}
		else {
			 couleur = " couleur = R" + getCouleur().getRed() + ",G" + getCouleur().getGreen() + ",B" + getCouleur().getBlue();
		}
		return nomClasse+remplissage+valeurs+couleur;
	}
	
	public boolean contient(Coordonnees coordonnees) {
		Coordonnees ellipseCentre = new Coordonnees((getCadreMinX() + getCadreMaxX()) / 2, (getCadreMinY() + getCadreMaxY()) / 2);
		double a = Math.abs(getCadreMaxX() - getCadreMinX()) / 2;
		double b = Math.abs(getCadreMaxY() - getCadreMinY()) / 2;
		if ((Math.pow(((coordonnees.getAbscisse() - ellipseCentre.getAbscisse()) / a), 2) + (Math.pow(((coordonnees.getOrdonnee() - ellipseCentre.getOrdonnee()) / b), 2))) <= 1){
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean estRempli() {
		return this.modeRemplissage;
	}

	@Override
	public void setRempli(boolean modeRemplissage) {
		this.modeRemplissage = modeRemplissage;
	}
	
	
}
