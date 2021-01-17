/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.dao;


import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

/**
 *
 * @author Juju Vilas
 */
@Log4j2 // Génère le 'logger' pour afficher les messages de trace
@DataJpaTest
public class ExpositionRepositoryTest {
    
    @Autowired
    private ExpositionRepository expositionDAO;

    @Test
    @Sql("test-data.sql") // On peut charger des donnnées spécifiques pour un test
    public void testCA() {
        log.info("On teste la méthode CA() de l'exposition 2");
        float CAattendu = 200;
        float CA =expositionDAO.chiffreAffairePour(2);
        log.info("Le CA de l'exposition 2 est de 200");
        assertEquals(CAattendu, CA, "Le CA doit être égal à 200");
    }
   
}
