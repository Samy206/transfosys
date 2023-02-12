package maison;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Cmaison extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel panneau = new JPanel();

	public Cmaison (String nom, int hauteur, int largeur) {
		setTitle(nom);
		setSize(new Dimension(largeur, hauteur));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initmaison();
		setContentPane(panneau);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Cmaison("maison", 400, 900);
	}
		
	private void initmaison() {
		//detecteur
		DetecteurFumee detecteur = new DetecteurFumee("detecteur");
		panneau.add(detecteur);
		OutputPort portdetecteur_portDetection = detecteur.getPort_portDetection();
		//bouton
		BoutonPoussoir bouton = new BoutonPoussoir("bouton");
		panneau.add(bouton);
		OutputPort portbouton_press = bouton.getPort_press();
		//lampe
		Lampe lampe = new Lampe("lampe");
		panneau.add(lampe);
		
		repaint();

		Connecteur connecteurDetecteur2Lampe = new Connecteur(lampe.getPort_commande());
		portdetecteur_portDetection.ajouterConnecteur(connecteurDetecteur2Lampe);
		Connecteur connecteurBouton2Detecteur = new Connecteur(detecteur.getPort_portInit());
		portbouton_press.ajouterConnecteur(connecteurBouton2Detecteur);
		Connecteur connecteurBouton2Lampe = new Connecteur(lampe.getPort_commande());
		portbouton_press.ajouterConnecteur(connecteurBouton2Lampe);
	}

}