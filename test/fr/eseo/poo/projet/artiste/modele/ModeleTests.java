package fr.eseo.poo.projet.artiste.modele;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.eseo.poo.projet.artiste.modele.formes.CercleTest;
import fr.eseo.poo.projet.artiste.modele.formes.CercleTestPerimetreParameterized;
import fr.eseo.poo.projet.artiste.modele.formes.CercleTestgetCadreMaxXParameterized;
import fr.eseo.poo.projet.artiste.modele.formes.CercleTestgetCadreMaxYParameterized;
import fr.eseo.poo.projet.artiste.modele.formes.CercleTestgetCadreMinXParameterized;
import fr.eseo.poo.projet.artiste.modele.formes.CercleTestgetCadreMinYParameterized;
import fr.eseo.poo.projet.artiste.modele.formes.CercleTestsetHauteur;
import fr.eseo.poo.projet.artiste.modele.formes.CercleTestsetLargeur;
import fr.eseo.poo.projet.artiste.modele.formes.EllipseTest;
import fr.eseo.poo.projet.artiste.modele.formes.EllipseTestAireParameterized;
import fr.eseo.poo.projet.artiste.modele.formes.EllipseTestContient;
import fr.eseo.poo.projet.artiste.modele.formes.EllipseTestPerimetreParameterized;
import fr.eseo.poo.projet.artiste.modele.formes.EllipseTestsetHauteur;
import fr.eseo.poo.projet.artiste.modele.formes.EllipseTestsetLargeur;
import fr.eseo.poo.projet.artiste.modele.formes.EtoileTest;
import fr.eseo.poo.projet.artiste.modele.formes.EtoileTestAireParameterized;
import fr.eseo.poo.projet.artiste.modele.formes.EtoileTestContient;
import fr.eseo.poo.projet.artiste.modele.formes.EtoileTestPerimetreParameterized;
import fr.eseo.poo.projet.artiste.modele.formes.EtoileTestsetAnglePremiereBranche;
import fr.eseo.poo.projet.artiste.modele.formes.EtoileTestsetLongueurBranche;
import fr.eseo.poo.projet.artiste.modele.formes.LigneTest;
import fr.eseo.poo.projet.artiste.modele.formes.LigneTestContient;
import fr.eseo.poo.projet.artiste.modele.formes.LigneTestgetC2Parameterized;
import fr.eseo.poo.projet.artiste.modele.formes.LigneTestgetCadreMaxXParameterized;
import fr.eseo.poo.projet.artiste.modele.formes.LigneTestgetCadreMaxYParameterized;
import fr.eseo.poo.projet.artiste.modele.formes.LigneTestgetCadreMinXParameterized;
import fr.eseo.poo.projet.artiste.modele.formes.LigneTestgetCadreMinYParameterized;
import fr.eseo.poo.projet.artiste.modele.formes.LigneTestsetC1;
import fr.eseo.poo.projet.artiste.modele.formes.LigneTestsetC2;

/**
 * Suite de test permettant de lancer l'ensemble des tests de Modele.
 * 
 * @author Willy Martin
 * @version 1.0
 *
 */
@RunWith(Suite.class)
@SuiteClasses({CoordonneesTest.class,CoordonneesDeplacerDeTest.class, CoordonneesDeplacerVersTest.class, CoordonneesTestAngleVersParameterized.class, CoordonneesTestDistanceVersParameterized.class, CoordonneesTestsetX.class, CoordonneesTestsetY.class,
			LigneTest.class, LigneTestgetC2Parameterized.class, LigneTestsetC1.class, LigneTestsetC2.class, LigneTestgetCadreMaxXParameterized.class, LigneTestgetCadreMaxYParameterized.class, LigneTestgetCadreMinXParameterized.class, LigneTestgetCadreMinYParameterized.class,LigneTestContient.class,
			EllipseTest.class, EllipseTestsetHauteur.class, EllipseTestsetLargeur.class, EllipseTestPerimetreParameterized.class, EllipseTestAireParameterized.class, EllipseTestContient.class,
			CercleTest.class, CercleTestsetHauteur.class, CercleTestsetLargeur.class, CercleTestPerimetreParameterized.class, CercleTestgetCadreMaxXParameterized.class, CercleTestgetCadreMaxYParameterized.class, CercleTestgetCadreMinXParameterized.class, CercleTestgetCadreMinYParameterized.class,
			EtoileTest.class, EtoileTestPerimetreParameterized.class, EtoileTestAireParameterized.class, EtoileTestContient.class, EtoileTestsetAnglePremiereBranche.class, EtoileTestsetLongueurBranche.class})
public class ModeleTests {

}
