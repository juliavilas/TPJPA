/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.util.List;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author Juju Vilas
 */
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity // Une entité JPA
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String nom;

    @Column(unique = true)
    private String adresse;

    @OneToMany(mappedBy = "client", cascade = CascadeType.PERSIST)
    private List<Transaction> transactions;

//    public float budgetArt(int annee) {
//        float budget = 0;
//        for (Transaction t : transactions) {
//            if (t.getVenduLe().getYear() = annee) {
//                float prix = t.getPrixVente();
//                budget=budget+prix;
//            }
//        }
//        return budget;
//    }
}
