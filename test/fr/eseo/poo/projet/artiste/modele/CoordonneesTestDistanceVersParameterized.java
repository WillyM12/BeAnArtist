package fr.eseo.poo.projet.artiste.modele;

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
 * Classe de test paramétrée, via la technique du constructeur, de la classe Coordonnees.
 * 
 * @author Willy MArtin
 * @version 1.0
 *
 */
@RunWith(Parameterized.class)
public class CoordonneesTestDistanceVersParameterized {

	private double x;
	private double y;
	
	private Coordonnees c1;
	private String messageErreur;
	
	private double distanceAttendu;
	
	private static final double EPSILON = 1e-3d;
	
	public CoordonneesTestDistanceVersParameterized (String messageErreur, double x, double y, double distanceAttendu) {
		this.x = x;
		this.y = y;
		this.distanceAttendu = distanceAttendu;
		this.messageErreur = messageErreur;
	}
	
	/**
	 * Création du jeu de test. 
	 * 
	 * @return l'ensemble des données de test. 
	 */
	@Parameters(name = "dt[{index}] : {0}, {1}, {2}, {3}") 
    public static Collection<Object[]> dt() {
        Object[][] data = new Object[][] { 
        	{"Test de distanceVers 0 de Coordonnees",1,1,0},
        	{"Test de distanceVers 1.414 de Coordonnees",2,2,1.414},
        	{"Test de distanceVers 11.401 de Coordonnees",-8, 8, 11.401},
        	{"Test de distanceVers 8.062 de Coordonnees",2,9,8.062},
        	{"Test de distanceVers 9.899 de Coordonnees",8,-6,9.899},
        	{"Test de distanceVers 4 de Coordonnees",5,1,4},
        	{"Test de distanceVers 6 de Coordonnees",-5,1,6},
        	{"Test de distanceVers 1 de Coordonnees",0,1,1},
        	{"Test de distanceVers 0.46 de Coordonnees",0.54,1,0.46}
        };
        return Arrays.asList(data);
    }
	
	@Before
    public void setUp() {
    	c1 = new Coordonnees(x, y);
    }
    
	/**
	 * Test de la méthode distanceVers() de Coordonnees.
	 */
	@Test
	public void testgetType() {
		assertEquals(this.messageErreur, distanceAttendu, c1.distanceVers(new Coordonnees(1,1)), EPSILON);
	}
}

