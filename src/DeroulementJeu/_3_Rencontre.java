package DeroulementJeu;

import Personnages.PJ._Pj;
import Personnages.PNJ._Pnj;
import Personnages.PNJ._Pnj_Ami_Coach;
import Personnages.PNJ._Pnj_Monstre;
import Personnages.PNJ._Pnj_Ami_Doc;

public class _3_Rencontre implements Utilitaires.Utilis_Regles {
	public _Pj nomDuPj;
	public _Pnj nomduPnj;
	public _Pj getNomDuPj() {
		return nomDuPj;
	}
	public void setNomDuPj(_Pj nomDuPj) {
		this.nomDuPj = nomDuPj;
	}
	public _Pnj getNomduPnj() {
		return nomduPnj;
	}
	public void setNomduPnj(_Pnj nomduPnj) {
		this.nomduPnj = nomduPnj;
	}
	public _3_Rencontre getCurrentRencontre() {
		return currentRencontre;
	}
	public void setCurrentRencontre(_3_Rencontre currentRencontre) {
		this.currentRencontre = currentRencontre;
	}

	protected _3_Rencontre currentRencontre;

	_3_Rencontre(_Pj nomDuPj, _Pnj nomDuPnj) {
		this.nomDuPj = nomDuPj;
		this.nomduPnj = nomDuPnj;
	}
	_3_Rencontre(_Pj nomDuPj, _Pnj_Monstre nomDuPnj) {
		this.nomDuPj = nomDuPj;
		this.nomduPnj = nomDuPnj;
	}

	_3_Rencontre(_Pj nomDuPj, _Pnj_Ami_Doc nomDuPnj) {
		this.nomDuPj = nomDuPj;
		this.nomduPnj = nomDuPnj;
	}

	_3_Rencontre(_Pj nomDuPj, _Pnj_Ami_Coach nomDuPnj) {
		this.nomDuPj = nomDuPj;
		this.nomduPnj = nomDuPnj;
	}

}
