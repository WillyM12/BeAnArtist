package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class EtoileTest {
	
	private static final double EPSILON = 1e-3d;
	
	@Rule
	public ExpectedException thrownException = ExpectedException.none();
	
	@Test
	public void testConstructeur() {
		Etoile e1 = new Etoile();
		
		assertEquals("Test de la position e1",new Coordonnees() ,e1.getPosition());
		assertEquals("Test de la hauteur de e1",Forme.HAUTEUR_PAR_DEFAUT,e1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de e1",Forme.LARGEUR_PAR_DEFAUT,e1.getLargeur(), EPSILON);
		assertEquals("Test du nombre de branche par défaut de e1", Etoile.NOMBRE_BRANCHES_PAR_DEFAUT, e1.getNombreBranches());
		assertEquals("Test de l'angle de la première branche par défaut de e1", Etoile.ANGLE_PREMIERE_BRANCHE_PAR_DEFAUT, e1.getAnglePremiereBranche(), EPSILON);
		assertEquals("Test de la longueur des branches par défaut de e1", Etoile.LONGUEUR_BRANCHE_PAR_DEFAUT, e1.getLongueurBranche(), EPSILON);
	}
	
	@Test
	public void testConstructeur1() {
		Etoile e1 = new Etoile(25);
		
		assertEquals("Test de la position e1",new Coordonnees() ,e1.getPosition());
		assertEquals("Test de la hauteur de e1",25,e1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de e1",25,e1.getLargeur(), EPSILON);
		assertEquals("Test du nombre de branche par défaut de e1", Etoile.NOMBRE_BRANCHES_PAR_DEFAUT, e1.getNombreBranches());
		assertEquals("Test de l'angle de la première branche par défaut de e1", Etoile.ANGLE_PREMIERE_BRANCHE_PAR_DEFAUT, e1.getAnglePremiereBranche(), EPSILON);
		assertEquals("Test de la longueur des branches par défaut de e1", Etoile.LONGUEUR_BRANCHE_PAR_DEFAUT, e1.getLongueurBranche(), EPSILON);
	}
	
	@Test
	public void testConstructeur2() {
		Etoile e1 = new Etoile(new Coordonnees(3,4));
		
		assertEquals("Test de la position e1",new Coordonnees(3,4) ,e1.getPosition());
		assertEquals("Test de la hauteur de e1",Forme.HAUTEUR_PAR_DEFAUT,e1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de e1",Forme.LARGEUR_PAR_DEFAUT,e1.getLargeur(), EPSILON);
		assertEquals("Test du nombre de branche par défaut de e1", Etoile.NOMBRE_BRANCHES_PAR_DEFAUT, e1.getNombreBranches());
		assertEquals("Test de l'angle de la première branche par défaut de e1", Etoile.ANGLE_PREMIERE_BRANCHE_PAR_DEFAUT, e1.getAnglePremiereBranche(), EPSILON);
		assertEquals("Test de la longueur des branches par défaut de e1", Etoile.LONGUEUR_BRANCHE_PAR_DEFAUT, e1.getLongueurBranche(), EPSILON);
	}
	
	@Test
	public void testConstructeur3() {
		Etoile e1 = new Etoile(new Coordonnees(4.2,-5.6), 42);
		
		assertEquals("Test de la position e1",new Coordonnees(4.2,-5.6) ,e1.getPosition());
		assertEquals("Test de la hauteur de e1",42,e1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de e1",42,e1.getLargeur(), EPSILON);
		assertEquals("Test du nombre de branche par défaut de e1", Etoile.NOMBRE_BRANCHES_PAR_DEFAUT, e1.getNombreBranches());
		assertEquals("Test de l'angle de la première branche par défaut de e1", Etoile.ANGLE_PREMIERE_BRANCHE_PAR_DEFAUT, e1.getAnglePremiereBranche(), EPSILON);
		assertEquals("Test de la longueur des branches par défaut de e1", Etoile.LONGUEUR_BRANCHE_PAR_DEFAUT, e1.getLongueurBranche(), EPSILON);
	}
	
	@Test
	public void testConstructeur4() {
		Etoile e1 = new Etoile(new Coordonnees(4,3), 8, 4, 0, 0.5);
		
		assertEquals("Test de la position e1",new Coordonnees(4,3) ,e1.getPosition());
		assertEquals("Test de la hauteur de e1",8,e1.getHauteur(), EPSILON);
		assertEquals("Test de la largeur de e1",8,e1.getLargeur(), EPSILON);
		assertEquals("Test du nombre de branche par défaut de e1", 4, e1.getNombreBranches());
		assertEquals("Test de l'angle de la première branche par défaut de e1", 0, e1.getAnglePremiereBranche(), EPSILON);
		assertEquals("Test de la longueur des branches par défaut de e1", 0.5, e1.getLongueurBranche(), EPSILON);
		assertEquals("Test du premier sommet", new Coordonnees(12,7),e1.getCoordonnees().get(0));
	}
	
	@Test
	public void shouldThrowException1() throws Exception {
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : Taille négative ou nulle impossible !");
	    new Etoile(new Coordonnees(),-4,Etoile.NOMBRE_BRANCHES_PAR_DEFAUT, Etoile.ANGLE_PREMIERE_BRANCHE_PAR_DEFAUT, Etoile.LONGUEUR_BRANCHE_PAR_DEFAUT);
	}
	
	@Test
	public void shouldThrowException2() throws Exception {
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : Le nombre de branche dois être compris entre 3 et 15 !");
	    new Etoile(new Coordonnees(),Forme.LARGEUR_PAR_DEFAUT,16, Etoile.ANGLE_PREMIERE_BRANCHE_PAR_DEFAUT, Etoile.LONGUEUR_BRANCHE_PAR_DEFAUT);
	}
	
	@Test
	public void shouldThrowException3() throws Exception {
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : Le nombre de branche dois être compris entre 3 et 15 !");
	    new Etoile(new Coordonnees(),Forme.LARGEUR_PAR_DEFAUT,2, Etoile.ANGLE_PREMIERE_BRANCHE_PAR_DEFAUT, Etoile.LONGUEUR_BRANCHE_PAR_DEFAUT);
	}
	
	@Test
	public void shouldThrowException4() throws Exception {
	    thrownException.expect(IllegalArgumentException.class);
	    thrownException.expectMessage("Attention : L'angle de la première branche doit être compris entre -Pi et Pi !");
	    new Etoile(new Coordonnees(),Forme.LARGEUR_PAR_DEFAUT,Etoile.NOMBRE_BRANCHES_PAR_DEFAUT, 2*Math.PI, Etoile.LONGUEUR_BRANCHE_PAR_DEFAUT);
	}
	
	@Test
	public void testtoString(){
		Etoile e1 = new Etoile(new Coordonnees(10,10),25);
		Locale locale = Locale.getDefault();
		if (locale.getLanguage() == "fr") {
			assertEquals("Test de toString non rempli et locale fr et du constructeur Coordonnees int de Cercle","[Etoile] : pos (10,0 , 10,0) dim 25,0 x 25,0 périmètre : 83,01 aire : 229,6 couleur = R0,V0,B0", e1.toString());
		}
		else {
			assertEquals("Test de toString non rempli et locale non fr du constructeur Coordonnees int de Cercle","[Etoile] : pos (10,0 , 10,0) dim 25,0 x 25,0 périmètre : 83,01 aire : 229,6 couleur = R0,G0,B0", e1.toString());
		}
	}
	
	@Test
	public void testtoStringRemplissage(){
		Etoile e1 = new Etoile(new Coordonnees(10,10),25);
		Locale locale = Locale.getDefault();
		e1.setRempli(true);
		if (locale.getLanguage() == "fr") {
			assertEquals("Test de toString rempli et locale fr et du constructeur Coordonnees int de Cercle","[Etoile-Rempli] : pos (10,0 , 10,0) dim 25,0 x 25,0 périmètre : 83,01 aire : 229,6 couleur = R0,V0,B0", e1.toString());
		}
		else {
			assertEquals("Test de toString rempli et locale non fr du constructeur Coordonnees int de Cercle","[Etoile-Rempli] : pos (10,0 , 10,0) dim 25,0 x 25,0 périmètre : 83,01 aire : 229,6 couleur = R0,G0,B0", e1.toString());
		}
	}
}
