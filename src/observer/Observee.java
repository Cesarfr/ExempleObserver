package observer;

import java.util.Observable;

/**
 * @author Equipe 3 IUT Aix-Marseille
 * Membres d'equipe: Cesar, Gregory, Michael, Catherine
 * @version 1.0
 * */

/* Classe qui sera oberve*/
public class Observee extends Observable{ // Utilisation de la classe Observable pour representer l'objet observe
	
	private int couleurSel;
	private String couleur;
	
	public 	Observee(){
	}
	public void setCouleurSel(int i) {
		this.couleurSel = i;
		setChanged(); // Marque le changement de l'objet
	    notifyObservers();// Si l'objet change notifie les observateurs
	}
	public int getCouleurSel() {
		return couleurSel;
	}
	public void setCouleur(String color) {
		this.couleur = color;
	}
	public String getCouleur() {
		return couleur;
	}
}
