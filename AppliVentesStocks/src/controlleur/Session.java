package controlleur;

import vue.EcranAccueil;

/**
 * Controlleur
 */
public class Session {

	/**
	 * Constructeur du controlleur
	 */
	public Session() {
		new EcranAccueil(this).setVisible(true);
	}

	/**
	 * Action quand une personne clique sur le bouton "S'identifier"
	 */
	public void actionBoutonIdentifier() {
		System.out.println("Not implemented");
	}

	public static void main(String[] args) {
		new Session();
	}
}
