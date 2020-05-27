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
public class LigneTestgetCadreMaxYParameterized {

private static final double EPSILON = 1e-3d;
	
	private double largeur;
	private double hauteur;
	private double x;
	private double y;
	private double xAttendu;
	private String messageTest;
	
	private Ligne l1;
	
	public LigneTestgetCadreMaxYParameterized (String messageErreur, double x, double y, double largeur, double longueur, double xAttendu) {
		this.largeur = largeur;
		this.hauteur = longueur;
		this.x = x;
		this.y = y;
		this.xAttendu = xAttendu;
		this.messageTest = messageErreur;
	}
	
	/**
	 * Création du jeu de test. 
	 * 
	 * @return l'ensemble des données de test. 
	 */
	@Parameters(name = "dt[{index}] : {0}, {1}, {2}, {3}, {4}, {5}") 
    public static Collection<Object[]> dt() {
        Object[][] data = new Object[][] { 
        	{"Test getCadreMaxY 0_0 de Ligne",0,0,0,0,0},
        	{"Test getCadreMaxY 1 de Ligne",0,0,1,1,1},
        	{"Test getCadreMaxY 2 de Ligne",1,1,1,1,2},
        	{"Test getCadreMaxY 4 de Ligne",0,0,3,4,4},
        	{"Test getCadreMaxY 0_-7 de Ligne",0,0,-5,-7,0},
        	{"Test getCadreMaxY 1 de Ligne",-2,-1,2,2,1},
        	{"Test getCadreMaxY 4,34 de Ligne",4.55,3.34,1,1,4.34},
        	{"Test getCadreMaxY 7,3 de Ligne",-3,4,-3.45,3.3,7.3}
        };
        return Arrays.asList(data);
    }
	
	@Before
    public void setUp() {
    	l1 = new Ligne(x, y, largeur, hauteur);
    }
    
	/**
	 * Test de la méthode getCadreMinY() de Ligne.
	 */
	@Test
	public void testgetType() {
		assertEquals(this.messageTest, xAttendu, l1.getCadreMaxY(), EPSILON);
	}
}
