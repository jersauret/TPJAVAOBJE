package DeroulementJeu;

import Personnages.PJ._Pj;

import Personnages.PNJ._Pnj_Monstre;
import Utilitaires.Utilits_Combat;

public class _4_Rencontre_RencontreMonstre extends _3_Rencontre {
	
// Constructeur
		public _4_Rencontre_RencontreMonstre(_Pj Player,_Pnj_Monstre monstre) {
		super(Player, monstre);
		System.out.println(Player + " attaquant ---- defenseur" + monstre );
		Utilits_Combat.deroulerAttaqueJusquaZero(Player,monstre);
			}	
	
	@Override
	public String toString() {
		return "RencontreMonstre";
	}
}
