package parisBanque.metier;
import parisBanque.beans.*;
import parisBanque.controle.*;
import parisBanque.affichage.*;

public class ClientManager {
	
	public static Client creerClient() {
		Client cli = new Client();
		cli.setIdClient(Checking.idClient());
		cli.setNom(Checking.nom());
		cli.setPrenom(Checking.prenom());
		cli.setEmail(Checking.email());
		
	}

}
