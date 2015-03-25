package observateurs;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import observer.Observee;
/**
 * @author Equipe 3 IUT Aix-Marseille
 * Membres d'equipe: Cesar, Gregory, Michael, Catherine
 * @version 1.0
 * */
@SuppressWarnings("serial")
public class ObservateurCouleur extends JFrame implements Observer, ActionListener{

	private JPanel contentPane;
	private JLabel title,message;
	private int couleurSele;
	private Observee obser;
	private ButtonGroup grup;
	private JRadioButton jeune,blue,rouge,vert,noir,blanc,inv;
	/**
	 * Create the frame.
	 */
	public ObservateurCouleur(Observee obser) {
		this.obser=obser;
		title= new JLabel();
		title.setText("Couleur Selection\u00E9");
		title.setBounds(130, 10, 150, 25);
		  
		message= new JLabel();
		message.setText("Vous n'avez pas s\u00E9lectionn\u00E9 une couleur");
		message.setBounds(10, 60, 250, 25);
			
		contentPane=new JPanel();
		contentPane.setBounds(5, 66, 380, 190);
		  
		jeune=new JRadioButton();
		jeune.setText("Jeune");
		jeune.setBounds(5, 40, 75, 25);
		jeune.addActionListener(this);
		  
		blue=new JRadioButton();
		blue.setText("Blue");
		blue.setBounds(80, 40, 50, 25);
		blue.addActionListener(this);
		  
		rouge=new JRadioButton();
		rouge.setText("Rouge");
		rouge.setBounds(130, 40, 65, 25);
		rouge.addActionListener(this);
		  
		vert=new JRadioButton();
		vert.setText("Vert");
		vert.setBounds(190, 40, 60, 25);
		vert.addActionListener(this);
		  
		noir=new JRadioButton();
		noir.setText("Noir");
		noir.setBounds(246, 40, 60, 25);
		noir.addActionListener(this);
		 
		blanc=new JRadioButton();
		blanc.setText("Blanc");
		blanc.setBounds(300, 40, 70, 25);
		blanc.addActionListener(this);
		 
		inv=new JRadioButton();
		inv.setText("Blanco");
		inv.setBounds(300, 50, 70, 25);
		inv.addActionListener(this);
		  
		grup = new ButtonGroup();
		grup.add(jeune);
		grup.add(blue);
		grup.add(rouge);
		grup.add(vert);
		grup.add(noir);
		grup.add(blanc);
		grup.add(inv);
		 
		add(jeune);
		add(blue);
		add(rouge);
		add(vert);
		add(noir);
		add(blanc);
		add(message);
		add(title);
		add(contentPane);
		 
		setSize(400,300);
		setTitle("Fenetre Obervee");
		setLocation(280, 300);
		setLayout(null);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==jeune) 
			obser.setCouleurSel(1);
		if (e.getSource()==blue) 
			obser.setCouleurSel(2);
		if (e.getSource()==rouge) 
			obser.setCouleurSel(3);
		if (e.getSource()==vert) 
			obser.setCouleurSel(4);
		if (e.getSource()==noir) 
			obser.setCouleurSel(5);
		if (e.getSource()==blanc) 
			obser.setCouleurSel(6);
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
			case 1: message.setText(""); 
					contentPane.setBackground(Color.yellow);
					jeune.setSelected(true);
					break;
			case 2: message.setText("");
					contentPane.setBackground(Color.blue);
					blue.setSelected(true);
					break;
			case 3: message.setText("");
					contentPane.setBackground(Color.red);
					rouge.setSelected(true);
					break;
			case 4: message.setText("");
					contentPane.setBackground(Color.green);
					vert.setSelected(true);
					break;
			case 5: message.setText("");
					contentPane.setBackground(Color.black);
					noir.setSelected(true);
					break;
			case 6: message.setText("");
					contentPane.setBackground(Color.white);
					blanc.setSelected(true);
					break;
			case 7: message.setText("");
					contentPane.setBackground(Color.orange);
					inv.setSelected(true);
					break;
			default : message.setText("Vous n'avez pas s\u00E9lectionn\u00E9 une couleur");
					contentPane.setBackground(null);
				      inv.setSelected(true);
		}
		
	}

}
