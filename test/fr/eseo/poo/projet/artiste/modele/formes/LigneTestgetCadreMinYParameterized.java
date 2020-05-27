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
public class LigneTestgetCadreMinYParameterized {

private static final double EPSILON = 1e-3d;
	
	private double largeur;
	private double hauteur;
	private double x;
	private double y;
	private double yAttendu;
	private String messageTest;
	
	private Ligne l1;
	
	public LigneTestgetCadreMinYParameterized (String messageTest, double x, double y, double largeur, double longueur, double yAttendu) {
		this.largeur = largeur;
		this.hauteur = longueur;
		this.x = x;
		this.y = y;
		this.yAttendu = yAttendu;
		this.messageTest = messageTest;
	}
	
	/**
	 * Création du jeu de test. 
	 * 
	 * @return l'ensemble des données de test. 
	 */
	@Parameters(name = "dt[{index}] : {0}, {1}, {2}, {3}, {4}, {5}") 
    public static Collection<Object[]> dt() {
        Object[][] data = new Object[][] { 
        	{"Test getCadreMinY 0_0 de Ligne",0,0,0,0,0},
        	{"Test getCadreMinY 0_1 de Ligne",0,0,1,1,0},
        	{"Test getCadreMinY 1 de Ligne",1,1,1,1,1},
        	{"Test getCadreMinY 0_3 de Ligne",0,0,3,4,0},
        	{"Test getCadreMinY -7 de Ligne",0,0,-5,-7,-7},
        	{"Test getCadreMinY -1 de Ligne",-2,-1,2,2,-1},
        	{"Test getCadreMinY 3,43 de Ligne",4.55,3.34,1,1,3.34},
        	{"Test getCadreMinY 4 de Ligne",-3,4,-3.45,3.3,4}
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
		assertEquals(this.messageTest, yAttendu, l1.getCadreMinY(), EPSILON);
	}
}
