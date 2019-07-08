package Utilitaires;

import Personnages.Personnages;

public interface InterfaceCombattants {

	public String pseudoPerso = null;
	public String nomPerso = null;
	public int getInitPointsForce();
	
	public default boolean isEnvie(Personnages nomPersoCourant) {
		return true;
	}
	public int getInitPpointsIntelligence();
	public int getInitPointsVie();
	public int getInitPointsAgilite();
	public void encaisserAttaque(int degats);
}
