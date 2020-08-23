export class Article{
    id: number;
    libelle: string;
    prix: number;

    constructor(id: number, libelle: string, prix: number) {
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
      }
}

