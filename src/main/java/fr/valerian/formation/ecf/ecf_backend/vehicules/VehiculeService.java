package fr.valerian.formation.ecf.ecf_backend.vehicules;

import fr.valerian.formation.ecf.ecf_backend.locations.Location;

import java.util.List;
import java.util.Optional;

public interface VehiculeService {

    /**
     * Permet de retourner la liste complètes des véhicules
     * @return {@link List<Vehicule>} : La liste des véhicules
     */
    List<Vehicule> findAll();

    /**
     * Permet de sauvegarder un véhicule en base de donnée
     * @param entity {@link Vehicule} : Le vehicule à sauvegarder
     * @return {@link Vehicule} : Le vehicule sauvegardé
     */
    Vehicule save(Vehicule entity);

    /**
     * Permet de retourner un véhicule via son id
     * @param id {@link String} : l'id du véhicule
     * @return Vehicule : le véhicule identifier
     */
    Vehicule findById(String id);

    /**
     * Permet de supprimer un véhicule via son id
     * @param id {@link String} : l'id du véhicule
     */
    void deleteById(String id);

}
