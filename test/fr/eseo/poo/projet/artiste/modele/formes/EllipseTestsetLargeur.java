package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EllipseTestsetLargeur {
	
	private static final double EPSILON = 1e-3d;
	
	@Rule
	public ExpectedException thrownException = ExpectedException.none();

	@Test
	public void EllipseTestsetLargeurPos() {
		Ellipse e1 = new Ellipse();
		e1.setLargeur(65);
		
		assertEquals("Test setLargeur positive de Ellipse",65, e1.getLargeur(), EPSILON);
	}
	
	@Test
	public void shouldThrowException1() throws Exception {
		Ellipse e1 = new Ellipse();
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : Largeur négative impossible !");
	    e1.setLargeur(-65);
	}
	
	@Test
	public void shouldThrowException2() throws Exception {
		Ellipse e1 = new Ellipse();
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : Largeur négative impossible !");
	    e1.setLargeur(-6.74);
	}
}
