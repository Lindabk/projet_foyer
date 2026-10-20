package tn.esprim.gestion_foyer.services;

import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprim.gestion_foyer.entities.Foyer;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class FoyerServiceImpl implements IFoyerService {

    EntityManager entityManager;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return entityManager.createQuery("SELECT f FROM Foyer f", Foyer.class).getResultList();
    }

    @Override
    public Foyer retrieveFoyer(Long idFoyer) {
        return entityManager.find(Foyer.class, idFoyer);
    }

    @Override
    public Foyer addFoyer(Foyer foyer) {
        entityManager.persist(foyer);
        return foyer;
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        Foyer foyer = entityManager.find(Foyer.class, idFoyer);
        if (foyer != null) {
            entityManager.remove(foyer);
        }
    }

    @Override
    public Foyer modifyFoyer(Foyer foyer) {
        return entityManager.merge(foyer);
    }
}
