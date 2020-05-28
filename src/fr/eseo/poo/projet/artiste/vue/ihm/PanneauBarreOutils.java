package fr.eseo.poo.projet.artiste.vue.ihm;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;

import fr.eseo.poo.projet.artiste.controleur.actions.ActionChoisirCouleur;
import fr.eseo.poo.projet.artiste.controleur.actions.ActionChoisirForme;
import fr.eseo.poo.projet.artiste.controleur.actions.ActionChoisirRemplissage;
import fr.eseo.poo.projet.artiste.controleur.actions.ActionDeplacer;
import fr.eseo.poo.projet.artiste.controleur.actions.ActionEffacer;
import fr.eseo.poo.projet.artiste.controleur.actions.ActionSelectionner;
import fr.eseo.poo.projet.artiste.controleur.actions.ActionSupprimer;
import fr.eseo.poo.projet.artiste.modele.formes.Etoile;

public class PanneauBarreOutils extends JPanel {


	private static final long serialVersionUID = 1L;
	private PanneauDessin panneauDessin;
	private JSpinner nbBranches;
	private JSpinner longueurBranches;
	
	public static final String BRANCHE_SPINNER_NOM = "Nombre de branches";
	public static final String LONGUEUR_SPINNER_NOM = "Longueur des branches";
	
	public PanneauBarreOutils (PanneauDessin panneauDessin) {
		super();
		this.panneauDessin = panneauDessin;
		super.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		initComponents();
	}

	public void initComponents() {
		
		ActionEffacer erase = new ActionEffacer(this.panneauDessin);
		JButton eraseAll = new JButton(erase);
		eraseAll.setText(ActionEffacer.NOM_ACTION);
		eraseAll.setName(ActionEffacer.NOM_ACTION);
		
		ButtonGroup buttonGroup = new ButtonGroup();
	
		ActionChoisirForme ligne  = new ActionChoisirForme(this.panneauDessin, this, ActionChoisirForme.NOM_ACTION_LIGNE);
		JToggleButton outilLigne = new JToggleButton(ligne);
		outilLigne.setText(ActionChoisirForme.NOM_ACTION_LIGNE);
		outilLigne.setName(ActionChoisirForme.NOM_ACTION_LIGNE);
		
		ActionChoisirForme ellipse = new ActionChoisirForme(this.panneauDessin, this, ActionChoisirForme.NOM_ACTION_ELLIPSE);
		JToggleButton outilEllipse = new JToggleButton(ellipse);
		outilEllipse.setText(ActionChoisirForme.NOM_ACTION_ELLIPSE);
		outilEllipse.setName(ActionChoisirForme.NOM_ACTION_ELLIPSE);
		
		ActionChoisirForme cercle = new ActionChoisirForme(this.panneauDessin, this, ActionChoisirForme.NOM_ACTION_CERCLE);
		JToggleButton outilCercle = new JToggleButton(cercle);
		outilCercle.setText(ActionChoisirForme.NOM_ACTION_CERCLE);
		outilCercle.setName(ActionChoisirForme.NOM_ACTION_CERCLE);
		
		ActionChoisirForme etoile = new ActionChoisirForme(this.panneauDessin, this, ActionChoisirForme.NOM_ACTION_ETOILE);
		JToggleButton outilEtoile = new JToggleButton(etoile);
		outilEtoile.setText(ActionChoisirForme.NOM_ACTION_ETOILE);
		outilEtoile.setName(ActionChoisirForme.NOM_ACTION_ETOILE);
		
		ActionSelectionner select = new ActionSelectionner(this.panneauDessin);
		JToggleButton outilSelectionner = new JToggleButton(select);
		outilSelectionner.setText(ActionSelectionner.NOM_ACTION);
		outilSelectionner.setName(ActionSelectionner.NOM_ACTION);
		
		ActionSupprimer eraseForme = new ActionSupprimer(this.panneauDessin);
		JToggleButton outilEraseForme = new JToggleButton(eraseForme);
		outilEraseForme.setText(ActionSupprimer.NOM_ACTION);
		outilEraseForme.setName(ActionSupprimer.NOM_ACTION);
		
		ActionDeplacer deplacer = new ActionDeplacer(this.panneauDessin);
		JToggleButton outilDeplacer = new JToggleButton(deplacer);
		outilDeplacer.setText(ActionDeplacer.NOM_ACTION);
		outilDeplacer.setName(ActionDeplacer.NOM_ACTION);		
		
		buttonGroup.add(outilLigne);
		buttonGroup.add(outilEllipse);
		buttonGroup.add(outilCercle);
		buttonGroup.add(outilEtoile);
		buttonGroup.add(outilSelectionner);
		buttonGroup.add(outilEraseForme);
		buttonGroup.add(outilDeplacer);
		
		ActionChoisirCouleur color = new ActionChoisirCouleur(this.panneauDessin);
		JButton chooseColor = new JButton(color);
		chooseColor.setText(ActionChoisirCouleur.NOM_ACTION);
		chooseColor.setName(ActionChoisirCouleur.NOM_ACTION);
		
		ActionChoisirRemplissage remplissage = new ActionChoisirRemplissage(this.panneauDessin);
		JCheckBox modeRemplissage = new JCheckBox(remplissage);
		modeRemplissage.setText(ActionChoisirRemplissage.NOM_ACTION);
		modeRemplissage.setName(ActionChoisirRemplissage.NOM_ACTION);
		
		
		JLabel labelNbBranches = new JLabel(BRANCHE_SPINNER_NOM);
		labelNbBranches.setText(BRANCHE_SPINNER_NOM);
		SpinnerNumberModel nbBrancheModel = new SpinnerNumberModel(Etoile.NOMBRE_BRANCHES_PAR_DEFAUT, 3, 15, 1);
		this.nbBranches = new JSpinner(nbBrancheModel);
		this.nbBranches.setName(BRANCHE_SPINNER_NOM);
		labelNbBranches.setLabelFor(this.longueurBranches);
		
		JLabel labelLongueurBranches = new JLabel(LONGUEUR_SPINNER_NOM);
		labelLongueurBranches.setText(LONGUEUR_SPINNER_NOM);
		SpinnerNumberModel longueurBrancheModel = new SpinnerNumberModel(Etoile.LONGUEUR_BRANCHE_PAR_DEFAUT, 0.00, 1.00, 0.01);
		this.longueurBranches = new JSpinner(longueurBrancheModel);
		this.longueurBranches.setName(LONGUEUR_SPINNER_NOM);
		labelLongueurBranches.setLabelFor(this.longueurBranches);
		
		this.add(eraseAll);
		this.add(outilLigne);
		this.add(outilEllipse);
		this.add(outilCercle);
		this.add(outilEtoile);
		this.add(outilSelectionner);
		this.add(outilEraseForme);
		this.add(outilDeplacer);
		this.add(chooseColor);
		this.add(modeRemplissage);
		this.add(labelNbBranches);
		this.add(this.nbBranches);
		this.add(labelLongueurBranches);
		this.add(this.longueurBranches);
	}
	
	public int getNbBranches() {
		return (int)this.nbBranches.getValue();
	}
	
	public double getLongueurBranche() {
		return (double)this.longueurBranches.getValue();
	}
}
