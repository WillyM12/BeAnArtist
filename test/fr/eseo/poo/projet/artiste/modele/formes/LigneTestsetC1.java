package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Ligne;

public class LigneTestsetC1 {

private static final double EPSILON = 1e-3d;
	
	@Test
	public void LigneTestsetC1_1() {
		Ligne l1 = new Ligne(0,0,2,2);
		l1.setC1(new Coordonnees(1,1));
		
		assertEquals("Test de setC1 de ligne posX",1,l1.getPosition().getAbscisse(),EPSILON);
		assertEquals("Test de setC1 de ligne posY",1,l1.getPosition().getOrdonnee(),EPSILON);
		assertEquals("Test de setC1 de ligne largeur",1,l1.getLargeur(),EPSILON);
		assertEquals("Test de setC1 de ligne hauteur",1,l1.getHauteur(),EPSILON);
	}
	
	@Test
	public void LigneTestsetC1_2() {
		Ligne l1 = new Ligne(-2,-2,2,2);
		l1.setC1(new Coordonnees(1,1));
		
		assertEquals("Test de setC1 de ligne posX",1,l1.getPosition().getAbscisse(),EPSILON);
		assertEquals("Test de setC1 de ligne posY",1,l1.getPosition().getOrdonnee(),EPSILON);
		assertEquals("Test de setC1 de ligne largeur",-1,l1.getLargeur(),EPSILON);
		assertEquals("Test de setC1 de ligne hauteur",-1,l1.getHauteur(),EPSILON);
	}
	
	@Test
	public void LigneTestsetC1_3() {
		Ligne l1 = new Ligne(-2,-2,2,2);
		l1.setC1(new Coordonnees(-6,7));
		
		assertEquals("Test de setC1 de ligne posX",-6,l1.getPosition().getAbscisse(),EPSILON);
		assertEquals("Test de setC1 de ligne posY",7,l1.getPosition().getOrdonnee(),EPSILON);
		assertEquals("Test de setC1 de ligne largeur",6,l1.getLargeur(),EPSILON);
		assertEquals("Test de setC1 de ligne hauteur",-7,l1.getHauteur(),EPSILON);
	}
	
	@Test
	public void LigneTestsetC1_4() {
		Ligne l1 = new Ligne(-2,-2,2,2);
		l1.setC1(new Coordonnees(5.5,-6.3));
		
		assertEquals("Test de setC1 de ligne posX",5.5,l1.getPosition().getAbscisse(),EPSILON);
		assertEquals("Test de setC1 de ligne posY",-6.3,l1.getPosition().getOrdonnee(),EPSILON);
		assertEquals("Test de setC1 de ligne largeur",-5.5,l1.getLargeur(),EPSILON);
		assertEquals("Test de setC1 de ligne hauteur",6.3,l1.getHauteur(),EPSILON);
	}
}
