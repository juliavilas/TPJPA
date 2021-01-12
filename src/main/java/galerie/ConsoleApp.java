/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

import galerie.entity.*;
import galerie.dao.*;
/**
 *
 * @author Juju Vilas
 */
@Component
@Log4j2 // Génère le 'logger' pour afficher les messages de trace
public class ConsoleApp implements CommandLineRunner{

    @Autowired
    private GalerieRepository galerieDAO;

    @Autowired
    private ExpositionRepository expositionDAO;

    @Autowired
    private PersonneRepository PersonneDAO;
    @Override
    public void run(String... args) throws Exception {
        
        log.info("Insertion d'une galerie");
        //Galerie gal1 = new Galerie(1, "Saatchi", "Kings Road Londres");
        //galerieDAO.save(gal1);

    }
    
    
}
