package fr.eni.demo.filmo.bo;

public class Personne {

	private String nom;
	private String prenom;
	private int personneId;

	public Personne() {

	}

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, int personneId) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.personneId = personneId;
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

	public int getPersonneId() {
		return personneId;
	}

	public void setPersonneId(int personneId) {
		this.personneId = personneId;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", personneId=" + personneId + "]";
	}

}
