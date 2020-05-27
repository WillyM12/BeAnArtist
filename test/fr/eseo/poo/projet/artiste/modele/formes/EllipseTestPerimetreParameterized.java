package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Classe de test paramétrée, via la technique du constructeur, de la classe Ellipse.
 * 
 * @author Willy Martin
 * @version 1.0
 *
 */
@RunWith(Parameterized.class)
public class EllipseTestPerimetreParameterized {
	
	private static final double EPSILON = 1e-3d;
	
	private double largeur;
	private double hauteur;
	private double perimetreAttendu;
	private String messageTest;

	private Ellipse e1;
	
	public EllipseTestPerimetreParameterized(String messageTest, double largeur, double hauteur, double perimetreAttendu) {
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.perimetreAttendu = perimetreAttendu;
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
        	{"Test permietre PI d'Ellipse",1,1,Math.PI},
        	{"Test permietre 4,844 horizontale d'Ellipse",2,1,4.844},
        	{"Test permietre 4,844 verticale d'Ellipse",1,2,4.844},
        	{"Test permietre 6,082 d'Ellipse",2.45,1.34,6.082},
        };
        return Arrays.asList(data);
    }
	
	@Before
    public void setUp() {
    	e1 = new Ellipse(largeur, hauteur);
    }
    
	/**
	 * Test de la méthode perimetre() de Ellipse.
	 */
	@Test
	public void testgetType() {
		assertEquals(this.messageTest, perimetreAttendu, e1.perimetre(), EPSILON);
	}
	
}
