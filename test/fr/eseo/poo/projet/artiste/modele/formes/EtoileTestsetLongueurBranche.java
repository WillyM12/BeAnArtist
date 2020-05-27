package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EtoileTestsetLongueurBranche {
	
	private static final double EPSILON = 1e-3d;
	
	@Rule
	public ExpectedException thrownException = ExpectedException.none();

	@Test
	public void etoileTestsetLongueurBranche() {
		Etoile e1 = new Etoile();
		e1.setLongueurBranche(0.6);
		
		assertEquals("Test setLongueurBranche positive de Ellipse",0.6, e1.getLongueurBranche(), EPSILON);
	}
	
	@Test
	public void shouldThrowException1() throws Exception {
		Etoile e1 = new Etoile();
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : La longueur des branches doit être compris entre 0.0 et 1.0  !");
	    e1.setLongueurBranche(23.4);
	}
	
	@Test
	public void shouldThrowException2() throws Exception {
		Etoile e1 = new Etoile();
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : La longueur des branches doit être compris entre 0.0 et 1.0  !");
	    e1.setLongueurBranche(-6.74);
	}
}
