package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EllipseTestsetHauteur {
	
	private static final double EPSILON = 1e-3d;
	
	@Rule
	public ExpectedException thrownException = ExpectedException.none();

	@Test
	public void EllipseTestsetHauteurPos() {
		Ellipse e1 = new Ellipse();
		e1.setHauteur(65);
		
		assertEquals("Test setHauteur positive de Ellipse",65, e1.getHauteur(), EPSILON);
	}
	
	@Test
	public void shouldThrowException1() throws Exception {
		Ellipse e1 = new Ellipse();
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : Hauteur négative impossible !");
	    e1.setHauteur(-65);
	}
	
	@Test
	public void shouldThrowException2() throws Exception {
		Ellipse e1 = new Ellipse();
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : Hauteur négative impossible !");
	    e1.setHauteur(-54.78);
	}
}
