package tn.esprim.gestion_foyer.services;

import tn.esprim.gestion_foyer.entities.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservations();

    Reservation retrieveReservation(String idReservation);

    Reservation addReservation(Reservation reservation);

    void removeReservation(String idReservation);

    Reservation modifyReservation(Reservation reservation);
}
