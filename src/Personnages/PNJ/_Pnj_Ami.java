package Personnages.PNJ;

public abstract class _Pnj_Ami extends _Pnj{



	public _Pnj_Ami(String pseudoPerso, String nomPerso) {
		super(pseudoPerso, nomPerso);
	
	}
	@Override
	public boolean isEnVie() {
		return false;
		
	}

}
