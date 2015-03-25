package observateurs;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import observer.Observee;

/**
 * @author Equipe 3 IUT Aix-Marseille
 * Membres d'equipe: Cesar, Gregory, Michael, Catherine
 * @version 1.0
 * */
@SuppressWarnings("serial")
public class ObservateurSelect extends JFrame implements Observer{

	private JLabel title,couleur;
	private int couleurSele;
	private Observee obser;

	/**
	 * Create the frame.
	 */
	public ObservateurSelect(Observee obser) {
		this.obser=obser;		
		
		title= new JLabel();
		title.setText("Couleur Selection\u00E9");
		title.setBounds(20, 10, 150, 25);
			 
		couleur= new JLabel();
		couleur.setText("Vous n'avez pas s\u00E9lectionn\u00E9 une couleur");
		couleur.setBounds(20, 40, 300, 25);
		  
		add(title);
		add(couleur);
		
		setSize(300,100);
		setTitle("Fenetre Couleur");
		setLocation(700, 300);
		setLayout(null);
		setVisible(true);
	}
	
	/**
	 * Cette méthode est appelée chaque fois que l'objet observé est modifiée. 
	 * Une application appelle notifyObservers la méthode d'un objet observable 
	 * d'avoir tous les observateurs de l'objet notifiés du changement.
	 */
	@Override
	public void update(Observable o, Object arg) {
		couleurSele=obser.getCouleurSel();
		switch (couleurSele){
			case 1:
				couleur.setText(obser.getCouleur());
				break;
			case 2:
				couleur.setText(obser.getCouleur());
				break;
			case 3:
				couleur.setText(obser.getCouleur());
				break;
			case 4:
				couleur.setText(obser.getCouleur());
				break;
			case 5:
				couleur.setText(obser.getCouleur());
				break;
			case 6:
				couleur.setText(obser.getCouleur());
				break;
			case 7:
				couleur.setText(obser.getCouleur());
				break;
			default : 
				couleur.setText("Vous n'avez pas s\u00E9lectionn\u00E9 une couleur");
				break;
		}
		
	}

}
