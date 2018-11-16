package parisBanque.metier;
import parisBanque.beans.*;
import parisBanque.controle.*;
import parisBanque.affichage.*;
import java.util.Scanner;


public class ClientManager {
	
	public static Client creerClient() {
		Client cli = new Client();
		cli.setIdClient(Checking.idClient());
		cli.setNom(Checking.nom());
		cli.setPrenom(Checking.prenom());
		cli.setEmail(Checking.email());		
		return cli;	
	}
	
	public static void ajouterClient(Siege Parisbanque) {
		Agence choixAgence = Checking.trouverAgence(Checking.codeAgence(),Parisbanque);		
		for(Agence a : Parisbanque.getAgences()) {
			if(a.equals(choixAgence)) {
				a.getClients().add(a.getClients().size(), creerClient());
				
				break;
			}
		}	
	}
	
		

}
