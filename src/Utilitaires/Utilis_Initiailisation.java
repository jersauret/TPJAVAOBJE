package Utilitaires;

import java.util.Scanner;
import DeroulementJeu._2_Partie;
import DeroulementJeu._3_Rencontre;
import DeroulementJeu._4_Rencontre_RencontreAmicale;
import DeroulementJeu._4_Rencontre_RencontreMonstre;
import Personnages.Personnages;
import Personnages.PJ._PJ_Mage;
import Personnages.PJ._PJ_Voleur;
import Personnages.PJ._Pj;
import Personnages.PJ._Pj_Guerrier;
import Personnages.PNJ._Pnj_Ami_Coach;
import Personnages.PNJ._Pnj_Monstre;
import Personnages.PNJ._Pnj_Ami_Doc;

public interface Utilis_Initiailisation {

	public _3_Rencontre currentRencontre = null;
	static String nomPersoCourant = null;

	public static void genererTours(_2_Partie currentPartie, Personnages Perso) {
		int currentCompteurTour = 0;
		while (++currentCompteurTour <= currentPartie.getNbDeToursMax() && Perso.isEnVie()) {
			System.out.println(currentCompteurTour);
			currentPartie.setCurrentTour(currentCompteurTour);
			randPickAndCreateRencontre(currentPartie);
		}
	}


	/// random generation and creation of rencontre
	public static _3_Rencontre randPickAndCreateRencontre(_2_Partie currentPartie) {
		int d100 = (int) (Math.random() * 100.0 + 1);
		System.out.println("Je fais un tirage au sort et créé une nouvelle Rencontre (d100)= "+d100);
		if (d100 <= 100 && d100 > 30 ) {
			return new _4_Rencontre_RencontreMonstre(currentPartie.getCurrentPlayer(), new _Pnj_Monstre("Le monstre", "Monstre"));
		} else if (d100 < 30 && d100 >= 10) {
			return new _4_Rencontre_RencontreAmicale(currentPartie.getCurrentPlayer(), new _Pnj_Ami_Coach("Le Coach", "Coach"));
		} else {
			return new _4_Rencontre_RencontreAmicale(currentPartie.getCurrentPlayer(), new _Pnj_Ami_Doc("Le Doc", "Doc"));
		}
	}
	
	public static String askNomJoueur() {
		Scanner askNomJoueur = new Scanner(System.in);
		System.out.println("Veuillez entrer votre nom");
		String nomDonneJoueur = askNomJoueur.next();
		System.out.println(" " + nomDonneJoueur);
		askNomJoueur.close();
		return nomDonneJoueur;
	
	}
// Demande le type de Pj en prenant le surnom et en creant un nouveau pj adapté
	public static _Pj askNomPerso(String nomDonneJoueur) {
		Scanner askNomPerso = new Scanner(System.in);
		System.out.println("Veuillez choisir votre perso en tapant le chiffre correspondant");
		System.out.println("1: Guerrier 2:Mage 3: Voleur");
		int nombreChoixPerso = askNomPerso.nextInt();
		askNomPerso.close();
		_Pj currentPlayer = null;
		String nomPersoCourant = null;
		switch (nombreChoixPerso) {
		case 1:
			nomPersoCourant = "Guerrier";
			return new _Pj_Guerrier (nomDonneJoueur,nomPersoCourant);
		case 2:
			nomPersoCourant = "Mage";
			return new _PJ_Mage (nomDonneJoueur,nomPersoCourant);
		case 3:
			nomPersoCourant = "Voleur";
			return new _PJ_Voleur (nomDonneJoueur,nomPersoCourant);
		}
		askNomPerso.close();
		return currentPlayer;

	}

}
