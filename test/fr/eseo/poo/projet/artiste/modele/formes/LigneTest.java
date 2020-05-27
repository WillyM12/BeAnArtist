package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.junit.Test;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Ligne;

public class LigneTest {
	
	private static final double EPSILON = 1e-3d;
	
	@Test
	public void testConstructeur() {
		Ligne l1 = new Ligne ();
		
		assertEquals("Test de la position l1",new Coordonnees() ,l1.getPosition());
		assertEquals("Test de la hauteur de l1",100,l1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de l1",100,l1.getLargeur(), EPSILON);
	}
	
	@Test
	public void testConstructeurPosPositive() {
		Ligne l1 = new Ligne (new Coordonnees(3,4));
		
		assertEquals("Test de la position l1",new Coordonnees(3,4) ,l1.getPosition());
		assertEquals("Test de la hauteur de l1",100,l1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de l1",100,l1.getLargeur(), EPSILON);
	}
	
	@Test
	public void testConstructeurPosNegative() {
		Ligne l1 = new Ligne (new Coordonnees(-3,-4));
		
		assertEquals("Test de la position l1",new Coordonnees(-3,-4) ,l1.getPosition());
		assertEquals("Test de la hauteur de l1",100,l1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de l1",100,l1.getLargeur(), EPSILON);
	}
	
	@Test
	public void testConstructeurPosDecimal() {
		Ligne l1 = new Ligne (new Coordonnees(-3.43,4.7867));
		
		assertEquals("Test de la position l1",new Coordonnees(-3.43,4.7867) ,l1.getPosition());
		assertEquals("Test de la hauteur de l1",100,l1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de l1",100,l1.getLargeur(), EPSILON);
	}
	
	@Test
	public void testConstructeurLongLargPositive() {
		Ligne l1 = new Ligne (3,4);
		
		assertEquals("Test de la position l1",new Coordonnees() ,l1.getPosition());
		assertEquals("Test de la hauteur de l1",4,l1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de l1",3,l1.getLargeur(), EPSILON);
	}
	
	@Test
	public void testConstructeurLongLargNegative() {
		Ligne l1 = new Ligne (-3,-4);
		
		assertEquals("Test de la position l1",new Coordonnees() ,l1.getPosition());
		assertEquals("Test de la hauteur de l1",-4,l1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de l1",-3,l1.getLargeur(), EPSILON);
	}
	
	@Test
	public void testConstructeurLongLargDecimal() {
		Ligne l1 = new Ligne (-3.5632,4.98456);
		
		assertEquals("Test de la position l1",new Coordonnees() ,l1.getPosition());
		assertEquals("Test de la hauteur de l1",4.984,l1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de l1",-3.563,l1.getLargeur(), EPSILON);
	}
	
	@Test
	public void testConstructeurPos1LongLarg() {
		Ligne l1 = new Ligne (1,1,-3,-4);
		
		assertEquals("Test de la position l1",new Coordonnees(1,1) ,l1.getPosition());
		assertEquals("Test de la hauteur de l1",-4,l1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de l1",-3,l1.getLargeur(), EPSILON);
	}
	
	@Test
	public void testConstructeurPos2LongLarg() {
		Ligne l1 = new Ligne (-1,5,-3,-4);
		
		assertEquals("Test de la position l1",new Coordonnees(-1,5) ,l1.getPosition());
		assertEquals("Test de la hauteur de l1",-4,l1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de l1",-3,l1.getLargeur(), EPSILON);
	}
	
	@Test
	public void testConstructeurPos3LongLarg() {
		Ligne l1 = new Ligne (new Coordonnees(6.3,-9.45),-3,-4);
		
		assertEquals("Test de la position l1",new Coordonnees(6.3,-9.45) ,l1.getPosition());
		assertEquals("Test de la hauteur de l1",-4,l1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de l1",-3,l1.getLargeur(), EPSILON);
	}
	
	@Test
	public void testtoStringAnglePos() {
		Ligne l1 = new Ligne (new Coordonnees(10.30,0.21),2,3);
		Locale locale = Locale.getDefault();
		
		if (locale.getLanguage() == "fr") {
			assertEquals("[Ligne] c1 : (10,3 , 0,21) c2 : (12,3 , 3,21) longueur : 3,61 angle : 56,31° couleur = R0,V0,B0",l1.toString());
		}
		else {
			assertEquals("[Ligne] c1 : (10,3 , 0,21) c2 : (12,3 , 3,21) longueur : 3,61 angle : 56,31° couleur = R0,G0,B0",l1.toString());
		}
		
	}
	
	@Test
	public void testtoStringAngleNeg() {
		Ligne l1 = new Ligne (new Coordonnees(10.30,0.21),2,-3);
		Locale locale = Locale.getDefault();
		
		if(locale.getLanguage() == "fr") {
			assertEquals("Test de toString locale fr de Ligne","[Ligne] c1 : (10,3 , 0,21) c2 : (12,3 , -2,79) longueur : 3,61 angle : 303,69° couleur = R0,V0,B0",l1.toString());
		}
		else {
			assertEquals("Test de toString locale non fr de Ligne","[Ligne] c1 : (10,3 , 0,21) c2 : (12,3 , -2,79) longueur : 3,61 angle : 303,69° couleur = R0,G0,B0",l1.toString());
		}
	}
}
