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
@Getter @Setter @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Exposition {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Column
    private LocalDate debut;
    
    @Column
    private String intitule;
    
    @Column
    private int duree;
 
    @ManyToOne
    private Galerie organisateur;
    
    @OneToMany(mappedBy = "lieuDeVente", cascade = CascadeType.PERSIST)
    private List<Transaction> ventes = new LinkedList<>();
    
    @ManyToMany
    List<Tableau> oeuvres = new LinkedList<>();
    
    public float CA(){
        float CA=0;
        for (Transaction t : ventes){
            CA = CA + t.getPrixVente();
        }
        return CA;
    }

}
