package tn.esprim.gestion_foyer.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprim.gestion_foyer.entities.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}
