package tn.esprim.gestion_foyer.services;

import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprim.gestion_foyer.entities.Universite;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class UniversiteServiceImpl implements IUniversiteService {

    EntityManager entityManager;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return entityManager.createQuery("SELECT u FROM Universite u", Universite.class).getResultList();
    }

    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return entityManager.find(Universite.class, idUniversite);
    }

    @Override
    public Universite addUniversite(Universite universite) {
        entityManager.persist(universite);
        return universite;
    }

    @Override
    public void removeUniversite(Long idUniversite) {
        Universite universite = entityManager.find(Universite.class, idUniversite);
        if (universite != null) {
            entityManager.remove(universite);
        }
    }

    @Override
    public Universite modifyUniversite(Universite universite) {
        return entityManager.merge(universite);
    }
}
