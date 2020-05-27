package fr.eseo.poo.projet.artiste.modele;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoordonneesDeplacerDeTest {
	
	private static final double EPSILON = 1e-2d;
	
	Coordonnees c1 = new Coordonnees(0,0);
	
	@Test
	public void DeplacerDePosPos() {
		c1.deplacerDe(2,3);
		
		assertEquals("Test deplacerDe abscisse positives de Coordonnees",2,c1.getAbscisse(), EPSILON);
		assertEquals("Test deplacerDe ordonnee positives de Coordonnees",3,c1.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void DeplacerDeNegPos() {
		c1.deplacerDe(-2,3);
		
		assertEquals("Test deplacerDe abscisse négative de Coordonnees",-2,c1.getAbscisse(), EPSILON);
		assertEquals("Test deplacerDe ordonnee positives de Coordonnees",3,c1.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void DeplacerDePosNeg() {
		c1.deplacerDe(2,-3);
		
		assertEquals("Test deplacerDe abscisse positives de Coordonnees",2,c1.getAbscisse(), EPSILON);
		assertEquals("Test deplacerDe ordonnee négative de Coordonnees",-3,c1.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void DeplacerDeNegNeg() {
		c1.deplacerDe(-2,-3);
		
		assertEquals("Test deplacerDe abscisse négative de Coordonnees",-2,c1.getAbscisse(), EPSILON);
		assertEquals("Test deplacerDe ordonnee négative de Coordonnees",-3,c1.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void DeplacerDeDecim() {
		c1.deplacerDe(2.3,4.5);
		
		assertEquals("Test deplacerDe abscisse décimal de Coordonnees",2.3,c1.getAbscisse(), EPSILON);
		assertEquals("Test deplacerDe ordonnee décimal de Coordonnees",4.5,c1.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void DeplacerDeNul() {
		c1.deplacerDe(0,0);
		
		assertEquals("Test deplacerDe abscisse nulle de Coordonnees",0,c1.getAbscisse(), EPSILON);
		assertEquals("Test deplacerDe ordonnee nulle de Coordonnees",0,c1.getOrdonnee(), EPSILON);
	}
}
