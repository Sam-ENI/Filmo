package fr.eni.demo.filmo.bo;

public class Utilisateur {
	String login;
	String nom;
	String prenom;
	String motDePAsse;
	String role;

	public Utilisateur() {

	}

	public Utilisateur(String login, String nom, String prenom, String motDePAsse, String role) {
		super();
		this.login = login;
		this.nom = nom;
		this.prenom = prenom;
		this.motDePAsse = motDePAsse;
		this.role = role;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMotDePAsse() {
		return motDePAsse;
	}

	public void setMotDePAsse(String motDePAsse) {
		this.motDePAsse = motDePAsse;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Utilisateur [login=" + login + ", nom=" + nom + ", prenom=" + prenom + ", motDePAsse=" + motDePAsse
				+ ", role=" + role + "]";
	}

}
