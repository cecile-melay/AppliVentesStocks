package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
public class VueJetable extends JFrame implements ActionListener {
	
	
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

		// session
		this.session = new Session();
		
		EnumTypeEcran e = session.traiterConnexion();

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
		bouton.addActionListener(this);

		// Position
		gbc.gridx = 3;
		gbc.gridy = 4;

		// Ajout au panel principal
		panel.add(bouton, gbc);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// Action sur le bouton "S'identifier"
		session.traiterConnexion();
	}
	
	public static void main(String[] args) {
		new VueJetable();
	}
	
}