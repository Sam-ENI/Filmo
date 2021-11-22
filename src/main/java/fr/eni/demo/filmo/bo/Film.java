package fr.eni.demo.filmo.bo;

import java.util.ArrayList;

public class Film {
	private static int compteurId = 0;
	private int filmId;
	private String titre;
	private int anneeDeSortie;
	private int duree;
	private ArrayList<Personne> lstActeurs;
	private Personne realisateur;
	private Genre genre;
	private ArrayList<Avis> lstAvis;

	public Film() {
		this.filmId = compteurId;
		compteurId += 1;
	}

	public Film(String titre, int anneeDeSortie, int duree, Personne realisateur, Genre genre) {
		super();
		this.filmId = compteurId;
		compteurId += 1;
		this.titre = titre;
		this.anneeDeSortie = anneeDeSortie;
		this.duree = duree;
		this.realisateur = realisateur;
		this.genre = genre;
	}

	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getAnneeDeSortie() {
		return anneeDeSortie;
	}

	public void setAnneeDeSortie(int anneeDeSortie) {
		this.anneeDeSortie = anneeDeSortie;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public ArrayList<Personne> getLstActeurs() {
		return lstActeurs;
	}

	public void setLstActeurs(ArrayList<Personne> lstActeurs) {
		this.lstActeurs = lstActeurs;
	}

	public Personne getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Personne realisateur) {
		this.realisateur = realisateur;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public ArrayList<Avis> getLstAvis() {
		return lstAvis;
	}

	public void setLstAvis(ArrayList<Avis> lstAvis) {
		this.lstAvis = lstAvis;
	}

	public static int getCompteurId() {
		return compteurId;
	}

	public static void setCompteurId(int compteurId) {
		Film.compteurId = compteurId;
	}

	@Override
	public String toString() {
		return "Film [filmId=" + filmId + ", titre=" + titre + ", anneeDeSortie=" + anneeDeSortie + ", duree=" + duree
				+ ", lstActeurs=" + lstActeurs + ", realisateur=" + realisateur + ", genre=" + genre + ", lstAvis="
				+ lstAvis + "]";
	}

}
