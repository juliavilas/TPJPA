/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
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
public class Tableau {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Column(unique=true)
    private String titre;
    
    @Column(unique=true)
    private String support;
    
    @Column(unique=true)
    private int largeur;
    
    @Column(unique=true)
    private int hauteur;
    
    @ManyToOne
    private Artiste auteur;
   
    @ManyToMany(mappedBy = "oeuvres", cascade = CascadeType.PERSIST)
    List<Exposition> accrochages = new LinkedList<>();
    
    @OneToOne
    private Transaction vendu;

    public Tableau(String titre, String support, int largeur, int hauteur, Artiste auteur, Transaction vendu) {
        this.titre = titre;
        this.support = support;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.auteur = auteur;
        this.vendu = vendu;
    }
    
    
}
