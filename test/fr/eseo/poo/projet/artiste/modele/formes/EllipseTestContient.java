package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class EllipseTestContient {

	@Test
	public void ellipseTestContientTrue() {
		Ellipse e1 = new Ellipse();
		
		assertEquals("Test contient coordonnees(14.7,14.7)",true, e1.contient(new Coordonnees(14.7,14.7)));
		assertEquals("Test contient coordonnees(20,20)",true, e1.contient(new Coordonnees(20,20)));
		assertEquals("Test contient coordonnees(50,50)",true, e1.contient(new Coordonnees(50,50)));
		assertEquals("Test contient coordonnees(70,70)",true, e1.contient(new Coordonnees(70,70)));
		assertEquals("Test contient coordonnees(0,50)",true, e1.contient(new Coordonnees(0,50)));
		assertEquals("Test contient coordonnees(50,0)",true, e1.contient(new Coordonnees(50,0)));
		assertEquals("Test contient coordonnees(100,50)",true, e1.contient(new Coordonnees(100,50)));
		assertEquals("Test contient coordonnees(50,100)",true, e1.contient(new Coordonnees(50,100)));
		assertEquals("Test contient coordonnees(23,68.6)",true, e1.contient(new Coordonnees(23,68.6)));
	}
	
	@Test
	public void ellipseTestContientFalse() {
		Ellipse e1 = new Ellipse();
		
		assertEquals("Test contient coordonnees(14.6,14.6)",false, e1.contient(new Coordonnees(14.6,14.6)));
		assertEquals("Test contient coordonnees(0,0)",false, e1.contient(new Coordonnees(0,0)));
		assertEquals("Test contient coordonnees(90,90)",false, e1.contient(new Coordonnees(90,90)));
		assertEquals("Test contient coordonnees(-10,-10)",false, e1.contient(new Coordonnees(-10,-10)));
		assertEquals("Test contient coordonnees(230,540)",false, e1.contient(new Coordonnees(230,540)));
	}
}
