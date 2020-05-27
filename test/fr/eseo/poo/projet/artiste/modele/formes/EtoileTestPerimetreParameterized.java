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
public class EtoileTestPerimetreParameterized {

	private static final double EPSILON = 1e-3d;
	
	private double taille;
	private int nombreBranches;
	private double anglePremiereBranche;
	private double longueurBranches;
	private double perimetreAttendu;
	private String messageErreur;

	private Etoile e1;
	
	public EtoileTestPerimetreParameterized(String messageErreur, double taille, int nombreBranches, double anglePremiereBranche, double longueurBranches,  double perimetreAttendu) {
		this.taille = taille;
		this.nombreBranches = nombreBranches;
		this.anglePremiereBranche = anglePremiereBranche;
		this.longueurBranches = longueurBranches;
		this.perimetreAttendu = perimetreAttendu;
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
        	{"Test perimetre 23,578 angle 0 d'Etoile",8,4,0,0.5,23.578},
        	{"Test perimetre 23,578 angle 0,314 d'Etoile",8,4,0.314,0.5,23.578},
        	{"Test perimetre 15,206 d'Etoile",4.32,9,0,0.25,15.206},
        	{"Test perimetre 86,337 d'Etoile",23.5,8,0,0.33,86.337},
        	{"Test perimetre 202,295 d'Etoile",46.457,6,0,0.66,202.295},
        	{"Test perimetre 444,488 d'Etoile",96,15,0,0.25,444.488},
        };
        return Arrays.asList(data);
    }
	
	@Before
    public void setUp() {
    	e1 = new Etoile(new Coordonnees(4,3), taille, nombreBranches, anglePremiereBranche, longueurBranches);
    }
    
	/**
	 * Test de la méthode perimetre() de Ellipse.
	 */
	@Test
	public void testgetType() {
		assertEquals(this.messageErreur, perimetreAttendu, e1.perimetre(), EPSILON);
	}
}
