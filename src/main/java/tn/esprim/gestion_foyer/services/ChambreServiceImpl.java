package tn.esprim.gestion_foyer.services;

import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprim.gestion_foyer.entities.Chambre;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class ChambreServiceImpl implements IChambreService {

    EntityManager entityManager;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return entityManager.createQuery("SELECT c FROM Chambre c", Chambre.class).getResultList();
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return entityManager.find(Chambre.class, idChambre);
    }

    @Override
    public Chambre addChambre(Chambre chambre) {
        entityManager.persist(chambre);
        return chambre;
    }

    @Override
    public void removeChambre(Long idChambre) {
        Chambre chambre = entityManager.find(Chambre.class, idChambre);
        if (chambre != null) {
            entityManager.remove(chambre);
        }
    }

    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return entityManager.merge(chambre);
    }
}
