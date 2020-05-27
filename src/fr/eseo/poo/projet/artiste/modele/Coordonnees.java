package fr.eseo.poo.projet.artiste.modele;

import java.lang.Math;
import java.text.DecimalFormat;


public class Coordonnees{
    
	public static final double ABSCISSE_PAR_DEFAUT = 0;
	public static final double ORDONNEE_PAR_DEFAUT = 0;
	
	private double abscisse = 0;
    private double ordonnee = 0;

    public Coordonnees(double abscisse, double ordonnee){
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    public Coordonnees(){
        this(ABSCISSE_PAR_DEFAUT,ORDONNEE_PAR_DEFAUT);
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }

    public double getAbscisse(){
        return abscisse;
    }

    public double getOrdonnee(){
        return ordonnee;
    }

    public void deplacerVers(double nouvelleAbcisse, double nouvelleOrdonnee){
        this.abscisse = nouvelleAbcisse;
        this.ordonnee = nouvelleOrdonnee;
    }
    public void deplacerDe(double deltaX, double deltaY){
        this.abscisse += deltaX;
        this.ordonnee += deltaY;
    }

    public double distanceVers(Coordonnees autre){
        return Math.sqrt(Math.pow(autre.abscisse - this.abscisse, 2) + Math.pow(autre.ordonnee - this.ordonnee, 2));
    }

    public double angleVers(Coordonnees autre){
        return Math.atan2(autre.ordonnee - this.ordonnee, autre.abscisse - this.abscisse);
    }

	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#0.0#");
		return "(" + decimalFormat.format(abscisse) + " , " + decimalFormat.format(ordonnee) + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(abscisse);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ordonnee);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordonnees other = (Coordonnees) obj;
		if (Double.doubleToLongBits(abscisse) != Double.doubleToLongBits(other.abscisse))
			return false;
		if (Double.doubleToLongBits(ordonnee) != Double.doubleToLongBits(other.ordonnee))
			return false;
		return true;
	}
}
