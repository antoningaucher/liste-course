package com.perso.ListeCourses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.perso.ListeCourses.BLL.ArticleManager;
import com.perso.ListeCourses.BO.Article;

@SpringBootApplication
public class ListeCoursesApplication implements CommandLineRunner{
	
	@Autowired
	private ArticleManager articleManager;
	
	public static void main(String[] args) {
		SpringApplication.run(ListeCoursesApplication.class, args);
	}
	
	public void run(String... args) throws Exception{
		Article article3 = new Article("Chocapics", 1);
		Article article1 = new Article("Penne", 1);
		Article article2 = new Article("Tomates", 6);
		Article article4 = new Article("Beurre", 1);
		Article article5 = new Article("Aubergines", 4);
		Article article6 = new Article("Yaourts", 8);
		
		articleManager.addArticle(article6);
		articleManager.addArticle(article5);
		articleManager.addArticle(article4);
		articleManager.addArticle(article3);
		articleManager.addArticle(article2);
		articleManager.addArticle(article1);
	}

}
