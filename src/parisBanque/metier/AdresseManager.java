package parisBanque.metier;
import parisBanque.beans.*;
import parisBanque.controle.*;
import parisBanque.affichage.*;


public class AdresseManager {

	public static Adresse creerAdresse() {
		Adresse ad = new Adresse();
		ad.setNumeroRue(Checking.adrNum());
		ad.setRue(Checking.rue());
		ad.setVille(Checking.ville());
		ad.setZip(Checking.zip());
		return ad;
	}
}
