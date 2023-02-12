package librairie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class BoutonPoussoir extends JButton {
	private static final long serialVersionUID = 1L;
	private static Icon icon = new ImageIcon("src/utilitaires/boutonPoussoir.png");
	private OutputPort press = new OutputPort();
	
	public BoutonPoussoir(String nom) {
		super(nom,icon);
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
			press.send();
		} 
		 }); 
	}
	
	public OutputPort getPort_press() {
		return press;
	}
}
