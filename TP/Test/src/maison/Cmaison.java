package maison;

import librairie.*;
import javax.swing.JPanel;

	public class Cmaison
extends		ComposantGraphique
	{
		private static final long serialVersionUID = 1L;

		public static void main(String[] args) {
			new Cmaison("Cmaison", 400, 900);
		}

		private 	JPanel panneau
			= 	new JPanel(
				)
;

		 	public  Cmaison (
					String nom
,					int hauteur
,					int largeur
) {
							super(
									nom
						,			hauteur
						,			largeur
							);
							initComposant(
									p
							);
			}
		 	public void  initComposant (
					JPanel p
) {
			}
	}

