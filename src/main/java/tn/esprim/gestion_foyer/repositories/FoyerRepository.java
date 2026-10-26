package tn.esprim.gestion_foyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprim.gestion_foyer.entities.Foyer;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer, Long> {
}