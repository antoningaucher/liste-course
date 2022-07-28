package com.perso.ListeCourses.WS;

public class ArticleForm {
	
	private String nom;
	private Integer quantite;
	
	public ArticleForm() {
		// TODO Auto-generated constructor stub
	}

	public ArticleForm(String nom, Integer quantite) {
		this.nom = nom;
		this.quantite = quantite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	
}
