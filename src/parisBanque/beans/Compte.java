package parisBanque.beans;

public class Compte {
	String idCompte;
	String codeAgence;
	Client user ;
	double solde;
	boolean overdraft;
	
	public Compte() {
		super();
	}
	public String getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(String idCompte) {
		this.idCompte = idCompte;
	}
	public String getCodeAgence() {
		return codeAgence;
	}
	public void setCodeAgence(String codeAgence) {
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
		result = prime * result + ((idCompte == null) ? 0 : idCompte.hashCode());
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
		if (idCompte == null) {
			if (other.idCompte != null)
				return false;
		} else if (!idCompte.equals(other.idCompte))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", codeAgence=" + codeAgence + ", solde=" + solde
				+ ", overdraft=" + overdraft + "]";
	}
	
	
	
	
}
