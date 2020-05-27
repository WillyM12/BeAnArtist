package fr.eseo.poo.projet.artiste.modele;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CoordonneesDeplacerVersTest {

	private static final double EPSILON = 1e-2d;
	
	Coordonnees c1 = new Coordonnees(0,0);
	
	@Test
	public void DeplacerVersPosPos() {
		c1.deplacerVers(2,3);
		
		assertEquals("Test deplacerVers abscisse positive de Coordonnees",2,c1.getAbscisse(), EPSILON);
		assertEquals("Test deplacerVers ordonnee positive de Coordonnees",3,c1.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void DeplacerVersNegPos() {
		c1.deplacerVers(-2,3);
		
		assertEquals("Test deplacerVers abscisse négative de Coordonnees",-2,c1.getAbscisse(), EPSILON);
		assertEquals("Test deplacerVers ordonnee positive de Coordonnees",3,c1.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void DeplacerVersPosNeg() {
		c1.deplacerVers(2,-3);
		
		assertEquals("Test deplacerVers abscisse positive de Coordonnees",2,c1.getAbscisse(), EPSILON);
		assertEquals("Test deplacerVers ordonnee négative de Coordonnees",-3,c1.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void DeplacerVersNegNeg() {
		c1.deplacerVers(-2,-3);
		
		assertEquals("Test deplacerVers abscisse négative de Coordonnees",-2,c1.getAbscisse(), EPSILON);
		assertEquals("Test deplacerVers ordonnee négative de Coordonnees",-3,c1.getOrdonnee(), EPSILON);
	}
	

	@Test
	public void DeplacerVersDecim() {
		c1.deplacerVers(2.3,4.5);
		
		assertEquals("Test deplacerVers abscisse décimal de Coordonnees",2.3,c1.getAbscisse(), EPSILON);
		assertEquals("Test deplacerVers ordonnee décimal de Coordonnees",4.5,c1.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void DeplacerVersNul() {
		c1.deplacerVers(0,0);
		
		assertEquals("Test deplacerVers abscisse nulle de Coordonnees",0,c1.getAbscisse(), EPSILON);
		assertEquals("Test deplacerVers ordonnee nulle de Coordonnees",0,c1.getOrdonnee(), EPSILON);
	}
}
