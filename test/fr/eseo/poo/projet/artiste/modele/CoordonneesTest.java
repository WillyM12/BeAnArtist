package fr.eseo.poo.projet.artiste.modele;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class CoordonneesTest {
	
	private static final double EPSILON = 1e-2d;
	
	@Test
	public void testConstructeur() {
		Coordonnees c1 = new Coordonnees ();
		
		assertEquals("Test du constructeur par défaut de Coordonnees",0,c1.getAbscisse(), EPSILON);
		assertEquals("Test du constructeur par défaut de Coordonnees",0,c1.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void testConstructeurPos() {
		Coordonnees c1 = new Coordonnees (2,4);
		
		assertEquals("Test du constructeur Double Double positif de Coordonnees",2,c1.getAbscisse(), EPSILON);
		assertEquals("Test du constructeur Double Double positif de Coordonnees",4,c1.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void testConstructeurNeg() {
		Coordonnees c1 = new Coordonnees (-2,-4);
		
		assertEquals("Test du constructeur Double Double négatif de Coordonnees",-2,c1.getAbscisse(), EPSILON);
		assertEquals("Test du constructeur Double Double négatif de Coordonnees",-4,c1.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void testConstructeurNegPos() {
		Coordonnees c1 = new Coordonnees (-2,4);
		
		assertEquals("Test du constructeur Double Double négatif_positif de Coordonnees",-2,c1.getAbscisse(), EPSILON);
		assertEquals("Test du constructeur Double Double négatif_positif de Coordonnees",4,c1.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void testConstructeurPosNeg() {
		Coordonnees c1 = new Coordonnees (2,-4);
		
		assertEquals("Test du constructeur Double Double positif_négatif de Coordonnees",2,c1.getAbscisse(), EPSILON);
		assertEquals("Test du constructeur Double Double positif_négatif de Coordonnees",-4,c1.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void testConstructeurNul() {
		Coordonnees c1 = new Coordonnees (0,0);
		
		assertEquals("Test du constructeur Double Double nul de Coordonnees",0,c1.getAbscisse(), EPSILON);
		assertEquals("Test du constructeur Double Double nul de Coordonnees",0,c1.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void testtoString() {
		Coordonnees c1 = new Coordonnees (0.100,0.100);
		
		assertEquals("Test de toString de Coordonnees","(0,1 , 0,1)",c1.toString());
	}
}
