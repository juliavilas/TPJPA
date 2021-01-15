/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.test;


import galerie.entity.Galerie;
import galerie.entity.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 *
 * @author Juju Vilas
 */
public class TestGalerie {
    
    private Galerie g1;
    private Galerie g2;
    private Transaction t1;
    private Transaction t2;
    
    
    @BeforeEach
    public void setUp() {
        // Changement au requiredArgsConstructor mais échec
        g1 = new Galerie(1,"Saatchi","King's Road, Londres");
        g2 = new Galerie(2,"Galerie 1","Grande Avenue, Paris");
        //t1 = new Transaction(1,);
    }
    
    @Test
    public void testCAannuel() {
    //asserEquals(,g1.CAannuel,"Le CA annuel doit être égal à ...");
    }
}
