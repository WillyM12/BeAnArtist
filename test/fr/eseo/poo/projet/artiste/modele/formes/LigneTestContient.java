package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class LigneTestContient {

	@Test
	public void ligneTestContientTrue() {
		Ligne l1 = new Ligne();
		
		assertEquals("Test contient coordonnees(1,1)",true, l1.contient(new Coordonnees(1,1)));
		assertEquals("Test contient coordonnees(1,2)",true, l1.contient(new Coordonnees(1,2)));
		assertEquals("Test contient coordonnees(2,1)",true, l1.contient(new Coordonnees(2,1)));
		assertEquals("Test contient coordonnees(1.56,1.34)",true, l1.contient(new Coordonnees(1.56,1.34)));
		assertEquals("Test contient coordonnees(6,6)",true, l1.contient(new Coordonnees(6,6)));
		assertEquals("Test contient coordonnees(9,10)",true, l1.contient(new Coordonnees(9,10)));
	}
	
	@Test
	public void ligneTestContientFalse() {
		Ligne l1 = new Ligne();
		
		assertEquals("Test contient coordonnees(0,4)",false, l1.contient(new Coordonnees(0,4)));
		assertEquals("Test contient coordonnees(12,20)",false, l1.contient(new Coordonnees(12,20)));
		assertEquals("Test contient coordonnees(32.3,98.45)",false, l1.contient(new Coordonnees(32.3,98.45)));
		assertEquals("Test contient coordonnees(342,423)",false, l1.contient(new Coordonnees(342,423)));
		assertEquals("Test contient coordonnees(0,-4)",false, l1.contient(new Coordonnees(0,-1.3)));
	}
}
