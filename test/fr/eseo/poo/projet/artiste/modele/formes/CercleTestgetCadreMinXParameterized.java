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
public class CercleTestgetCadreMinXParameterized {
	
	private static final double EPSILON = 1e-3d;
	
	private double taille;
	private Coordonnees pos;
	private double coordonneesAttendu;
	private String messageTest;

	private Cercle c1;
	
	public CercleTestgetCadreMinXParameterized(String messageTest, Coordonnees pos, double taille, double coordonneesAttendu) {
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
	@Parameters(name = "dt[{index}] : {0}, {1}, {2}") 
    public static Collection<Object[]> dt() {
        Object[][] data = new Object[][] { 
        	{"Test de getCadreMinX 0 de Cercle",new Coordonnees(), 1, 0},
        	{"Test de getCadreMinX 1 de Cercle",new Coordonnees(1,1), 1, 1},
        	{"Test de getCadreMinX -1 de Cercle",new Coordonnees(-1,-1), 1, -1},
        	{"Test de getCadreMinX 3 de Cercle",new Coordonnees(3,5), 3, 3},
        	{"Test de getCadreMinX 3,74 de Cercle",new Coordonnees(3.74,5.56), 40.54, 3.74},
        };
        return Arrays.asList(data);
    }
	
	@Before
    public void setUp() {
    	c1 = new Cercle(pos, taille);
    }
    
	/**
	 * Test de la méthode getCadreMinX() de Cercle.
	 */
	@Test
	public void testgetType() {
		assertEquals(this.messageTest, coordonneesAttendu, c1.getCadreMinX(), EPSILON);
	}

}
