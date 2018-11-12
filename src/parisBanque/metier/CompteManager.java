package parisBanque.metier;
import parisBanque.beans.*;
import parisBanque.controle.*;
import parisBanque.affichage.*;

public class CompteManager {
	
	public static Compte creerCompte() {
		Compte account = new Compte();
		account.setCodeAgence(checkCodeAgence());
		account.setIdCompte(checkIdCompte());
		account.setOverdraft(checkDecouvert());
		account.setSolde(checkSolde());
		account.setUser(checkUser());		
		return account;
	}
	
	}


