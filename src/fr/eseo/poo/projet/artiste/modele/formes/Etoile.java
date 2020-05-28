package fr.eseo.poo.projet.artiste.modele.formes;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.Remplissable;

public class Etoile extends Forme implements Remplissable{

	public static final int NOMBRE_BRANCHES_PAR_DEFAUT = 5;
	public static final double ANGLE_PREMIERE_BRANCHE_PAR_DEFAUT = -Math.PI/2;
	public static final double LONGUEUR_BRANCHE_PAR_DEFAUT = 0.5;
	
	private List<Coordonnees> coordonnees;
	private int nombreBranches;
	private double anglePremiereBranche;
	private double longueurBranche;
	private boolean modeRemplissage;
	
	public Etoile(Coordonnees position, double taille, int nombreBranches, double anglePremiereBranche, double longueurBranche) {
		super(position, taille, taille);
		coordonnees = new ArrayList<Coordonnees>();
		this.setRempli(false);
		this.setLargeur(taille);
		this.setNombreBranches(nombreBranches);
		this.setAnglePremiereBranche(anglePremiereBranche);
		this.setLongueurBranche(longueurBranche);
		this.creerEtoile(position, taille, nombreBranches, anglePremiereBranche, longueurBranche);
	}
	
	public Etoile() {
		this(new Coordonnees(), LARGEUR_PAR_DEFAUT, NOMBRE_BRANCHES_PAR_DEFAUT, ANGLE_PREMIERE_BRANCHE_PAR_DEFAUT, LONGUEUR_BRANCHE_PAR_DEFAUT);
	}
	
	public Etoile(double taille) {
		this(new Coordonnees(), taille, NOMBRE_BRANCHES_PAR_DEFAUT, ANGLE_PREMIERE_BRANCHE_PAR_DEFAUT, LONGUEUR_BRANCHE_PAR_DEFAUT);
	}
	
	public Etoile(Coordonnees coordonnees) {
		this(coordonnees, LARGEUR_PAR_DEFAUT, NOMBRE_BRANCHES_PAR_DEFAUT, ANGLE_PREMIERE_BRANCHE_PAR_DEFAUT, LONGUEUR_BRANCHE_PAR_DEFAUT);
	}
	
	public Etoile(Coordonnees coordonnees, double taille) {
		this(coordonnees, taille, NOMBRE_BRANCHES_PAR_DEFAUT, ANGLE_PREMIERE_BRANCHE_PAR_DEFAUT, LONGUEUR_BRANCHE_PAR_DEFAUT);
	}
	
	private void creerEtoile(Coordonnees position, double taille, int nombreBranches, double anglePremiereBranche, double longueurBranche) {
		double rayon = taille / 2;
		double peak;
		String sommet = "top";
		
		this.coordonnees.clear();
		
		peak = anglePremiereBranche;
		
		for (int i = 0; i < nombreBranches*2; i++) {
			if (sommet == "top") {
				coordonnees.add(new Coordonnees((super.getPosition().getAbscisse()+taille) - (rayon - (Math.cos(peak)*rayon)), (super.getPosition().getOrdonnee()+taille) - (rayon - (Math.sin(peak)*rayon))));
				sommet = "bottom";
			}
			else {
				coordonnees.add(new Coordonnees((super.getPosition().getAbscisse()+taille) - (rayon - (Math.cos(peak)*rayon*(1-longueurBranche))), (super.getPosition().getOrdonnee()+taille) - (rayon - (Math.sin(peak)*rayon*(1-longueurBranche)))));
				sommet = "top";
			}

			if (peak+(Math.PI/nombreBranches) > Math.PI) {
				peak = (peak+(Math.PI/nombreBranches)) + 2*Math.PI;
			}
			else {
				peak = peak+(Math.PI/nombreBranches);
			}

		}
	}
	
	public void setHauteur(double hauteur) {
		if (hauteur <= 0) {
			throw new IllegalArgumentException("Attention : Taille négative ou nulle impossible !");
		}
		else {	
			this.creerEtoile(super.getPosition(), hauteur, this.nombreBranches, this.anglePremiereBranche, this.longueurBranche);
			super.setLargeur(hauteur);
			super.setHauteur(hauteur);
		}
	}
	
	public void setLargeur(double largeur) {
		if (largeur <= 0) {
			throw new IllegalArgumentException("Attention : Taille négative ou nulle impossible !");
		}
		else {
			this.creerEtoile(super.getPosition(), largeur, this.nombreBranches, this.anglePremiereBranche, this.longueurBranche);
			super.setLargeur(largeur);
			super.setHauteur(largeur);
		}
	}
	
	public void setPosition(Coordonnees position) {
		super.setPosition(position);
		this.creerEtoile(position, super.getLargeur(), this.nombreBranches, this.anglePremiereBranche, this.longueurBranche);
	}

	public int getNombreBranches() {
		return nombreBranches;
	}

	public void setNombreBranches(int nombreBranches) {
		if (nombreBranches < 3 || nombreBranches > 15) {
			throw new IllegalArgumentException("Attention : Le nombre de branche dois être compris entre 3 et 15 !");
		}
		else {
			this.creerEtoile(super.getPosition(), super.getLargeur(), nombreBranches, this.anglePremiereBranche, this.longueurBranche);
			this.nombreBranches = nombreBranches;
		}
	}

	public double getAnglePremiereBranche() {
		return anglePremiereBranche;
	}

	public void setAnglePremiereBranche(double anglePremiereBranche) {
		if (anglePremiereBranche < -Math.PI || anglePremiereBranche > Math.PI) {
			throw new IllegalArgumentException("Attention : L'angle de la première branche doit être compris entre -Pi et Pi !");
		}
		else {
			this.creerEtoile(super.getPosition(), super.getLargeur(), this.nombreBranches, anglePremiereBranche, this.longueurBranche);
			this.anglePremiereBranche = anglePremiereBranche;
		}
	}

	public double getLongueurBranche() {
		return longueurBranche;
	}

	public void setLongueurBranche(double longueurBranche) {
		if (longueurBranche < 0.0 || longueurBranche > 1.0) {
			throw new IllegalArgumentException("Attention : La longueur des branches doit être compris entre 0.0 et 1.0  !");
		}
		else {
			this.creerEtoile(super.getPosition(), super.getLargeur(), this.nombreBranches, this.anglePremiereBranche, longueurBranche);
			this.longueurBranche = longueurBranche;
		}
	}
	
	public List<Coordonnees> getCoordonnees(){
		return this.coordonnees;
	}

	@Override
	public double perimetre() {
		double perimetre;
		Ligne ligneBranche = new Ligne();
		ligneBranche.setC1(this.coordonnees.get(0));
		ligneBranche.setC2(this.coordonnees.get(1));
		double tailleLigneBranche = ligneBranche.perimetre();
		perimetre = tailleLigneBranche*this.nombreBranches*2;
		return perimetre;
	}

	@Override
	public double aire() {
		//Une étoile est consistué d'autant de cerf-volant que de branches
		//Aire d'un cerf-volant de l'étoile
		double largeurBranche = this.coordonnees.get(1).distanceVers(this.coordonnees.get(3));
			
		//Aired'un cerf-volant de létoile
		double aireCerfVolant = largeurBranche * (this.getLargeur() / 2) / 2;
		
		//Aire de l'étoile
		double aireEtoile = aireCerfVolant*getNombreBranches();
		return aireEtoile;
	}

	@Override
	public boolean contient(Coordonnees coordonnees) {
		//Programme (en python) récupérer du site : https://en.wikipedia.org/wiki/Even%E2%80%93odd_rule
		int nombreCoordonnees = this.coordonnees.size();
		int i;
		int j = nombreCoordonnees - 1;
		boolean coordInForme = false;
		for (i = 0; i < nombreCoordonnees; i++) {
			if (((this.coordonnees.get(i).getOrdonnee() > coordonnees.getOrdonnee()) != (this.coordonnees.get(j).getOrdonnee() > coordonnees.getOrdonnee())) 
					&& (coordonnees.getAbscisse() < this.coordonnees.get(i).getAbscisse() + (this.coordonnees.get(j).getAbscisse() - this.coordonnees.get(i).getAbscisse())
							*(coordonnees.getOrdonnee() - this.coordonnees.get(i).getOrdonnee())
								/ (this.coordonnees.get(j).getOrdonnee() - this.coordonnees.get(i).getOrdonnee()))){
				coordInForme = !coordInForme;				
			}
			j = i;
		}
		return coordInForme;
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

	@Override
	public boolean estRempli() {
		return this.modeRemplissage;
	}

	@Override
	public void setRempli(boolean modeRemplissage) {
		this.modeRemplissage = modeRemplissage;
	}

}
