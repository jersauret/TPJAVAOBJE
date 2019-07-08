package DeroulementJeu;

import Personnages.PJ._Pj;
import Personnages.PNJ._Pnj_Ami_Coach;
import Personnages.PNJ._Pnj_Ami_Doc;



public class _4_Rencontre_RencontreAmicale extends _3_Rencontre {

	public _4_Rencontre_RencontreAmicale(_Pj Player, _Pnj_Ami_Coach lecoach) {
		super (Player, lecoach);
		int augmentationpoint=15;
		Player.setInitPointsVie(Player.getInitPointsVie()+augmentationpoint);
		System.out.println("Bravo vous avez gagné" + augmentationpoint + " points grace au coach");
		System.out.println("Vos PV actuel est " + Player.getInitPointsVie());
	}
	public _4_Rencontre_RencontreAmicale(_Pj Player, _Pnj_Ami_Doc ledoc) {
		super (Player, ledoc);
		int augmentationNiveau =1;
		Player.setInitLevel(Player.getInitLevel()+ augmentationNiveau);
		System.out.println("Bravo vous avez gagné" + augmentationNiveau + " niveau grace au coach");
		System.out.println("Votre niveau actuel est " + Player.getInitLevel());
	}

	
	@Override
	public String toString() {
		return "RencontreAmicale";
	}
}
