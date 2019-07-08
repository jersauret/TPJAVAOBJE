package DeroulementJeu;

import Personnages.PJ._Pj;

public class _2_Partie {

int nbDeToursMax=0;
	int currentTour = 0;
	private _2_Partie currentPartie;
	private _Pj currentPlayer;
	public _2_Partie(_Pj currentPlayer) {
		this.nbDeToursMax = 15;
		this.currentTour=0;
		this.currentPlayer=currentPlayer;
	}
	public _Pj getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(_Pj currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public int getCurrentTour() {
	return currentTour;
	}

	public void setCurrentTour(int currentTour) {
		this.currentTour = currentTour;
	}

	public int getNbDeToursMax() {
		return this.nbDeToursMax;
	}

	public void setNbDeToursMax(int nbDeToursMax) {
		currentPartie.nbDeToursMax = nbDeToursMax;
	}

	public _2_Partie getCurrentPartie() {
		return currentPartie;
	}

	public void setCurrentPartie(_2_Partie currentPartie) {
		this.currentPartie = currentPartie;
	}

	public void derouler(_Pj currentPlayer) {

	}
}
