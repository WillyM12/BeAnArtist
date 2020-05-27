package fr.eseo.poo.projet.artiste.controleur.outils;

import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputListener;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public abstract class Outil implements MouseInputListener{
	
	private Coordonnees debut;
	private Coordonnees fin;
	private PanneauDessin panneauDessin;

	public Coordonnees getDebut() {
		return debut;
	}
	
	public void setDebut(Coordonnees debut) {
		this.debut = debut;
	}
	
	public Coordonnees getFin() {
		return fin;
	}
	
	public void setFin(Coordonnees fin) {
		this.fin = fin;
	}
	
	public PanneauDessin getPanneauDessin() {
		return panneauDessin;
	}
	
	public void setPanneauDessin (PanneauDessin panneau) {
		this.panneauDessin = panneau;
	}
	
	public void mouseClicked (MouseEvent event) {
		
	}
	
	public void mouseDragged (MouseEvent event) {
		
	}
	
	public void mouseEntered (MouseEvent event) {
		
	}
	
	public void mouseExited (MouseEvent event) {
		
	}
	
	public void mouseMoved (MouseEvent event) {
		
	}
	
	public void mousePressed (MouseEvent event) {
		
	}
	
	public void mouseReleased (MouseEvent event) {
	
	}
}
