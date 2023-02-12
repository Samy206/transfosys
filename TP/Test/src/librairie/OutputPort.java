package librairie;

import java.util.ArrayList;
import java.util.List;

public class OutputPort implements Port{
	private List<Connecteur> liste = new ArrayList<>();
	
	public void ajouterConnecteur(Connecteur connecteur) {
		liste.add(connecteur);
	}
	
	public void send() {
		for (Connecteur connecteur : liste) {
			connecteur.send();
		}
	}
}
