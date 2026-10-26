package tn.esprim.gestion_foyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprim.gestion_foyer.entities.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}