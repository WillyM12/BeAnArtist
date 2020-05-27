package fr.eseo.poo.projet.artiste.modele.formes;

import java.text.DecimalFormat;
import java.util.Locale;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Forme;

public class Ligne extends Forme{
	
	public static final double EPSILON = 0.5;

	public Ligne(Coordonnees position, double largeur, double hauteur){
		super(position, largeur, hauteur);
	}
	
	public Ligne(){
		this(new Coordonnees(), Forme.LARGEUR_PAR_DEFAUT, Forme.HAUTEUR_PAR_DEFAUT);
	}
	
	public Ligne(double largeur, double hauteur){
		this(new Coordonnees(), largeur, hauteur);
	}
	
	public Ligne(double x, double y, double largeur, double hauteur){
		this(new Coordonnees(x,y),largeur,hauteur);
	}
	
	public Ligne(Coordonnees position){
		this(position, Forme.LARGEUR_PAR_DEFAUT, Forme.HAUTEUR_PAR_DEFAUT);
	}

	public Coordonnees getC1() {
		return this.getPosition();
	}
	
	public Coordonnees getC2() {
		return new Coordonnees(super.getLargeur()+this.getC1().getAbscisse(),super.getHauteur()+this.getC1().getOrdonnee());
	}
	
	public void setC1(Coordonnees c1) {
		Coordonnees tamponC2 = this.getC2();
		super.setHauteur(tamponC2.getOrdonnee() - c1.getOrdonnee());
		super.setLargeur(tamponC2.getAbscisse() - c1.getAbscisse());
		super.setPosition(c1);
	}
	
	public void setC2(Coordonnees c2) {
		super.setHauteur(c2.getOrdonnee() - this.getPosition().getOrdonnee());
		super.setLargeur(c2.getAbscisse() - this.getPosition().getAbscisse());
	}
	
	public double getCadreMinX() {
		if (getC1().getAbscisse() < getC2().getAbscisse()) {
			return getC1().getAbscisse();
		}
		else {
			return getC2().getAbscisse();
		}
	}
	
	public double getCadreMinY() {
		if (getC1().getOrdonnee() < getC2().getOrdonnee()) {
			return getC1().getOrdonnee();
		}
		else {
			return getC2().getOrdonnee();
		}
	}
	
	public double getCadreMaxX() {
		if (getC1().getAbscisse() > getC2().getAbscisse()) {
			return getC1().getAbscisse();
		}
		else {
			return getC2().getAbscisse();
		}
	}
	
	public double getCadreMaxY() {
		if (getC1().getOrdonnee() > getC2().getOrdonnee()) {
			return getC1().getOrdonnee();
		}
		else {
			return getC2().getOrdonnee();
		}
	}
	
	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#0.0#");
		double angleDeg;
		String valeurs;
		String couleur;
		Locale locale = Locale.getDefault();
		if (getC1().angleVers(getC2()) < 0 ) {
			angleDeg = ((getC1().angleVers(getC2()) + 2*Math.PI) * 180) / Math.PI;
		}
		else {
			angleDeg = (getC1().angleVers(getC2()) * 180) / Math.PI;
		}
		valeurs = "[" + getClass().getSimpleName() + "] c1 : (" + decimalFormat.format(getC1().getAbscisse()) + " , " + decimalFormat.format(getC1().getOrdonnee()) + ") c2 : (" + decimalFormat.format(getC2().getAbscisse()) + " , " + decimalFormat.format(getC2().getOrdonnee()) + ") longueur : " + decimalFormat.format(perimetre()) + " angle : " + decimalFormat.format(angleDeg) + "°";
		if (locale.getLanguage() == "fr") {
			 couleur = " couleur = R" + getCouleur().getRed() + ",V" + getCouleur().getGreen() + ",B" + getCouleur().getBlue();
		}
		else {
			 couleur = " couleur = R" + getCouleur().getRed() + ",G" + getCouleur().getGreen() + ",B" + getCouleur().getBlue();
		}
		return valeurs+couleur;
	}

	public double aire() {
		return 0;
	}
	
	public double perimetre() {
		return Math.sqrt((Math.pow(super.getHauteur(), 2))+Math.pow(super.getLargeur(), 2));
	}
	
	public boolean contient(Coordonnees coordonnees) {
		double distanceC1_c = Math.sqrt(Math.pow(coordonnees.getAbscisse() - getC1().getAbscisse(), 2) + (Math.pow(coordonnees.getOrdonnee() - getC1().getOrdonnee(), 2)));
		double distanceC2_c = Math.sqrt(Math.pow(coordonnees.getAbscisse() - getC2().getAbscisse(), 2) + (Math.pow(coordonnees.getOrdonnee() - getC2().getOrdonnee(), 2)));
		if (Math.abs(perimetre() - (distanceC1_c + distanceC2_c)) <= EPSILON) {
			return true;
		}
		else {
			return false;
		}
	}
}
