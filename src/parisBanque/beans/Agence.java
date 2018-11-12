package parisBanque.beans;

import java.util.ArrayList;

public class Agence {
	
	private int codeAgence;
	private String nomAgence;
	private Adresse adresseAgence;
	private ArrayList<Client> clients = new ArrayList<Client>();
	
	
	
	
	
	public Agence() {
		super();
	}
	
	public int getCodeAgence() {
		return codeAgence;
	}
	public void setCodeAgence(int codeAgence) {
		this.codeAgence = codeAgence;
	}
	public String getNomAgence() {
		return nomAgence;
	}
	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}
	public Adresse getAdresseAgence() {
		return adresseAgence;
	}
	public void setAdresseAgence(Adresse adresseAgence) {
		this.adresseAgence = adresseAgence;
	}
	public ArrayList<Client> getClients() {
		return clients;
	}
	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	
	
	
	
}
