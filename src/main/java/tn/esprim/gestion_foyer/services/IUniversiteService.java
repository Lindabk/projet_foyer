package tn.esprim.gestion_foyer.services;

import tn.esprim.gestion_foyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversites();

    Universite retrieveUniversite(Long idUniversite);

    Universite addUniversite(Universite universite);

    void removeUniversite(Long idUniversite);

    Universite modifyUniversite(Universite universite);
}
