package parisBanque.metier;
import parisBanque.beans.*;
import parisBanque.controle.*;
import java.util.Scanner;
import parisBanque.affichage.*;

public class AgenceManager {
	
	public static Agence creerAgence() {
		Agence adrAg = new Agence();
		String validation ="O";
		do {
			adrAg.setAdresseAgence( AdresseManager.creerAdresse() );
			adrAg.setCodeAgence(Checking.codeAgence());
			adrAg.setNomAgence(Checking.nom());	
			System.out.println(adrAg.toString());
			System.out.println("Valider les informations ? O/N");
			Scanner in =  new Scanner(System.in);
			validation = in.nextLine();			
		}while(validation.equalsIgnoreCase("N"));	
		return adrAg;	
	}
	
	public static void ajouterAgence(Siege ParisBanque) {
		ParisBanque.getAgences().add(ParisBanque.getAgences().size(), creerAgence());
		System.out.println("Agence ajoutée");
		
	}
	
	public static void rechercherClient(String nom, String idCompte, String idClient, Siege Parisbanque) {
		System.out.println("De quelle agence dépend le client ?");
		Agence ag = Checking.trouverAgence(Checking.codeAgence(),Parisbanque );
		Client cli = Checking.trouverClient(idClient, ag);
		System.out.println("coucou");
		System.out.println(cli.toString());			
	}
	
	public static void rechercherCompte(String idCompte, Siege Parisbanque) {
		System.out.println("De quelle agence dépend le compte ?");
		Agence ag = Checking.trouverAgence(Checking.codeAgence(),Parisbanque );
		Compte compte = Checking.trouverCompte(idCompte, ag);
		System.out.println(compte.toString());
	}
	
	public static void afficherComptesClient(Siege Parisbanque) {
		System.out.println("De quelle agence dépend le compte ?");
		Agence ag = Checking.trouverAgence(Checking.codeAgence(),Parisbanque );
		if(ag!=null) {
			System.out.println("Quel est le client ?");
			Client cli = Checking.trouverClient(Checking.idClient(), ag);
			if(cli!=null) {
				System.out.println(cli.getListeComptes().toString());
			}else {
				System.out.println("Retour au menu");
			}		
		}else {
			System.out.println("Retour au menu");
		}
		
		
		

		
	}
	
	
	
	
	
	
	

}
