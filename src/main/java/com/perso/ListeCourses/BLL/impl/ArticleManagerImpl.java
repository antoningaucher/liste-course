package com.perso.ListeCourses.BLL.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perso.ListeCourses.BLL.ArticleManager;
import com.perso.ListeCourses.BO.Article;
import com.perso.ListeCourses.DAL.ArticleDAO;

@Service
public class ArticleManagerImpl implements ArticleManager {
	
	@Autowired
	ArticleDAO dao;

	@Override
	public Article addArticle(Article article) {
		return(dao.save(article));
	}

	@Override
	public List<Article> findAll() {
		return (List<Article>) dao.findAll();
	}

	@Override
	public void deleteArticleById(int id) {
		dao.deleteById(id);
	}

}
