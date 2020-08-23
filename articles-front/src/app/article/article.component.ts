import { Component, OnInit } from '@angular/core';
import { DataService } from '../services/data.service';
import { Article } from '../model/Article';

@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.css']
})
export class ArticleComponent implements OnInit {

   articles: Article[];

  constructor(private dataService: DataService) {}

  ngOnInit(): void {
     this.chargerArticle();
    }

  chargerArticle(): any {
      return this.dataService.listerArticles()
         .subscribe(
                (data: Article[]) => {  this.articles = data; },
                (error) =>  {}
          )
    }

}
