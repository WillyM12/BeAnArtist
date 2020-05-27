package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import fr.eseo.poo.projet.artiste.modele.formes.Ligne;

/**
 * Classe de test paramétrée, via la technique du constructeur, de la classe Ligne.
 * 
 * @author Willy MArtin
 * @version 1.0
 *
 */
@RunWith(Parameterized.class)
public class LigneTestgetC2Parameterized {
	
	private static final double EPSILON = 1e-3d;
	
	private double largeur;
	private double hauteur;
	private double x;
	private double y;
	private double xAttendu;
	private double yAttendu;
	private String messageTest;
	private Ligne l1;
	
	public LigneTestgetC2Parameterized (String messageTest, double x, double y, double largeur, double longueur, double xAttendu, double yAttendu) {
		this.largeur = largeur;
		this.hauteur = longueur;
		this.x = x;
		this.y = y;
		this.xAttendu = xAttendu;
		this.yAttendu = yAttendu;
		this.messageTest = messageTest;
	}
	
	/**
	 * Création du jeu de test. 
	 * 
	 * @return l'ensemble des données de test. 
	 */
	@Parameters(name = "dt[{index}] : {0}, {1}, {2}, {3}, {4}, {5}, {6}") 
    public static Collection<Object[]> dt() {
        Object[][] data = new Object[][] { 
        	{"Test getC2 0 de Ligne",0,0,0,0,0,0},
        	{"Test getC2 1 de Ligne",0,0,1,1,1,1},
        	{"Test getC2 2 de Ligne",1,1,1,1,2,2},
        	{"Test getC2 4 de Ligne",0,0,3,4,3,4},
        	{"Test getC2 -7 de Ligne",0,0,-5,-7,-5,-7},
        	{"Test getC2 1 de Ligne",-2,-1,2,2,0,1},
        	{"Test getC2 4,34 de Ligne",4.55,3.34,1,1,5.55,4.34},
        	{"Test getC2 7,3 de Ligne",-3,4,-3.45,3.3,-6.45,7.3}
        };
        return Arrays.asList(data);
    }
	
	@Before
    public void setUp() {
    	l1 = new Ligne(x, y, largeur, hauteur);
    }
    
	/**
	 * Test de la méthode getC2() de Ligne.
	 */
	@Test
	public void testgetType() {
		assertEquals(this.messageTest + "abscisse", xAttendu, l1.getC2().getAbscisse(), EPSILON);
		assertEquals(this.messageTest + "ordonnee", yAttendu, l1.getC2().getOrdonnee(), EPSILON);
	}
}
