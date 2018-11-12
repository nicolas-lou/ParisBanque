package parisBanque.controle;
import parisBanque.metier.*;
import parisBanque.beans.*;
import parisBanque.affichage.*;
import java.util.*;

public class Checking {
	
	public static int checkAdrNum() {
		Scanner in =  new Scanner(System.in);
		String numString= "";
		do {
			System.out.println("Numéro de rue: ");
			numString = in.nextLine();
		}while( numString.matches("([1-9]?[0-9]?[0-9])") );
		int numInt = Integer.parseInt(numString);
		return numInt;
	}
	

}
