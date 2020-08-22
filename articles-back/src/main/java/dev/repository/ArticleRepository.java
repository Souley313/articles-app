package dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entite.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
