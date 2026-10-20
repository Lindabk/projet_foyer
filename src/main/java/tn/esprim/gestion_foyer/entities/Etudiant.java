package tn.esprim.gestion_foyer.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private  String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    @JsonFormat(pattern="yy-MM-dd")
    private Date dateNaissance;
    @ManyToMany
    private Set<Reservation> reservations;
}
