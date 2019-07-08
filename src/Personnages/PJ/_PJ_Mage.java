package Personnages.PJ;

public class _PJ_Mage extends _Pj {

	public _PJ_Mage(String pseudoPerso, String nomPerso) {
		super (pseudoPerso,nomPerso);
		this.initPointsForce=21;
		this.initPointsAgilite=21;
		this.initPointsVie=21;
		this.initPpointsIntelligence=21;
		this.initPointsXp=20;
		this.initLevel=1;
	}
		public boolean isEnvie() {
			// TODO Auto-generated method stub
			return false;
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
