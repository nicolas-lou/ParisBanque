package parisBanque.beans;

public class Compte {
	int idCompte;
	int codeAgence;
	Client user ;
	double solde;
	boolean overdraft;
	
	public Compte() {
		super();
	}
	public int getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	public int getCodeAgence() {
		return codeAgence;
	}
	public void setCodeAgence(int codeAgence) {
		this.codeAgence = codeAgence;
	}
	public Client getUser() {
		return user;
	}
	public void setUser(Client user) {
		this.user = user;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public boolean isOverdraft() {
		return overdraft;
	}
	public void setOverdraft(boolean overdraft) {
		this.overdraft = overdraft;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCompte;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compte other = (Compte) obj;
		if (idCompte != other.idCompte)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", codeAgence=" + codeAgence + "]";
	}
	
	
	
}
