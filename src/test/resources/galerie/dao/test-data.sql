-- Initialisation spécifiques pour un jeu de test
INSERT INTO Galerie(id, nom, adresse) VALUES 
(1, 'Saatchi', 'Kings Road, Londres');

INSERT INTO Exposition(id, debut, intitule, duree) VALUES
(1,null,'Les expressionistes français',null),
(2,'2010-12-12','Art Brut',30);

INSERT INTO Tableau(id, titre, support, largeur, hauteur) VALUES
(1,'New York Streets','huile sur toile',null,null);

INSERT INTO Personne(DTYPE,id, nom, adresse,biographie) VALUES
('Artiste',1,'Basquiat','Cimetiere Pere Lachaise','Peintre Newyorkais'),
('Personne',2,'Remi Bastide','ISIS Castres',null);

INSERT INTO Transaction(id, vendu_le, prix_vente) VALUES
(1,'2012-01-01',200);