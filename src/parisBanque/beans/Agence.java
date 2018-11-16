package parisBanque.beans;

import java.util.ArrayList;

public class Agence {
	
	private String codeAgence;
	private String nomAgence;
	private Adresse adresseAgence;
	private ArrayList<Client> clients = new ArrayList<Client>();
	
	
	public Agence() {
		super();
	}
	
	public String getCodeAgence() {
		return codeAgence;
	}
	public void setCodeAgence(String codeAgence) {
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

	@Override
	public String toString() {
		return "Agence [codeAgence=" + codeAgence + ", nomAgence=" + nomAgence + ", adresseAgence=" + adresseAgence
				+ ", clients=" + clients + "]";
	}
	
	
	
	
}
