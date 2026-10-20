package tn.esprim.gestion_foyer.entities;

import jakarta.persistence.*;
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
public class Foyer implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idFoyer;
  private String nomFoyer;
  private long capaciteFoyer;
  @OneToOne(cascade = CascadeType.ALL, mappedBy = "foyer")
  private Universite universite;
  @OneToMany(mappedBy = "foyer")
  private Set<Bloc> blocs;
}
