package Personnages.PNJ;
import Personnages.PNJ._Pnj_Ami;

public class _Pnj_Ami_Coach extends _Pnj_Ami {
	
public _Pnj_Ami_Coach(String pseudoPerso, String nomPerso) {
	super(pseudoPerso,nomPerso);
}

@Override
public int getInitPointsAgilite() {

	return 696994654;
}

@Override
public int getInitPointsVie() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void setInitPointsVie(int nouveauscore) {
	
	
}

@Override
public boolean isEnVie() {
	if (getInitPointsVie()>0) {
			return true;
	}else
	return false;
	

}

@Override
public int getInitPpointsIntelligence() {
	// TODO Auto-generated method stub
	return 0;
}


}
