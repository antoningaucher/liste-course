package com.perso.ListeCourses.BLL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.perso.ListeCourses.BLL.ArticleManager;
import com.perso.ListeCourses.BO.Article;

@RunWith( SpringRunner.class )
@SpringBootTest
public class ArticleManagerTests {
	
	@Autowired
	private ArticleManager manager;

	@Test
	public void addArticleTest() {
		Article a1 = new Article("pâtes", 2);
		Article a2 = manager.addArticle(a1);
		assertEquals(a1.getNom(), a2.getNom());
		assertNotNull(a2.getIdArticle());
	}
	
	@Test
	public void deleteArticleTest() {
		Article a1 = new Article("pâtes", 2);
		Article a2 = new Article("chocolat", 2);
		manager.addArticle(a1);
		manager.addArticle(a2);
		assertEquals(manager.findAll().size(), 2);
		manager.deleteArticleById(a2.getIdArticle());
		assertEquals(manager.findAll().size(), 1);
	}
}
