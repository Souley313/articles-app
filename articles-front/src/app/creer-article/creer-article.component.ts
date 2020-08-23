import { Component, OnInit } from '@angular/core';
import { ArticleDto } from '../model/ArticleDto';
import { Article } from '../model/Article';
import { NgForm } from '@angular/forms';
import { DataService } from '../services/data.service';

@Component({
  selector: 'app-creer-article',
  templateUrl: './creer-article.component.html',
  styleUrls: ['./creer-article.component.css']
})
export class CreerArticleComponent implements OnInit {

   articles: Article[];
   newArticle = new ArticleDto();

   isSubmitted = false;

  constructor(private dataService: DataService) { }

  creerArticle(libelle: HTMLInputElement, prix: HTMLInputElement): void {
    this.dataService.creerArticle(this.newArticle).subscribe(
      () => {
          console.log('Article enregisté !');
          this.isSubmitted = true;
         },
      (error) => {
        console.log('Article non enregisté !');
      }
      );
    }
  ngOnInit(): void {
  }

}
