package librairie;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class ComposantGraphique extends JFrame {

	private static final long serialVersionUID = 1L;	
	private JPanel panneau = new JPanel();

	public ComposantGraphique (String nom, int hauteur, int largeur) {
		setTitle(nom);
		setSize(new Dimension(largeur, hauteur));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComposant(panneau);
		setContentPane(panneau);
		setVisible(true);
	}
	
	public abstract void initComposant(JPanel panneau);

}
