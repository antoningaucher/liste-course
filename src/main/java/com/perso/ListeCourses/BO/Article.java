package com.perso.ListeCourses.BO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Article {

	
	@Id
	@GeneratedValue
	private Integer idArticle;
	private String nom;
	private int quantite;
	private boolean achete;

	public Article() {
		this.achete = false;
	}

	public Article(String nom, int quantite) {
		this.nom = nom;
		this.quantite = quantite;
		this.achete = false;
	}

	public Integer getIdArticle() {
		return idArticle;
	}

	public String getNom() {
		return nom;
	}

	public int getQuantite() {
		return quantite;
	}

	public boolean isAchete() {
		return achete;
	}

	public void setAchete(boolean achete) {
		this.achete = achete;
	}

	public void setIdArticle(Integer idArticle) {
		this.idArticle = idArticle;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Article [idArticle=" + idArticle + ", nom=" + nom + ", quantite=" + quantite + ", achete=" + achete
				+ "]";
	}
}
