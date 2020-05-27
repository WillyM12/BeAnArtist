package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CercleTestsetLargeur {
	private static final double EPSILON = 1e-3d;
	
	@Rule
	public ExpectedException thrownException = ExpectedException.none();

	@Test
	public void EllipseTestsetLargeurPos() {
		Cercle c1 = new Cercle();
		c1.setLargeur(65);
		
		assertEquals("Test setLargeur positive de Ellipse",65, c1.getLargeur(), EPSILON);
	}
	
	@Test
	public void shouldThrowException1() throws Exception {
		Cercle c1 = new Cercle();
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : Taille négative impossible !");
	    c1.setLargeur(-65);
	}
	
	@Test
	public void shouldThrowException2() throws Exception {
		Cercle c1 = new Cercle();
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : Taille négative impossible !");
	    c1.setLargeur(-98.54);
	}
}
