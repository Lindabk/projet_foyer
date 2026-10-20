package tn.esprim.gestion_foyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation  implements Serializable {
        @Id
        private String idReservation;
        private String anneUniversitaire;
        private  Boolean estValide;
        @ManyToMany
        private Set<Etudiant> etudiants;

}
