package observateurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import observer.Observee;
/**
 * @author Equipe 3 IUT Aix-Marseille
 * Membres d'equipe: Cesar, Gregory, Michael, Catherine
 * @version 1.0
 * */
@SuppressWarnings("serial")
public class ObservateurOptions extends JFrame implements Observer,ActionListener{

	private JLabel title;
	private int couleurSele;
	private JComboBox<String> couleur;
	private String array[] = { "Selectionez", "Jeune", "Blue", "Rouge", "Vert", "Noir", "Blanc"};
	private Observee obser;

	/**
	 * Create the frame.
	 */
	public ObservateurOptions(Observee obser) {
		this.obser=obser;
		title= new JLabel();
		title.setText("PATRON OBSERVER");
		title.setBounds(20, 10, 250, 25);
		 
		couleur= new JComboBox<String>();
		couleur.setBounds(20, 40, 150, 25);
		couleur.setModel(new DefaultComboBoxModel<String>(array));
		couleur.addActionListener(this);
		  
		add(title);
		add(couleur);
		  
		setSize(250,110);
		setTitle("Fenetre Options");
		setLocation(500,150);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		obser.setCouleur((String)couleur.getSelectedItem());
		obser.setCouleurSel(couleur.getSelectedIndex());
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
				couleur.setSelectedIndex(1);
				break;
			case 2: 
				couleur.setSelectedIndex(2);
				break;
			case 3: 
				couleur.setSelectedIndex(3);
				break;
			case 4: 
				couleur.setSelectedIndex(4);
				break;
			case 5: 
				couleur.setSelectedIndex(5);
				break;
			case 6: 
				couleur.setSelectedIndex(6);
				break;
			case 7: 
				couleur.setSelectedIndex(7);
				break;
			default : 
				couleur.setSelectedIndex(0);
				break;
		}
	}

}
