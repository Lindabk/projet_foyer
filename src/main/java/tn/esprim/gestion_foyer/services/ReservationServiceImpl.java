package tn.esprim.gestion_foyer.services;

import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprim.gestion_foyer.entities.Reservation;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class ReservationServiceImpl implements IReservationService {

    EntityManager entityManager;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return entityManager.createQuery("SELECT r FROM Reservation r", Reservation.class).getResultList();
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return entityManager.find(Reservation.class, idReservation);
    }

    @Override
    public Reservation addReservation(Reservation reservation) {
        entityManager.persist(reservation);
        return reservation;
    }

    @Override
    public void removeReservation(String idReservation) {
        Reservation reservation = entityManager.find(Reservation.class, idReservation);
        if (reservation != null) {
            entityManager.remove(reservation);
        }
    }

    @Override
    public Reservation modifyReservation(Reservation reservation) {
        return entityManager.merge(reservation);
    }
}
