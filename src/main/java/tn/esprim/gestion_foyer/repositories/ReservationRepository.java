package tn.esprim.gestion_foyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprim.gestion_foyer.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}