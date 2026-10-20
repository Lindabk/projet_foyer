package tn.esprim.gestion_foyer.services;

import tn.esprim.gestion_foyer.entities.Bloc;
import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveAllBlocs();
    Bloc retrieveBloc(Long blocId);
    Bloc addBloc(Bloc b);
    void removeBloc(Long blocId);
    Bloc modifyBloc(Bloc b);
}