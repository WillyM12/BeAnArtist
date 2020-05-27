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
public class CoordonneesTestAngleVersParameterized {

	private double x;
	private double y;
	
	private Coordonnees c1;
	
	private double angleAttendu;
	private String messageErreur;
	
	private static final double EPSILON = 1e-3d;
	
	public CoordonneesTestAngleVersParameterized (String messageErreur, double x, double y, double angleAttendu) {
		this.x = x;
		this.y = y;
		this.angleAttendu = angleAttendu;
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
        	{"Test de angleVers Pi/2 de Coordonnees",0,-1,1.570},
        	{"Test de angleVers Pi de Coordonnees",1,0,3.141},
        	{"Test de angleVers -Pi/4 de Coordonnees",-1,1,-0.785},
        	{"Test de angleVers 0 de Coordonnees",0,0,0},
        	{"Test de angleVers 0 de Coordonnees",-1,0,0},
        	{"Test de angleVers -3Pi/2 de Coordonnees",1,1,-2.356},
        	{"Test de angleVers 3Pi/2 de Coordonnees",1,-1,2.356},
        	{"Test de angleVers Pi/4 de Coordonnees",-1,-1,0.785}
        };
        return Arrays.asList(data);
    }
	
	@Before
    public void setUp() {
    	c1 = new Coordonnees(x, y);
    }
    
	/**
	 * Test de la méthode angleVers() de Coordonnees.
	 */
	@Test
	public void testgetType() {
		assertEquals(this.messageErreur, angleAttendu, c1.angleVers(new Coordonnees(0,0)), EPSILON);
	}
}

