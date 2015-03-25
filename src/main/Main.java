package main;

import observateurs.ObservateurCouleur;
import observateurs.ObservateurOptions;
import observateurs.ObservateurSelect;
import observer.Observee;
/**
 * @author Equipe 3 IUT Aix-Marseille
 * Membres d'equipe: Cesar, Gregory, Michael, Catherine
 * @version 1.0
 * */
public class Main {
	public static void main(String [] args){
		Observee observee=new Observee();
		ObservateurCouleur obC=new ObservateurCouleur(observee);
		ObservateurOptions obO=new ObservateurOptions(observee);
		ObservateurSelect obS=new ObservateurSelect(observee);
		
		observee.addObserver(obC);
		observee.addObserver(obO);
		observee.addObserver(obS);
	}
}
