package dev.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import dev.entite.Article;
import dev.repository.ArticleRepository;

@Service
public class ArticleService {
	
	private ArticleRepository articleRep;

	public ArticleService(ArticleRepository articleRep) {
		super();
		this.articleRep = articleRep;
	}
	
	public List<Article> getAllArticles() {
		return articleRep.findAll();
	}
	
	@Transactional
	public Article createArticle(String libelle, double prix) {
		
		Article article = new Article(libelle, prix);
		Article articleCreer = this.articleRep.save(article);
		
		return articleCreer;
	}
	

}
