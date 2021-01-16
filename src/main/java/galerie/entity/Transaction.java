/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author Juju Vilas
 */
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @RequiredArgsConstructor  @ToString
@Entity // Une entité JPA
public class Transaction {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    private LocalDate venduLe;
      
    @Column(unique=true)
    private float prixVente;
    
    @ManyToOne
    private Exposition lieuDeVente;
    
    @OneToOne
    private Tableau oeuvre;
    
    @ManyToOne
    private Personne client;

    public Transaction(LocalDate venduLe, float prixVente, Exposition lieuDeVente, Tableau oeuvre, Personne client) {
        this.venduLe = venduLe;
        this.prixVente = prixVente;
        this.lieuDeVente = lieuDeVente;
        this.oeuvre = oeuvre;
        this.client = client;
    }
    
}
