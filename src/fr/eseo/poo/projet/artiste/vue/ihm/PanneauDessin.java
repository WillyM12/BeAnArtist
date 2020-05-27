package fr.eseo.poo.projet.artiste.vue.ihm;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import fr.eseo.poo.projet.artiste.controleur.outils.Outil;
import fr.eseo.poo.projet.artiste.modele.formes.Forme;
import fr.eseo.poo.projet.artiste.vue.formes.VueForme;

public class PanneauDessin extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int LARGEUR_PAR_DEFAUT = 700;
	public static final int HAUTEUR_PAR_DEFAUT = 350;
	public static final Color COULEUR_FOND_PAR_DEFAUT = Color.WHITE;
	
	private final List<VueForme> vueFormes;
	private Outil outilCourant;
	private Color couleurCourante;
	private boolean modeRemplissage;
	
	public PanneauDessin() {
		this(LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT, COULEUR_FOND_PAR_DEFAUT);
	}
	
	public PanneauDessin(int largeur, int hauteur, Color fond) {
		super();
		vueFormes = new ArrayList<VueForme>();
		setPreferredSize(new Dimension(largeur, hauteur));
		setBackground(fond);
		setCouleurCourante(Forme.COULEUR_PAR_DEFAUT);
		setModeRemplissage(false);
	}
	
	public List<VueForme> getVueFormes(){
		return vueFormes;
	}
	
	public void ajouterVueForme(VueForme vueForme) {
		vueFormes.add(vueForme);
	}
	
	public void supprimerVueForme(VueForme vueForme) {
		if (vueForme != null) {
			vueFormes.remove(vueForme);
		}	
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2D = (Graphics2D)g.create();
		
		for(VueForme uneForme : vueFormes) {
			uneForme.affiche(g2D);
		}
		
		g2D.dispose();
	}
	
	public void associerOutil (Outil outil) {
		if (outil != null) {
			dissocierOutil();
			setOutilCourant(outil);
			outil.setPanneauDessin(this);
			addMouseListener(outil);
			addMouseMotionListener(outil);
			this.setOutilCourant(outil);
		}	
	}
	
	private void dissocierOutil() {
		if (getOutilCourant() != null) {
			getOutilCourant().setPanneauDessin(null);
			removeMouseListener(getOutilCourant());
			removeMouseMotionListener(getOutilCourant());
			setOutilCourant(null);
		}
		
	}
	
	public Outil getOutilCourant() {
		return this.outilCourant;
	}
	
	private void setOutilCourant (Outil outil) {
		this.outilCourant = outil;
	}
	
	public Color getCouleurCourante() {
		return this.couleurCourante;
	}
	
	public void setCouleurCourante(Color couleur) {
		this.couleurCourante = couleur;
	}
	
	public boolean getModeRemplissage() {
		return this.modeRemplissage;
	}
	
	public void setModeRemplissage(boolean modeRemplissage) {
		this.modeRemplissage = modeRemplissage;
	}
}