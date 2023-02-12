package librairie;

public class Connecteur {
	Port cible;

	public Connecteur(Port cible) {
		super();
		this.cible = cible;
	}
	
	public void send() {
		cible.send();
	}

}
