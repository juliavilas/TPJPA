/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.dao;

import galerie.entity.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Juju Vilas
 */
public interface ArtisteRepository extends JpaRepository<Exposition, Integer>{
    
}
