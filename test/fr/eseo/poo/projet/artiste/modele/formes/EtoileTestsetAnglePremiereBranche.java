package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EtoileTestsetAnglePremiereBranche {
	
	private static final double EPSILON = 1e-3d;
	
	@Rule
	public ExpectedException thrownException = ExpectedException.none();

	@Test
	public void etoileTestsetAnglePremiereBranche() {
		Etoile e1 = new Etoile();
		e1.setAnglePremiereBranche(3.02);
		
		assertEquals("Test setHauteur positive de Etoile",3.02, e1.getAnglePremiereBranche(), EPSILON);
	}
	
	@Test
	public void shouldThrowException1() throws Exception {
		Etoile e1 = new Etoile();
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : L'angle de la première branche doit être compris entre -Pi et Pi !");
	    e1.setAnglePremiereBranche(5.62);
	}
	
	@Test
	public void shouldThrowException2() throws Exception {
		Etoile e1 = new Etoile();
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : L'angle de la première branche doit être compris entre -Pi et Pi !");
	    e1.setAnglePremiereBranche(-8.45);
	}
}
