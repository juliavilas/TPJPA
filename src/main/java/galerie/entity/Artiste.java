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
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity // Une entité JPA
public class Artiste extends Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String biographie;

    @OneToMany(mappedBy = "auteur", cascade = CascadeType.PERSIST)
    List<Tableau> oeuvres = new LinkedList<>();

}
