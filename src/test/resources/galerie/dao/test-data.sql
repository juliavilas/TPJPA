-- Initialisation spécifiques pour un jeu de test
INSERT INTO Galerie(id, nom, adresse) VALUES 
(1, 'Saatchi', 'Kings Road, Londres');

INSERT INTO Exposition(id, debut, intitule, duree) VALUES
(1,null,'Les expressionistes français',null),
(2,'2010-12-12','Art Brut',30);

INSERT INTO Tableau(id, titre, support, largeur, hauteur) VALUES
(1,'New York Streets','huile sur toile',null,null);


INSERT INTO Personne(id, nom, adresse) VALUES
(1,'Basquiat','Cimetiere Pere Lachaise'),
(2,'Remi Bastide','ISIS Castres');

INSERT INTO Artiste(id, biographie) VALUES
(1,'Peintre NewYorkais');

INSERT INTO Transaction(id, venduLe, prixVente) VALUES
(1,'2012-01-01',200);