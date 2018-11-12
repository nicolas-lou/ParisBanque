package parisBanque.metier;
import parisBanque.beans.*;
import parisBanque.controle.*;
import parisBanque.affichage.*;

public class ClientManager {
	
	public static Client creerClient() {
		Client cli = new Client();
		cli.setIdClient(checkIdClient());
		cli.setNom(checkNom());
		cli.setPrenom(checkPrenom());
		cli.setEmail(checkEmail());
		
	}

}
