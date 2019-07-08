package Personnages.PJ;

public class _PJ_Voleur extends _Pj {

	public _PJ_Voleur(String pseudoPerso, String nomPerso) {
		super(pseudoPerso, nomPerso);
		this.initPointsForce=21;
		this.initPointsAgilite=21;
		this.initPointsVie=21;
		this.initPpointsIntelligence=21;
		this.initPointsXp=20;
		this.initLevel=1;
	}

	@Override
	public int getInitPointsVie() {
		return initPointsVie;
	}

	@Override
	public void setInitPointsVie(int nouvelleValeur) {
		this.initPointsVie=nouvelleValeur;
		
	}
	
	
}
