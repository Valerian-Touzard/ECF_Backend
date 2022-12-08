package fr.valerian.formation.ecf.ecf_backend.locations;

import java.util.List;

public interface LocationService {
    /**
     * Permet de récupérer la liste des locations
     * @return List -> La liste des locations
     */
    List<Location> findAll();

    /**
     * Permet de sauvegarder une location
     * @param entity Location -> La location à sauvegarder
     * @return Location -> La location sauvegarder
     */
    Location save(Location entity);

    /**
     * Permet de retourner une location via son id
     * @param id String -> L'id de la location
     * @return Location -> La location
     */
    Location findById(String id);

    /**
     *Permet de supprimer une location via son id
     * @param id String -> L'id de la location
     */
    void deleteById(String id);
}
