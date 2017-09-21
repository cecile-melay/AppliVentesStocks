package controlleur;

import vue.VueJetable;

/**
 * Controlleur
 */
public class Session {
	private VueJetable vueJetable;
	
	/**
	 * Constructeur du controlleur
	 */
	public Session() {
		this.vueJetable = new VueJetable(this);
		this.vueJetable.setVisible(true);
	}

	/**
	 * Action quand une personne clique sur le bouton "S'identifier"
	 */
	public EnumTypeEcran traiterConnexion() {
		System.out.println("Not implemented");
		return EnumTypeEcran.ECRAN_ACCUEIL;
	}

	public static void main(String[] args) {
		new Session();
	}
}
