package com.perso.ListeCourses.DAL;

import org.springframework.data.repository.CrudRepository;

import com.perso.ListeCourses.BO.Article;

public interface ArticleDAO extends CrudRepository<Article, Integer>{

}
