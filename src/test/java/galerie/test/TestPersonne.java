/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.test;

import galerie.entity.Personne;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Juju Vilas
 */
public class TestPersonne {
    
    private Personne p1;
    
    @BeforeEach
    public void setUp() {
        p1 = new Personne();
    }
    
    @Test
    public void testBudgetArt() {
    }
}