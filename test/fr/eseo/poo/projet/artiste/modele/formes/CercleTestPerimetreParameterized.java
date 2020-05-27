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
 * Classe de test paramétrée, via la technique du constructeur, de la classe Cercle.
 * 
 * @author Willy Martin
 * @version 1.0
 *
 */
@RunWith(Parameterized.class)
public class CercleTestPerimetreParameterized {
	
	private static final double EPSILON = 1e-3d;
	
	private double taille;
	private double perimetreAttendu;
	private String messageTest;

	private Cercle c1;
	
	public CercleTestPerimetreParameterized(String messageTest, double taille, double perimetreAttendu) {
		this.taille = taille;
		this.perimetreAttendu = perimetreAttendu;
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
        	{"Test perimetre PI de Cercle",1,Math.PI},
        	{"Test perimetre 2*PI de Cercle",2,2*Math.PI},
        	{"Test perimetre 7,697 de Cercle",2.45,7.697},
        };
        return Arrays.asList(data);
    }
	
	@Before
    public void setUp() {
    	c1 = new Cercle(taille);
    }
    
	/**
	 * Test de la méthode perimetre() de Cercle.
	 */
	@Test
	public void testgetType() {
		assertEquals(this.messageTest, perimetreAttendu, c1.perimetre(), EPSILON);
	}

}
