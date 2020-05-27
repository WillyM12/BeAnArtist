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
 * Classe de test paramétrée, via la technique du constructeur, de la classe Ellipse.
 * 
 * @author Willy MArtin
 * @version 1.0
 *
 */
@RunWith(Parameterized.class)
public class EtoileTestAireParameterized {

	private static final double EPSILON = 1e-3d;
	
	private double taille;
	private int nombreBranches;
	private double anglePremiereBranche;
	private double longueurBranches;
	private double aireAttendu;
	private String messageErreur;

	private Etoile e1;
	
	public EtoileTestAireParameterized(String messageErreur, double taille, int nombreBranches, double anglePremiereBranche, double longueurBranches,  double aireAttendu) {
		this.taille = taille;
		this.nombreBranches = nombreBranches;
		this.anglePremiereBranche = anglePremiereBranche;
		this.longueurBranches = longueurBranches;
		this.aireAttendu = aireAttendu;
		this.messageErreur = messageErreur;
	}
	
	/**
	 * Création du jeu de test. 
	 * 
	 * @return l'ensemble des données de test. 
	 */
	@Parameters(name = "dt[{index}] : {0}, {1}, {2}, {3}, {4}, {5}") 
    public static Collection<Object[]> dt() {
        Object[][] data = new Object[][] { 
        	{"Test aire 22,627 d'Etoile",8,4,0,0.5,22.627},
        	{"Test aire 2,336 d'Etoile",2,14,0,0.25,2.336},
        	{"Test aire 1357,478 d'Etoile",84,9,0,0.75,1357.478},
        	{"Test aire 3,573 d'Etoile",2.65,7,0,0.33,3.573},
        	{"Test aire 170,990 d'Etoile",25.45,12,0,0.66,170.990},
        	{"Test aire 12,608 d'Etoile",41,6,0,0.99,12.608}
        };
        return Arrays.asList(data);
    }
	
	@Before
    public void setUp() {
    	e1 = new Etoile(new Coordonnees(4,3), taille, nombreBranches, anglePremiereBranche, longueurBranches);
    }
    
	/**
	 * Test de la méthode aire() de Ellipse.
	 */
	@Test
	public void testgetType() {
		assertEquals(this.messageErreur, aireAttendu, e1.aire(), EPSILON);
	}
}
