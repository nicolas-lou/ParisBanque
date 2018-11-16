package parisBanque.metier;
import parisBanque.beans.*;
import parisBanque.controle.*;
import parisBanque.affichage.*;

public class CompteManager {
	
	public static Compte creerCompte(Client cli) {
		Compte account = new Compte();
		account.setCodeAgence(Checking.codeAgence());
		account.setIdCompte(Checking.idCompte());
		account.setOverdraft(Checking.decouvert());
		account.setSolde(Checking.solde());
		account.setUser(cli);		
		return account;
	}
	
	public static void ajouterCompte(Siege Parisbanque) {
		Agence a = Checking.trouverAgence(Checking.codeAgence(), Parisbanque);
		Client cli = Checking.trouverClient(Checking.idClient(), a);
		if(Checking.verifMaxCompte(cli)) {
			cli.getListeComptes().add(creerCompte(cli));
			System.out.println("Compte ajouté au client " + cli.getIdClient());
		}else {
			System.out.println("Ce client ne peut avoir plus de 3 comptes bancaises");
		}	
	}
	
	
	
	
	}


