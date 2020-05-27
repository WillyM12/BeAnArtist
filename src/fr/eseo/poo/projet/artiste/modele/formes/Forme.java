package fr.eseo.poo.projet.artiste.modele.formes;

import java.awt.Color;


import javax.swing.UIManager;

import fr.eseo.poo.projet.artiste.modele.Coloriable;
import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public abstract class Forme implements Coloriable{
	public static final double LARGEUR_PAR_DEFAUT = 100;
	public static final double HAUTEUR_PAR_DEFAUT = 100;
	public static final Color COULEUR_PAR_DEFAUT = UIManager.getColor("Panel.foreground");
	
	private double largeur, hauteur;
	private Coordonnees position;
	private Color couleur;
	
	public abstract double perimetre();
	public abstract double aire();
	public abstract boolean contient(Coordonnees coordonnees);
	
	public Forme(Coordonnees position, double largeur, double hauteur){
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.position = position;
		setCouleur(Forme.COULEUR_PAR_DEFAUT);
	}
	
	public Forme(){
		this(new Coordonnees(), LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
	}
	
	public Forme(double largeur, double hauteur){
		this(new Coordonnees(), largeur, hauteur);
	}
	
	public Forme(double x, double y, double largeur, double hauteur){
		this(new Coordonnees(x,y),largeur,hauteur);
	}
	
	public Forme(Coordonnees position){
		this(position,LARGEUR_PAR_DEFAUT,HAUTEUR_PAR_DEFAUT);
	}
	

	public Coordonnees getPosition(){
		return position;
	}
		
	public void setPosition(Coordonnees position){
		this.position=position;
	}
		
	public double getLargeur(){
		return this.largeur;
	}
	
	public void setLargeur(double largeur){
		this.largeur=largeur;
	}
	
	public double getHauteur(){
		return this.hauteur;
	}
	
	public void setHauteur(double hauteur){
		this.hauteur=hauteur;
	}
	
	public double getX(){
		return getPosition().getAbscisse();
	}
	
	public void setX(double x){
		getPosition().setAbscisse(x);;
	}
	
	public double getY(){
		return getPosition().getOrdonnee();
	}
	
	public void setY(double y){
		getPosition().setOrdonnee(y);
	}
	
	public double getCadreMinX() {
		return getX();
	}
	
	public double getCadreMaxX() {
		return getX() + getLargeur();
	}
	
	public double getCadreMinY() {
		return getY();
	}
	
	public double getCadreMaxY() {
		return getY() + getHauteur();
	}
	
	public void deplacerVers(double x, double y){
		getPosition().deplacerVers(x,y);
	}
	
	public void deplacerDe(double deltaX, double deltaY){
		getPosition().deplacerDe(deltaX,deltaY);
	}
	
	public Color getCouleur() {
		return this.couleur;
	}
	
	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}

}
