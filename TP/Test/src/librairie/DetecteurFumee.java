package librairie;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class DetecteurFumee extends JButton {
	private static final long serialVersionUID = 1L;
	private static Icon icon = new ImageIcon("src/utilitaires/detecteurFumee.png");
	private boolean detecte = false;
	private OutputPort portDetection = new OutputPort();
	private InputPort portInit = new InputPort() {
		@Override
		public void send() {
			detecte = false;
		}
	};

	public DetecteurFumee(String nom) {
		super(nom, icon);
		setSize(25, 25);
		// Texte sous l'image
		setVerticalTextPosition(SwingConstants.BOTTOM);
		// Texte centré
		setHorizontalTextPosition(SwingConstants.CENTER);
		// setText("Appuyer");
		addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				setBackground(Color.ORANGE);
				if (!detecte) {
					portDetection.send();
					detecte = true;
				}
			}

			public void mouseExited(MouseEvent evt) {
				setBackground(null);
			}
		});
	}

	public OutputPort getPort_portDetection() {
		return portDetection;
	}
	
	public InputPort getPort_portInit() {
		return portInit;
	}
}
