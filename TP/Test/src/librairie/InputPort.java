package librairie;

import java.util.ArrayList;
import java.util.List;

public class InputPort implements Port {
	private List<Connecteur> liste = new ArrayList<>();

	public void send() {
		for (Connecteur connecteur : liste) {
			connecteur.send();
		}
	}
}
