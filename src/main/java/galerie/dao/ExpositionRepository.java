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
            + "INNER JOIN Transaction ON Transaction.lieu_de_vente_id = lieu_de_vente_id "
            + "WHERE Exposition.id=:id ",
            nativeQuery = true
            )
    float chiffreAffairePour(Integer id);

}
