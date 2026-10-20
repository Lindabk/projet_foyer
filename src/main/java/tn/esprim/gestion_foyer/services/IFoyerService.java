package tn.esprim.gestion_foyer.services;

import tn.esprim.gestion_foyer.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();

    Foyer retrieveFoyer(Long idFoyer);

    Foyer addFoyer(Foyer foyer);

    void removeFoyer(Long idFoyer);

    Foyer modifyFoyer(Foyer foyer);
}
