package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Ligne;

public class LigneTestsetC2 {

private static final double EPSILON = 1e-3d;
	
	@Test
	public void LigneTestsetC2_1() {
		Ligne l1 = new Ligne(0,0,2,2);
		l1.setC2(new Coordonnees(1,1));
		
		assertEquals("Test de setC2 de ligne largeur",1,l1.getLargeur(),EPSILON);
		assertEquals("Test de setC2 de ligne hauteur",1,l1.getHauteur(),EPSILON);
	}
	
	@Test
	public void LigneTestsetC2_2() {
		Ligne l1 = new Ligne(0,0,2,2);
		l1.setC2(new Coordonnees(0,2));
		
		assertEquals("Test de setC2 de ligne largeur",0,l1.getLargeur(),EPSILON);
		assertEquals("Test de setC2 de ligne hauteur",2,l1.getHauteur(),EPSILON);
	}
	
	@Test
	public void LigneTestsetC2_3() {
		Ligne l1 = new Ligne(1,1,2,2);
		l1.setC2(new Coordonnees(1,0));
		
		assertEquals("Test de setC2 de ligne largeur",0,l1.getLargeur(),EPSILON);
		assertEquals("Test de setC2 de ligne hauteur",-1,l1.getHauteur(),EPSILON);
	}
	
	@Test
	public void LigneTestsetC2_4() {
		Ligne l1 = new Ligne(2,1,2,2);
		l1.setC2(new Coordonnees(-5,-6));
		
		assertEquals("Test de setC2 de ligne largeur",-7,l1.getLargeur(),EPSILON);
		assertEquals("Test de setC2 de ligne hauteur",-7,l1.getHauteur(),EPSILON);
	}
	
	@Test
	public void LigneTestsetC2_5() {
		Ligne l1 = new Ligne(2,2,2,2);
		l1.setC2(new Coordonnees(-4,3));
		
		assertEquals("Test de setC2 de ligne largeur",-6,l1.getLargeur(),EPSILON);
		assertEquals("Test de setC2 de ligne hauteur",1,l1.getHauteur(),EPSILON);
	}
}
