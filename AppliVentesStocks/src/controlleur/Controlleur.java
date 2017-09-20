package controlleur;

import vue.EcranAccueil;

/**
 * Controlleur
 */
public class Controlleur {

	/**
	 * Constructeur du controlleur
	 */
	public Controlleur() {
		new EcranAccueil(this).setVisible(true);
	}

	/**
	 * Action quand une personne clique sur le bouton "S'identifier"
	 */
	public void actionBoutonIdentifier() {
		System.out.println("Not implemented");
	}

	public static void main(String[] args) {
		new Controlleur();
	}
}
