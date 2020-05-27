package fr.eseo.poo.projet.artiste.modele;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoordonneesTestsetX {

	private static final double EPSILON = 1e-2d;
	
	@Test
	public void coordonnesTestsetXPos() {
		Coordonnees c1 = new Coordonnees();
		c1.setAbscisse(4);
		
		assertEquals("Test du déplacement positif de l'abscisse de c1",4, c1.getAbscisse(), EPSILON);
	}
	
	@Test
	public void coordonnesTestsetXNul() {
		Coordonnees c1 = new Coordonnees();
		c1.setAbscisse(0);
		
		assertEquals("Test du déplacement nul de l'abscisse de c1",0, c1.getAbscisse(), EPSILON);
	}
	
	@Test
	public void coordonnesTestsetXNeg() {
		Coordonnees c1 = new Coordonnees();
		c1.setAbscisse(-2);
		
		assertEquals("Test du déplacement négatif de l'abscisse de c1",-2, c1.getAbscisse(), EPSILON);
	}
	
	@Test
	public void coordonnesTestsetXDec() {
		Coordonnees c1 = new Coordonnees();
		c1.setAbscisse(2.456);
		
		assertEquals("Test du déplacement décimal de l'abscisse de c1",2.456, c1.getAbscisse(), EPSILON);
	}
}
