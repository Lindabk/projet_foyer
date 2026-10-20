package tn.esprim.gestion_foyer.services;

import tn.esprim.gestion_foyer.entities.Chambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();

    Chambre retrieveChambre(Long idChambre);

    Chambre addChambre(Chambre chambre);

    void removeChambre(Long idChambre);

    Chambre modifyChambre(Chambre chambre);
}
