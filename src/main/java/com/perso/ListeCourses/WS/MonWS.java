package com.perso.ListeCourses.WS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.perso.ListeCourses.BLL.ArticleManager;
import com.perso.ListeCourses.BO.Article;

@RestController
public class MonWS {
	
	@Autowired
	ArticleManager manager;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/liste")
	public List<Article> liste() {
		return manager.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/liste/{articleId}")
	public List<Article> deleteArticle(@PathVariable("articleId") int articleId) {
		manager.deleteArticleById(articleId);
		return manager.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/liste")
	public List<Article> addArticle(@RequestBody ArticleForm articleForm) {
		Article article = new Article(articleForm.getNom(), articleForm.getQuantite());
		manager.addArticle(article);
		return manager.findAll();
	}

}
