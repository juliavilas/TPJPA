-- Initialisation spécifiques pour un jeu de test
INSERT INTO Galerie(id, nom, adresse) VALUES 
(1, 'Saatchi', 'Kings Road, Londres'),
(2,'Galerie 1','Grande Avenue, Paris');

INSERT INTO Exposition(id, debut, intitule, duree, organisateur_id) VALUES
(1,null,'Les expressionistes français',null,1),
(2,'2010-12-12','Art Brut',30,2);

/*Problème de clé étrangère avec auteur_id qui référence une personne et non un artiste*/
INSERT INTO Tableau(id, titre, support, largeur, hauteur, auteur_id, vendu_id) VALUES
(1,'New York Streets','huile sur toile',null,null,1,1);

/*Personne est un DTYPE alors que Personne n'hérite pas de Personne ?*/
INSERT INTO Personne(DTYPE,id, nom, adresse, biographie) VALUES
('Artiste',1,'Basquiat','Cimetiere Pere Lachaise','Peintre Newyorkais'),
('Personne',2,'Remi Bastide','ISIS Castres',null);

INSERT INTO Transaction(id, vendu_le, prix_vente, lieu_vente_id, oeuvre_id ,client_id) VALUES
(1,'2012-01-01',200,1,1,2);
