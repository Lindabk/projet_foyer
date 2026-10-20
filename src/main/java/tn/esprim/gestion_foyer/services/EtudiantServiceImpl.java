package tn.esprim.gestion_foyer.services;

import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprim.gestion_foyer.entities.Etudiant;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class EtudiantServiceImpl implements IEtudiantService {

    EntityManager entityManager;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return entityManager.createQuery("SELECT e FROM Etudiant e", Etudiant.class).getResultList();
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return entityManager.find(Etudiant.class, idEtudiant);
    }

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        entityManager.persist(etudiant);
        return etudiant;
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        Etudiant etudiant = entityManager.find(Etudiant.class, idEtudiant);
        if (etudiant != null) {
            entityManager.remove(etudiant);
        }
    }

    @Override
    public Etudiant modifyEtudiant(Etudiant etudiant) {
        return entityManager.merge(etudiant);
    }
}
