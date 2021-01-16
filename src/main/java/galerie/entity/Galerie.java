package galerie.entity;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity // Une entité JPA
public class Galerie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String nom;

    @Column(unique = true)
    private String adresse;

    @OneToMany(mappedBy = "organisateur", cascade = CascadeType.PERSIST)
    private List<Exposition> evenements = new LinkedList<>();

    public float CAannuel(int annee) {
        float CAannuel = 0;
        for (Exposition e : evenements) {
            if (e.getDebut().getYear() == annee) {
                CAannuel = CAannuel + e.CA();
            }
        }
        return CAannuel;
    }

    public Galerie(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

}
