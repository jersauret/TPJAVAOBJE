package Personnages.PJ;

import Utilitaires.InterfaceCombattants;

public class _Pj_Guerrier extends _Pj  implements InterfaceCombattants {


	private String pseudoPerso;
	private String nomPerso;
	

	@Override
	public void setInitPointsVie() {
		// TODO Auto-generated method stub
		
	}
	public void setInitPointsVie(int nouvelleValeur) {
		this.initPointsVie = nouvelleValeur;
		System.out.println(initPointsVie+"s");
		
	}	

	public _Pj_Guerrier(String pseudoPerso, String nomPerso) {
		super(pseudoPerso, nomPerso);
		this.initPointsForce=21;
		this.initPointsAgilite=21;
		this.initPointsVie=21;
		this.initPpointsIntelligence=21;
		this.initPointsXp=20;
		this.initLevel=1;
		
	}

	public String getPseudoPerso() {
		return pseudoPerso;
	}

	public void setPseudoPerso(String pseudoPerso) {
		this.pseudoPerso = pseudoPerso;
	}

	public String getNomPerso() {
		return nomPerso;
	}

	public void setNomPerso(String nomPerso) {
		this.nomPerso = nomPerso;
	}
	@Override
	public int getInitPointsVie() {
		return initPointsVie;
	}
		
}
