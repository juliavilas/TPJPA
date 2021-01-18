/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package galerie.test;
//
//import galerie.entity.Artiste;
//import galerie.entity.Exposition;
//import galerie.entity.Galerie;
//import galerie.entity.Personne;
//import galerie.entity.Tableau;
//import galerie.entity.Transaction;
//import java.time.LocalDate;
//import java.util.LinkedList;
//import java.util.List;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// *
// * @author Juju Vilas
// */
//public class TestExposition {
//    
//    private Galerie g1, g2;
//    private Exposition e1;
//    private Transaction t1,t2;
//    private Tableau ta1, ta2;
//    private Artiste a1;
//    private Personne p1;
//    private List<Transaction> transactions;
//    
//    @BeforeEach
//    public void setUp() {
//        transactions= new LinkedList<>();
//        transactions.add(t1);
//        transactions.add(t2);
//        g1 = new Galerie("Saatchi","King's Road, Londres");
//        g2 = new Galerie("Galerie 1","Grande Avenue, Paris");
//        e1 = new Exposition(LocalDate.of(2019, 11, 22),"Les expressionistes français",30,g1);
//        a1= new Artiste("Peintre Newyorkais");
//        p1= new Personne("Bastide","ISIS",transactions);
//        ta1 = new Tableau("New York Streets","huile sur toile",6,2,a1,t1);
//        ta2 = new Tableau("Rues de Paris","huile sur toile",3,1,a1,t2);
//        t1 = new Transaction(LocalDate.of(2019, 12, 6),500,e1,ta1,p1);
//        t2 = new Transaction(LocalDate.of(2020, 01, 26),700,e1,ta2,p1);
//    }
//    
//    @Test
//    public void testCA() {
//    assertEquals(1200,e1.CA(),"Le CA doit être égal à 1200");
//    }
//}
