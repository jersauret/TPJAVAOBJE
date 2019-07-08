package Utilitaires;

import DeroulementJeu._5_Attaque;

public interface Utilits_Combat {
	// designation rand attaque physique ou magique
	public static double attaquephysiqueoumagique() {
		double typeAttaque = Math.random(); // 0 phy 1 mag
		System.out.println(typeAttaque + "");
		return typeAttaque;
	}

	public static InterfaceCombattants deroulerAttaqueJusquaZero(InterfaceCombattants attaquant, InterfaceCombattants defenseur) {
		int compteur = 1;
		InterfaceCombattants gagnant=null;
		while (attaquant.getInitPointsVie() >= 0 && defenseur.getInitPointsVie() > 0) {

			if (compteur % 2 == 0) {
				double typeAttaque = attaquephysiqueoumagique();
				new _5_Attaque(attaquant, defenseur, typeAttaque);

			} else {
				double typeAttaque = attaquephysiqueoumagique();
				new _5_Attaque(defenseur, attaquant, typeAttaque);
			}
			compteur++;
			if (attaquant.getInitPointsVie() <= 0) {
				gagnant = attaquant;
				System.out.println("Vous avez perdu la partie");
				break;
			} else {
				System.out.println("Vous avez gagné cette attaque");
				gagnant = defenseur;
			}
			
		}
		
		return gagnant;

	}
}
