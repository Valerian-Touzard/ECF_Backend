package fr.valerian.formation.ecf.ecf_backend.locations;

import fr.valerian.formation.ecf.ecf_backend.locations.dto.LocationFront;

import java.util.List;

public interface LocationService {
    /**
     * Permet de récupérer la liste des locations
     * @return {@link List<Location>} : La liste des locations
     */
    List<Location> findAll();

    /**
     * Permet de sauvegarder une location
     * @param entity {@link Location} : La location à sauvegarder
     * @return {@link Location} : La location sauvegarder
     */
    Location save(Location entity);

    /**
     * Permet de retourner une location via son id
     * @param id {@link String} : L'id de la location
     * @return {@link Location} : La location
     */
    Location findById(String id);

    /**
     *Permet de supprimer une location via son id
     * @param id {@link String} : L'id de la location
     */
    void deleteById(String id);

    /**
     * Permet d'aujouter une location de véhicule
     * @param idVehicule {@link String} : L'id du véhicule
     * @param location {@link Location} : La location à ajouter
     * @return {@link Location}
     */
    Location ajouterLocation(String idVehicule, LocationFront location);
}
