package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controlleur.EnumTypeEcran;
import controlleur.Session;

/**
 * Ecran d'accueil
 */
@SuppressWarnings("serial")
public class VueJetable extends JFrame {

	/** Controlleur */
	private Session session;

	/** Panel principal */
	private JPanel panel;

	/** GridBagConstraints */
	private GridBagConstraints gbc;

	/**
	 * Constructeur de l'écran d'accueil
	 * 
	 * @param session
	 */
	public VueJetable() {
		super("AppliVentesStocks");

		// Controlleur
		session = new Session();

		// Traiter connexion
		EnumTypeEcran typeEcran = session.traiterConnexion();

		// Affichage en fonction du retour de traiterConnexion :
		if (typeEcran == EnumTypeEcran.ECRAN_ACCUEIL) {
			setSize(800, 450);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			// Panel principal
			panel = new JPanel();
			panel.setLayout(new GridBagLayout());
			setContentPane(panel);

			gbc = new GridBagConstraints();
			gbc.fill = GridBagConstraints.BOTH;

			// - Initialisation des composants de la fenetre :

			initZoneTexte();

			initZonePseudo();

			initZoneMDP();

			initZoneBouton();

			setVisible(true);
		}

	}

	public static void main(String[] args) {
		new VueJetable();
	}

	/**
	 * InitZoneTexte
	 */
	private void initZoneTexte() {

		// 1 - JLabel contenant le titre :
		JLabel titre = new JLabel("French Chic");
		titre.setFont(new Font("Arial", Font.PLAIN, 100));
		titre.setForeground(Color.MAGENTA);

		// Position
		gbc.gridy = 0;
		gbc.gridx = 0;

		gbc.gridwidth = 4;
		gbc.gridheight = 2;

		// Ajout au panel principal
		panel.add(titre, gbc);
	}

	/**
	 * InitZonePseudo
	 */
	private void initZonePseudo() {

		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.ipady = 10;

		// 1 - Zone de texte :
		JLabel pseudo = new JLabel("Pseudo");
		gbc.gridwidth = 1;
		gbc.gridheight = 1;

		// Position
		gbc.gridx = 2;
		gbc.gridy = 2;

		// Ajout au panel principal
		panel.add(pseudo, gbc);

		// 2 - Zone pour remplir :
		JTextField zonePseudo = new JTextField();

		// Position
		gbc.gridx = 3;

		// Ajout au panel principal
		panel.add(zonePseudo, gbc);
	}

	/**
	 * InitZoneMDP
	 */
	private void initZoneMDP() {

		// 1 - Zone de texte :
		JLabel motDePasse = new JLabel("Mot de passe");

		// Position
		gbc.gridx = 2;
		gbc.gridy = 3;

		// Ajout au panel principal
		panel.add(motDePasse, gbc);

		// 2 - Zone pour remplir :
		JPasswordField zoneMDP = new JPasswordField();
		gbc.gridx = 3;

		// Ajout au panel principal
		panel.add(zoneMDP, gbc);
	}

	/**
	 * InitZoneBouton
	 */
	private void initZoneBouton() {

		// 1 - Bouton :
		JButton bouton = new JButton("S'identifier");

		// Position
		gbc.gridx = 3;
		gbc.gridy = 4;

		// Ajout au panel principal
		panel.add(bouton, gbc);
	}

}