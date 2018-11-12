package parisBanque.controle;
import parisBanque.metier.*;
import parisBanque.beans.*;
import parisBanque.affichage.*;
import java.util.*;

public class Checking {
	
	// début checking AdesseManager
	
	public static int adrNum() {
		Scanner in =  new Scanner(System.in);
		String numString= "";
		do {
			System.out.println("Numéro de rue: ");
			numString = in.nextLine();
		}while( numString.matches("([1-9]?[0-9]?[0-9])") );
		int numInt = Integer.parseInt(numString);
		return numInt;
	}
	
	public static String rue() {
		Scanner in =  new Scanner(System.in);
		String rue= "";
		do {
			System.out.println("Nom de rue: ");
			rue = in.nextLine();
		}while( rue.matches("[a-zA-Z]+") );		
		return rue;
	}
	
	public static String ville() {
		Scanner in =  new Scanner(System.in);
		String ville= "";
		do {
			System.out.println("Nom de rue: ");
			ville = in.nextLine();
		}while( ville.matches("[a-zA-Z]+") );		
		return ville;
	}
	public static int zip() {
		Scanner in =  new Scanner(System.in);
		String zip= "";
		do {
			System.out.println("Code postal: ");
			zip = in.nextLine();
		}while( zip.matches("[1-9]{5}") ) ;
		int zipInt = Integer.parseInt(zip);
		return zipInt;
	}
	
	// fin checking AdresseManager
	

}
