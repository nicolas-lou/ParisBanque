package parisBanque.metier;
import parisBanque.beans.*;
import parisBanque.controle.*;
import parisBanque.affichage.*;


public class AdresseManager {

	public static Adresse creerAdresse() {
		Adresse ad = new Adresse();
		ad.setNumeroRue(checkAdrNum());
		ad.setRue(checkRue());
		ad.setVille(checkVille());
		ad.setZip(checkZip());
		return ad;
	}
}
