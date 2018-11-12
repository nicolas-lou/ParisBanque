package parisBanque.metier;
import parisBanque.beans.*;
import parisBanque.controle.*;
import parisBanque.affichage.*;

public class AgenceManager {
	
	public static Agence creerAgence() {
		Agence adrAg = new Agence();
		adrAg.setAdresseAgence( AdresseManager.creerAdresse() );
		adrAg.setCodeAgence(checkCodeAgence());
		adrAg.setNomAgence(checkNom());	
		return adrAg;
		
		
	}
	
	

}
