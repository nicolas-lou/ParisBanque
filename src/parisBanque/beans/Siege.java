package parisBanque.beans;

import java.util.ArrayList;

public class Siege {
	
	public static ArrayList<Agence> agences = new ArrayList<Agence>();
	
	
	
	public Siege() {
		super();
		agences = new ArrayList<Agence>();
	}

	public ArrayList<Agence> getAgences() {
		return agences;
	}

	public void setAgences(ArrayList<Agence> agences) {
		this.agences = agences;
	}
	
	

}
