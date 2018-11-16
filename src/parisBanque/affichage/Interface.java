package parisBanque.affichage;
import parisBanque.metier.*;
import parisBanque.beans.*;
import parisBanque.controle.*;
import java.util.*;

public class Interface {
   
   
   public static void main(String[] args) {
	   
	  
	   afficherInterface();
	   
	   
	   
	   
   }
   
   public static void affichMenu() {
		System.out.println();
		System.out.println("Gestion ParisBanque: ");
		System.out.println("--------------------- ");
		System.out.println("Selectionnez une option de menu");
		System.out.println();
		System.out.println("1 ~ Créer une agence");
		System.out.println("2 ~ Créer un client");
		System.out.println("3 ~ Créer un compte bancaire");		
		System.out.println("4 ~ Recherche de compte");
		System.out.println("5 ~ Recherche de client");
		System.out.println("6 ~ Afficher la liste des comptes d’un client");
		System.out.println("8 ~ Quitter");

	}
   
   public static void afficherInterface() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		 Siege Parisbanque = new Siege();

		String choix="";
		do {
			affichMenu();
			choix  = in.nextLine();
			switch (choix)
			{			
			case "1":{
				AgenceManager.ajouterAgence(Parisbanque);}break;

			case "2":{
				ClientManager.ajouterClient(Parisbanque);}break;

			case "3":{
				CompteManager.ajouterCompte(Parisbanque);}break;

			case "4":{ 
				AgenceManager.rechercherCompte(Checking.idCompte(), Parisbanque);			

			}break;

			case "5":{
				AgenceManager.rechercherClient(Checking.nom(),Checking.idCompte(), Checking.idClient(), Parisbanque);
			}break;

			case "6":{ 
				AgenceManager.afficherComptesClient(Parisbanque);;
			}break;

			case "8":{
				System.out.println("A bientôt!");}break;

			default:
			{
				System.out.println("Votre choix n'est pas valide!");
			}
			}  
		} while (choix.equals("8")==false);
	}

   
   
   
   
   
   
   
	
}
