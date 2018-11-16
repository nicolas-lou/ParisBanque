package parisBanque.beans;

public class Adresse {
	String numeroRue;
	String rue;
	String ville;
	int zip;
	
	
	
	
	
	
	public Adresse() {
		super();
	}
	
	
	public String getNumeroRue() {
		return numeroRue;
	}
	public void setNumeroRue(String string) {
		this.numeroRue = string;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
	
}
