package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class EtoileTestContient {

	@Test
	public void etoileTestContientTrue() {
		Etoile e1 = new Etoile();
		
		assertEquals("Test contient coordonnees(35,35)",true, e1.contient(new Coordonnees(35,35)));
		assertEquals("Test contient coordonnees(50,50)",true, e1.contient(new Coordonnees(50,50)));
		assertEquals("Test contient coordonnees(70,70)",true, e1.contient(new Coordonnees(70,70)));
		assertEquals("Test contient coordonnees(0,50)",true, e1.contient(new Coordonnees(20,50)));
		assertEquals("Test contient coordonnees(50,0)",true, e1.contient(new Coordonnees(50,20)));
		assertEquals("Test contient coordonnees(100,50)",true, e1.contient(new Coordonnees(70,50)));
		assertEquals("Test contient coordonnees(50,100)",true, e1.contient(new Coordonnees(50,70)));
		assertEquals("Test contient coordonnees(23,68.6)",true, e1.contient(new Coordonnees(23,53.6)));
	}
	
	@Test
	public void etoileTestContientFalse() {
		Etoile e1 = new Etoile();
		
		assertEquals("Test contient coordonnees(12,65,12,65)",false, e1.contient(new Coordonnees(12.65,12.35)));
		assertEquals("Test contient coordonnees(0,0)",false, e1.contient(new Coordonnees(0,0)));
		assertEquals("Test contient coordonnees(90,90)",false, e1.contient(new Coordonnees(90,90)));
		assertEquals("Test contient coordonnees(-10,-10)",false, e1.contient(new Coordonnees(-10,-10)));
		assertEquals("Test contient coordonnees(230,540)",false, e1.contient(new Coordonnees(230,540)));
	}
}
