package com.perso.ListeCourses.BLL;

import java.util.List;

import com.perso.ListeCourses.BO.Article;

public interface ArticleManager {
	
	public Article addArticle(Article article);
	
	public void deleteArticleById(int id);
	
	public List<Article> findAll();

}
