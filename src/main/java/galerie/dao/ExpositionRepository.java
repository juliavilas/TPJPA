/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.dao;

import galerie.entity.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Juju Vilas
 */
public interface ExpositionRepository extends JpaRepository<Exposition, Integer> {

    /**
     * Calculer le chiffre d'affaires pour une exposition
     *
     * @param id la clé primaire de l'exposition
     * @return le chiffre d'affaires de cette exposition
     */
    //SQL
    @Query(
            value = 
            "SELECT SUM(prix_vente) AS CA "
            + "FROM Exposition "
            + "INNER JOIN Transaction ON Transaction_lieu_de_vente = lieu_de_vente "
            + "WHERE Exposition_id=:id ",
            nativeQuery = true
            )
    float chiffreAffairePour(Integer id);

    //JPQL
//    @Query("SELECT p.nom as nom, SUM(li.quantite) AS unites "
//		+ "FROM Categorie c "
//		+ "JOIN c.produits p "
//		+ "JOIN p.lignes li "
//		+ "WHERE c.code = :codeCategorie "
//		+ "GROUP BY p.nom ")
//    float chiffreAffairePour(Integer id);
    
}
