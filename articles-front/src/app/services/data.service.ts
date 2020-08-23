import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Article } from '../model/Article';
import { Observable, from, interval, Subject } from 'rxjs';
import { ArticleDto } from '../model/ArticleDto';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  // Création du Subject
  subjectArticleSelectionne = new Subject<Article>();

  articles: Article[];

  constructor(private http: HttpClient){ }

  listerArticles(): Observable<Article[]> {
    return this.http.get<Article[]>('http://localhost:9000/articles');
  }

  creerArticle(article: ArticleDto): Observable<ArticleDto> {
    return this.http.post<ArticleDto>('http://localhost:9000/articles', article ); }

}
