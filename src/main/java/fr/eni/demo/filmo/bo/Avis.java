package fr.eni.demo.filmo.bo;

import java.sql.Date;

public class Avis {
	private int avisId;
	private String auteur;
	private int note;
	private Date date;
	private String commentaire;

	public Avis() {

	}

	public Avis(String auteur, int note, Date date, String commentaire) {
		super();
		this.auteur = auteur;
		this.note = note;
		this.date = date;
		this.commentaire = commentaire;
	}

	public Avis(int avisId, String auteur, int note, Date date, String commentaire) {
		super();
		this.avisId = avisId;
		this.auteur = auteur;
		this.note = note;
		this.date = date;
		this.commentaire = commentaire;
	}

	public int getAvisId() {
		return avisId;
	}

	public void setAvisId(int avisId) {
		this.avisId = avisId;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	@Override
	public String toString() {
		return "Avis [avisId=" + avisId + ", auteur=" + auteur + ", note=" + note + ", date=" + date + ", commentaire="
				+ commentaire + "]";
	}

}
