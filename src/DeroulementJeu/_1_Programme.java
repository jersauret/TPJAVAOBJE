package DeroulementJeu;

import Personnages.PJ._Pj;
import Utilitaires.Utilis_Initiailisation;

public class _1_Programme {

	public static void main(String[] args) {

// Demander son nom au joueur
		String pseudoPerso = Utilis_Initiailisation.askNomJoueur();
// demander le choix de perso et crée l'instance pj appropriée
		_Pj currentPlayer = Utilis_Initiailisation.askNomPerso(pseudoPerso);
////		// Créer une nouvelle partie avec le nom du joueur		
		_2_Partie currentPartie = new _2_Partie(currentPlayer);
		// demarrer les tours
		Utilis_Initiailisation.genererTours(currentPartie, currentPlayer);

		System.out.println(" " + currentPartie);
		// System.out.println("Vous etes " + nomJoueurCourant + " le " + nomPersoCourant
		// );
	}

}
