package librairie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Interrupteur extends JButton {
	private static final long serialVersionUID = 1L;
	private static Icon iconOFF = new ImageIcon("src/utilitaires/interrupteurBas.png");
	private static Icon iconON = new ImageIcon("src/utilitaires/interrupteurHaut.png");
	private OutputPort port = new OutputPort();
	
	public Interrupteur(String nom) {
		super(nom,iconOFF);
		setVisible(true);
		setSize(25,25);
		// Texte sous l'image
	    setVerticalTextPosition(SwingConstants.BOTTOM);
	    // Texte centré
	    setHorizontalTextPosition(SwingConstants.CENTER); 
		//setText("Appuyer");
		addActionListener(new ActionListener() { 

		@Override
		public void actionPerformed(ActionEvent e) {
			if(getIcon().equals(iconON)) {
				setIcon(iconOFF);
			} else {
				setIcon(iconON);
			};
			port.send();
		} 
		 }); 
	}
	
	public OutputPort getPort() {
		return port;
	}
}
