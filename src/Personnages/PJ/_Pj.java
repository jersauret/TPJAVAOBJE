package Personnages.PJ;

import Personnages.Personnages;
import Utilitaires.InterfaceCombattants;

public abstract class _Pj extends Personnages implements Utilitaires.Utilis_Regles, InterfaceCombattants {
	public _Pj current_Pj;
	public int initPointsXp;
	public int initLevel;
	
	protected int pv;

	public _Pj(String pseudoPerso, String nomPerso) {
		super(pseudoPerso, nomPerso);
		this.initPointsXp = 0;
		this.initLevel = 0;
	}

	@Override
	public boolean isEnVie() {
		if (getInitPointsVie() > 0) {
			return true;
		} else
			return false;
	}

	public int getInitPointsForce() {
		return initPointsForce;
	}

	public void setInitPointsForce(int initPointsForce) {
		this.initPointsForce = initPointsForce;
	}

	public int getInitPointsAgilite() {
		return initPointsAgilite;
	}

	public void setInitPointsAgilite(int initPointsAgilite) {
		this.initPointsAgilite = initPointsAgilite;
	}

	public int getInitPpointsIntelligence() {
		return initPpointsIntelligence;
	}

	public void setInitPpointsIntelligence(int initPpointsIntelligence) {
		this.initPpointsIntelligence = initPpointsIntelligence;
	}

	public abstract int getInitPointsVie();

	public _Pj getCurrent_Pj() {
		return current_Pj;
	}

	public void setCurrent_Pj(_Pj current_Pj) {
		this.current_Pj = current_Pj;
	}

	public int getInitPointsXp() {
		return initPointsXp;
	}

	public void setInitPointsXp(int initPointsXp) {
		this.initPointsXp = initPointsXp;
	}

	public int getInitLevel() {
		return initLevel;
	}

	public void setInitLevel(int initLevel) {
		this.initLevel = initLevel;
	}
	
	@Override
	public void encaisserAttaque(int degats) {
		pv -= degats;
	}

	public void setInitPointsVie() {
		// TODO Auto-generated method stub

	}

}
