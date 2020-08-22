create table article (
id Integer not null auto_increment,
libelle VARCHAR(100) not null,
prix DOUBLE not null,
primary key (id)
);
insert into article(libelle, prix) values ('ecran', 50.00);
insert into article(libelle, prix) values ('souris', 15.00);
insert into article(libelle, prix) values ('clavier', 20.50);
insert into article(libelle, prix) values ('UC', 150.00);