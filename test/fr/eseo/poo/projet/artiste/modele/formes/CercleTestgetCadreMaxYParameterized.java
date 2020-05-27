package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

/**
 * Classe de test paramétrée, via la technique du constructeur, de la classe Cercle.
 * 
 * @author Willy Martin
 * @version 1.0
 *
 */
@RunWith(Parameterized.class)
public class CercleTestgetCadreMaxYParameterized {
	
	private static final double EPSILON = 1e-3d;
	
	private double taille;
	private Coordonnees pos;
	private double coordonneesAttendu;
	private String messageTest;

	private Cercle c1;
	
	public CercleTestgetCadreMaxYParameterized(String messageTest, Coordonnees pos, double taille, double coordonneesAttendu) {
		this.pos = pos;
		this.taille = taille;
		this.coordonneesAttendu = coordonneesAttendu;
		this.messageTest = messageTest;
	}

	
	/**
	 * Création du jeu de test. 
	 * 
	 * @return l'ensemble des données de test. 
	 */
	@Parameters(name = "dt[{index}] : {0}, {1}, {2}, {3}") 
    public static Collection<Object[]> dt() {
        Object[][] data = new Object[][] { 
        	{"Test de getCadreMaxY 1 de Cercle",new Coordonnees(), 1, 1},
        	{"Test de getCadreMaxY 2 de Cercle",new Coordonnees(1,1), 1, 2},
        	{"Test de getCadreMaxY 0 de Cercle",new Coordonnees(-1,-1), 1, 0},
        	{"Test de getCadreMaxY 8 de Cercle",new Coordonnees(3,5), 3, 8},
        	{"Test de getCadreMaxY 46,1 de Cercle",new Coordonnees(3.74,5.56), 40.54, 46.1},
        };
        return Arrays.asList(data);
    }
	
	@Before
    public void setUp() {
    	c1 = new Cercle(pos, taille);
    }
    
	/**
	 * Test de la méthode getCadreMaxY() de Cercle.
	 */
	@Test
	public void testgetType() {
		assertEquals(this.messageTest, coordonneesAttendu, c1.getCadreMaxY(), EPSILON);
	}

}
