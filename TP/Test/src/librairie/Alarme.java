package librairie;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Alarme extends JLabel {
	private static final long serialVersionUID = 1L;
	
	private InputPort commande = new InputPort() {
		@Override
		public void send() {
			basculer();
		}
	};
	private boolean on = false;
	private static final Icon IMAGE_OFF = new ImageIcon("src/utilitaires/alarmeOff.png");
	private static final Icon IMAGE_ON = new ImageIcon("src/utilitaires/alarmeOn.png");

	public Alarme(String nom) {
		super(nom, IMAGE_OFF, CENTER);		
	    // Texte centré
	    setHorizontalTextPosition(SwingConstants.CENTER); 
		// Texte sous l'image
	    setVerticalTextPosition(SwingConstants.BOTTOM);
		setSize(40, 40);
		setVisible(true);
		repaint();
	}
	
	public InputPort getPort_commande() {
		return commande;
	}
	
	public void basculer() {
		on = !on;
		if (on) {
			setIcon(IMAGE_ON);
		} else {
			setIcon(IMAGE_OFF);
		}
	}
}
