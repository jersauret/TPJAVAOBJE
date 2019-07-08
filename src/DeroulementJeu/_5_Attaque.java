package DeroulementJeu;

import Utilitaires.InterfaceCombattants;

public class _5_Attaque {
	double attaquePhysiqueChanceDeReussite = 0.7;
	double attaqueMagiqueChanceDeReussite = 0.9;
	
	public _5_Attaque(InterfaceCombattants attaquant, InterfaceCombattants defenseur, double zeropourphysique) {
		ResoudreAttaque(attaquant, defenseur, zeropourphysique);
	}

	public InterfaceCombattants ResoudreAttaque(InterfaceCombattants attaquant, InterfaceCombattants defenseur, double zeropourphysique) {
		double chancebase;
		if (zeropourphysique > 0.5) {
			chancebase = attaquePhysiqueChanceDeReussite;
			int tirageDesDouze = (int) (Math.random() * 12.0 + 1);
			System.out.println("tirage du des" + tirageDesDouze);
			attaquant.getInitPointsForce();
		} else {
			chancebase = attaqueMagiqueChanceDeReussite;
			int tirageDesDouze2 = (int) (Math.random() * 12.0 + 1);
			System.out.println("tirage du des" + tirageDesDouze2);
			attaquant.getInitPpointsIntelligence();
		}

		double niveauAttaquant = attaquant.getInitPointsForce();
		double niveauDefenseur = defenseur.getInitPointsForce();
		double agiliteAttaquant = attaquant.getInitPointsAgilite();
		double agiliteDefenseur = defenseur.getInitPointsAgilite();
		double chanceDeReussite = (chancebase + (niveauAttaquant - niveauDefenseur) * 0.1)
				+ (agiliteAttaquant - agiliteDefenseur) * 0.05;
		if (chanceDeReussite >= 1)
			;
		InterfaceCombattants perdantAttaque = attaquant;
		perdantAttaque = defenseur;

		perdantAttaque.encaisserAttaque(20);
		
//		perdantAttaque.setInitPointsVie(perdantAttaque.getInitPointsVie() - pointsaretirer);
//		System.out.println(perdantAttaque + " est le perdant donc je lui retire " + pointsaretirer);
//		System.out.println(perdantAttaque.getInitPointsVie() + " est le nombre de points restant");
		return perdantAttaque;

	}
}
