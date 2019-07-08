package Personnages;

public abstract class Personnages {

	public int initPointsForce;
	public int initPointsAgilite;
	public int initPpointsIntelligence;
	public int initPointsVie;

	public Personnages(String pseudoPerso, String nomPerso) {

	}
	public abstract boolean isEnVie();
	public abstract int getInitPointsForce();
	public abstract int getInitPpointsIntelligence();
	public abstract int getInitPointsAgilite();
	public abstract int getInitPointsVie();
	public abstract void setInitPointsVie(int nouvelleValeur);

}
