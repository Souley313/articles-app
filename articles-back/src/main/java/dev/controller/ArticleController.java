package dev.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.dto.ArticleDto;
import dev.entite.Article;
import dev.service.ArticleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("articles")
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@GetMapping
	public ResponseEntity<List<Article>> getArticles(){
		return ResponseEntity.status(HttpStatus.OK)
				.body(articleService.getAllArticles());
	}
	
	@PostMapping
	public ResponseEntity<?> creerArticle(@RequestBody @Valid ArticleDto a, BindingResult result) {
			
			if(result.hasErrors()) {
				throw new RuntimeException("Données non valides pour la création d'un client.");
			}
			
			Article article = articleService.createArticle(a.getLibelle(), a.getPrix());
			
			ArticleDto articleDto = new ArticleDto();
			articleDto.setLibelle(article.getLibelle());
			articleDto.setPrix(article.getPrix());
			
			
			return ResponseEntity.ok(article);
	}
	

}
