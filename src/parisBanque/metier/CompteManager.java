package parisBanque.metier;
import parisBanque.beans.*;
import parisBanque.controle.*;
import parisBanque.affichage.*;

public class CompteManager {
	
	public static Compte creerCompte() {
		Compte account = new Compte();
		account.setCodeAgence(Checking.codeAgence());
		account.setIdCompte(Checking.idCompte());
		account.setOverdraft(Checking.decouvert());
		account.setSolde(Checking.solde());
		account.setUser(Checking.user(new Agence().getClients()));		
		return account;
	}
	
	}


