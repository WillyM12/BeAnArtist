package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class CercleTest {

	private static final double EPSILON = 1e-3d;
	
	@Rule
	public ExpectedException thrownException = ExpectedException.none();
	
	@Test
	public void testConstructeur1(){
		Cercle c1 = new Cercle(new Coordonnees(),3);
		
		assertEquals("Test de la position de c1",new Coordonnees(), c1.getPosition());
		assertEquals("Test de la hauteur de e1",3,c1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de e1",3,c1.getLargeur(), EPSILON);
	}
	
	@Test
	public void shouldThrowException1() throws Exception {
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : Taille négative impossible !");
	    new Cercle(new Coordonnees(),-4);
	}
	
	@Test
	public void shouldThrowException2() throws Exception {
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : Taille négative impossible !");
	    new Cercle(new Coordonnees(),-5.5);
	}
	
	@Test
	public void testConstructeur2(){
		Cercle c1 = new Cercle();
		
		assertEquals("Test de la position du constructeur par défaut de Cercle",new Coordonnees(), c1.getPosition());
		assertEquals("Test de la hauteur du constructeur par défaut de Cercle",100,c1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur du constructeur par défaut de Cercle",100,c1.getLargeur(), EPSILON);
	}
	
	@Test
	public void testConstructeur3(){
		Cercle c1 = new Cercle(6);
		
		assertEquals("Test de la position du constructeur int de Cercle",new Coordonnees(), c1.getPosition());
		assertEquals("Test de la hauteur du constructeur int de Cercle1",6,c1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur du constructeur int de Cercle",6,c1.getLargeur(), EPSILON);
	}
	
	@Test
	public void testConstructeur4(){
		Cercle c1 = new Cercle(1,2,6);
		
		assertEquals("Test de la position du constructeur int int int de Cercle",new Coordonnees(1,2), c1.getPosition());
		assertEquals("Test de la hauteur du constructeur int int int de Cercle",6,c1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur du constructeur int int int de Cercle",6,c1.getLargeur(), EPSILON);
	}
	
	@Test
	public void testConstructeur5(){
		Cercle c1 = new Cercle(new Coordonnees());
		
		assertEquals("Test de la position du constructeur Coordonnees de Cercle",new Coordonnees(), c1.getPosition());
		assertEquals("Test de la hauteur du constructeur Coordonnees de Cercle",100,c1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur du constructeur Coordonnees de Cercle",100,c1.getLargeur(), EPSILON);
	}
	
	@Test
	public void testtoString(){
		Cercle c1 = new Cercle(new Coordonnees(10,10),25);
		Locale locale = Locale.getDefault();
		if (locale.getLanguage() == "fr") {
			assertEquals("Test de toString non rempli et locale fr et du constructeur Coordonnees int de Cercle","[Cercle] : pos (10,0 , 10,0) dim 25,0 x 25,0 périmètre : 78,54 aire : 490,87 couleur = R0,V0,B0", c1.toString());
		}
		else {
			assertEquals("Test de toString non rempli et locale non fr du constructeur Coordonnees int de Cercle","[Cercle] : pos (10,0 , 10,0) dim 25,0 x 25,0 périmètre : 78,54 aire : 490,87 couleur = R0,G0,B0", c1.toString());
		}
	}
	
	@Test
	public void testtoStringRemplissage(){
		Cercle c1 = new Cercle(new Coordonnees(10,10),25);
		Locale locale = Locale.getDefault();
		c1.setRempli(true);
		if (locale.getLanguage() == "fr") {
			assertEquals("Test de toString rempli et locale fr et du constructeur Coordonnees int de Cercle","[Cercle-Rempli] : pos (10,0 , 10,0) dim 25,0 x 25,0 périmètre : 78,54 aire : 490,87 couleur = R0,V0,B0", c1.toString());
		}
		else {
			assertEquals("Test de toString rempli et locale non fr du constructeur Coordonnees int de Cercle","[Cercle-Rempli] : pos (10,0 , 10,0) dim 25,0 x 25,0 périmètre : 78,54 aire : 490,87 couleur = R0,G0,B0", c1.toString());
		}
	}
}
