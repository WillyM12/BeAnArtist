package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class EllipseTest {
	
	private static final double EPSILON = 1e-3d;
	
	@Rule
	public ExpectedException thrownException = ExpectedException.none();

	@Test
	public void testConstructeur1(){
		Ellipse e1 = new Ellipse(new Coordonnees(),4,5);
		
		assertEquals("Test de la position e1",new Coordonnees() ,e1.getPosition());
		assertEquals("Test de la hauteur de e1",5,e1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de e1",4,e1.getLargeur(), EPSILON);
	}


	@Test
	public void shouldThrowException1() throws Exception {
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : Largeur négative impossible !");
	    new Ellipse(new Coordonnees(),-4,5);
	}
	
	@Test
	public void shouldThrowException2() throws Exception {
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : Hauteur négative impossible !");
	    new Ellipse(new Coordonnees(),4,-5);
	}
	
	@Test
	public void shouldThrowException3() throws Exception {
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : Largeur négative impossible !");
	    new Ellipse(new Coordonnees(),-4,-5);
	}
	
	@Test
	public void shouldThrowException5() throws Exception {
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : Largeur négative impossible !");
	    new Ellipse(new Coordonnees(),-3.76,5);
	}
	
	@Test
	public void shouldThrowException6() throws Exception {
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : Hauteur négative impossible !");
	    new Ellipse(new Coordonnees(),4,-4.9);
	}
	
	@Test
	public void shouldThrowException7() throws Exception {
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : Largeur négative impossible !");
	    new Ellipse(new Coordonnees(),-5.98,-32.09);
	}
	
	@Test
	public void testConstructeur2(){
		Ellipse e1 = new Ellipse();
		
		assertEquals("Test de la position e1",new Coordonnees() ,e1.getPosition());
		assertEquals("Test de la hauteur de e1",100,e1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de e1",100,e1.getLargeur(), EPSILON);
	}
	
	@Test
	public void testConstructeur3(){
		Ellipse e1 = new Ellipse(2,2);
		
		assertEquals("Test de la position e1",new Coordonnees() ,e1.getPosition());
		assertEquals("Test de la hauteur de e1",2,e1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de e1",2,e1.getLargeur(), EPSILON);
	}
	
	@Test
	public void testConstructeur4(){
		Ellipse e1 = new Ellipse(1,2,3,4);
		
		assertEquals("Test de la position e1",new Coordonnees(1,2) ,e1.getPosition());
		assertEquals("Test de la hauteur de e1",4,e1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de e1",3,e1.getLargeur(), EPSILON);
	}
	
	@Test
	public void testConstructeur5(){
		Ellipse e1 = new Ellipse(new Coordonnees());
		
		assertEquals("Test de la position e1",new Coordonnees() ,e1.getPosition());
		assertEquals("Test de la hauteur de e1",100,e1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de e1",100,e1.getLargeur(), EPSILON);
	}
	
	@Test
	public void testtoString(){
		Ellipse e1 = new Ellipse(new Coordonnees(10,10),25,15);
		Locale locale = Locale.getDefault();
		if (locale.getLanguage() == "fr") {
			assertEquals("Test de toString non rempli et locale fr de Ellipse","[Ellipse] : pos (10,0 , 10,0) dim 25,0 x 15,0 périmètre : 63,82 aire : 294,52 couleur = R0,V0,B0", e1.toString());
		}
		else {
			assertEquals("Test de toString non rempli et locale non fr de Ellipse","[Ellipse] : pos (10,0 , 10,0) dim 25,0 x 15,0 périmètre : 63,82 aire : 294,52 couleur = R0,G0,B0", e1.toString());
		}	
	}
	
	@Test
	public void testtoStringRempliassge(){
		Ellipse e1 = new Ellipse(new Coordonnees(10,10),25,15);
		Locale locale = Locale.getDefault();
		e1.setRempli(true);
		if (locale.getLanguage() == "fr") {
			assertEquals("Test de toString rempli et locale fr de Ellipse","[Ellipse-Rempli] : pos (10,0 , 10,0) dim 25,0 x 15,0 périmètre : 63,82 aire : 294,52 couleur = R0,V0,B0", e1.toString());
		}
		else {
			assertEquals("Test de toString rempli et locale non fr de Ellipse","[Ellipse-Rempli] : pos (10,0 , 10,0) dim 25,0 x 15,0 périmètre : 63,82 aire : 294,52 couleur = R0,G0,B0", e1.toString());
		}	
	}
}
