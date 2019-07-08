package Personnages.PNJ;
import Utilitaires.InterfaceCombattants;

public class _Pnj_Monstre extends _Pnj implements InterfaceCombattants {

	protected int pv;

	public _Pnj_Monstre (String nomDuPj, String nomDuPnj){
		super(nomDuPj, nomDuPnj);
		this.initPointsForce=21;
		this.initPointsAgilite=21;
		this.initPointsVie=21;
		this.initPpointsIntelligence=21;
		}

	@Override
	public int getInitPointsForce() {
		return initPointsForce;
	}

	@Override
	public int getInitPointsAgilite() {
		return initPointsAgilite;
	}

	@Override
	public int getInitPointsVie() {
		return initPointsVie;
	}

	@Override
	public void setInitPointsVie(int pointsaretirer) {
		this.initPointsVie=initPointsVie-pointsaretirer;
		
	}
	@Override
	public boolean isEnVie() {
		if (getInitPointsVie()>0) {
				return true;
		}else
		return false;}

	@Override
	public int getInitPpointsIntelligence() {
		
		return this.initPpointsIntelligence;
	}
	@Override
	public void encaisserAttaque(int degats) {
		pv -= degats;
	}

}
