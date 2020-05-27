package fr.eseo.poo.projet.artiste.modele;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoordonneesTestsetY {

	private static final double EPSILON = 1e-2d;
	
	@Test
	public void coordonnesTestsetYPos() {
		Coordonnees c1 = new Coordonnees();
		c1.setOrdonnee(4);
		
		assertEquals("Test du déplacement positif de l'abscisse de c1",4, c1.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void coordonnesTestsetYNul() {
		Coordonnees c1 = new Coordonnees();
		c1.setOrdonnee(0);
		
		assertEquals("Test du déplacement nul de l'abscisse de c1",0, c1.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void coordonnesTestsetYNeg() {
		Coordonnees c1 = new Coordonnees();
		c1.setOrdonnee(-2);
		
		assertEquals("Test du déplacement négatif de l'abscisse de c1",-2, c1.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void coordonnesTestsetYDec() {
		Coordonnees c1 = new Coordonnees();
		c1.setOrdonnee(2.456);
		
		assertEquals("Test du déplacement nul de l'abscisse de c1",2.456, c1.getOrdonnee(), EPSILON);
	}
}
