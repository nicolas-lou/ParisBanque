package parisBanque.controle;
import parisBanque.metier.*;
import parisBanque.beans.*;
import parisBanque.affichage.*;
import java.util.*;



public class Checking {
	
	// début checking AdesseManager
	
	public static String adrNum() {
		Scanner in =  new Scanner(System.in);
		String numString= "";
		do {
			System.out.println("Numéro de rue: ");
			numString = in.nextLine();
		}while( !numString.matches("([1-9]?[0-9]?[0-9])") );		
		return numString;
	}
	
	public static String rue() {
		Scanner in =  new Scanner(System.in);
		String rue= "";
		do {
			System.out.println("Nom de rue: ");
			rue = in.nextLine();
		}while( !rue.matches("[a-zA-Z]+") );		
		return rue;
	}
	
	public static String ville() {
		Scanner in =  new Scanner(System.in);
		String ville= "";
		do {
			System.out.println("Nom de rue: ");
			ville = in.nextLine();
		}while( !ville.matches("[a-zA-Z]+") );		
		return ville;
	}
	public static int zip() {
		Scanner in =  new Scanner(System.in);
		String zip= "";
		do {
			System.out.println("Code postal: ");
			zip = in.nextLine();
		}while( !zip.matches("[0-9]{5}") ) ;
		int zipInt = Integer.parseInt(zip);
		return zipInt;
	}
	
	// fin checking AdresseManager
	// début checking AgenceManager
	
	public static String codeAgence() {
		Scanner keyb =  new Scanner(System.in);
		String code= "";
		do {
			System.out.println("Code Agence: ");
			code = keyb.nextLine();
		}while( !code.matches("([0-9][0-9][0-9])") );		
		return code;	
	}
	
	public static String nom() {
		Scanner in =  new Scanner(System.in);
		String nom= "";
		do {
			System.out.println("Nom : ");
			nom = in.nextLine();
		}while( !nom.matches("[a-zA-Z]+") );		
		return nom;
	}
	
	public static Agence trouverAgence( String agenceCherchee, Siege Parisbanque) {
		Agence resultat = null;				
		for(Agence a : Parisbanque.getAgences()) {
			if(a.getCodeAgence().equalsIgnoreCase(agenceCherchee)) {
				return a;				
				}	
			}
		return resultat;	
	}
	
	// fin checking AgenceManager
	// début checking ClientManager
	
	public static String idClient() {
		Scanner in =  new Scanner(System.in);
		String idClient= "";
		do {
			System.out.println("ID client: ");
			idClient = in.nextLine();
		}while( !idClient.matches("([A-Z]{2}[0-9]{6})") );		
		return idClient;		
	}
	
	public static String prenom() {
		Scanner in =  new Scanner(System.in);
		String prenom= "";
		do {
			System.out.println("Prenom: ");
			prenom = in.nextLine();
		}while( !prenom.matches("[a-zA-Z]+") );		
		return prenom;
	}
	
	public static String email() {
		Scanner in =  new Scanner(System.in);
		String email= "";
		do {
			System.out.println("E-mail: ");
			email = in.nextLine();
		}while( !email.matches("[a-z]+") );		
		return email;
	}
	
	public static Client trouverClient( String clientCherche, Agence agence) {
		Client resultat = null;				
		for(Client a : agence.getClients()) {
			if(a.getIdClient().equalsIgnoreCase(clientCherche)) {
				resultat = a;				
				}	
			}
		return resultat;	
	}
	
	public static boolean verifMaxCompte (Client cli) {
		boolean reponse = false;
		if(cli.getListeComptes().size()<3) {
			reponse = true;
		}
		
		return reponse;
	}
	
	// fin checking ClientManager
	// début checking CompteManager
	
	public static String idCompte() {
		Scanner in =  new Scanner(System.in);
		String idCompte= "";
		do {
			System.out.println("ID du compte: ");
			idCompte = in.nextLine();
		}while( !idCompte.matches("[0-9]{11}") );		
		return idCompte;
	}
	
	public static boolean decouvert(){
		Scanner in =  new Scanner(System.in);
		String reponse= "";
		boolean decouvert = false;
		do {
			System.out.println("Ligne de credit ? (O/N): ");
			reponse = in.nextLine();
		}while( !reponse.matches("O|N") );
		if(reponse.equalsIgnoreCase("O")) {
			decouvert = true;
		}
		return decouvert;
	}
	
	public static double solde() {
		Scanner in =  new Scanner(System.in);
		String solde= "";
		do {
			System.out.println("Solde du compte ?: ");
			solde = in.nextLine();
		}while( !solde.matches("([0-9]+)\\.{0,1}[0-9]{0,3}") );
		int soldeDouble = Integer.parseInt(solde);
		return soldeDouble;	
	}
	
	public static String user(String idAgence) {
		ArrayList<Client> agence =null;
		
		for(Agence ag : Siege.agences ) {
			if(ag.getCodeAgence() == idAgence) {
				agence = ag.getClients();
				break;
			}	
		}		
		String id;
		Scanner in =  new Scanner(System.in);
		do {
			System.out.println("Entrez le numero ID du client ou prospect: ");		
			id = in.nextLine();
		}while( !id.matches("([A-Z]{2}[0-9]{6}") );
		for(Client a : agence) {
			if(a.getIdClient().equalsIgnoreCase(id)) {
				id = a.getIdClient();
				break;
			}
		}		
		return id;	
	}
	
	public static Compte trouverCompte (String idCompte, Agence ag) {
		Compte resultat = null;
		for(Client a : ag.getClients()) {
			for(Compte c : a.getListeComptes()) {
				if(c.getIdCompte().equalsIgnoreCase(idCompte)) {
					resultat = c;
					break;
				}
			}
		}
		return resultat;
		}
		
		
		
	}
	
	// fin checking compte
		
		



