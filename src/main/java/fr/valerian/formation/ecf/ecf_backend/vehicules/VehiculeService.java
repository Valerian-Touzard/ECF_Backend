package fr.valerian.formation.ecf.ecf_backend.vehicules;

import fr.valerian.formation.ecf.ecf_backend.locations.Location;

import java.util.List;
import java.util.Optional;

public interface VehiculeService {

    /**
     * Permet de retourner la liste complètes des véhicules
     * @return List -> La liste des véhicules
     */
    List<Vehicule> findAll();

    /**
     * Permet de sauvegarder un véhicule en base de donnée
     * @param entity Vehicule -> Le vehicule à sauvegarder
     * @return Vehicule -> Le vehicule sauvegardé
     */
    Vehicule save(Vehicule entity);

    /**
     * Permet de retourner un véhicule via son id
     * @param id String -> l'id du véhicule
     * @return Vehicule -> le véhicule identifier
     */
    Vehicule findById(String id);

    /**
     * Permet de supprimer un véhicule via son id
     * @param id String ->l'id du véhicule
     */
    void deleteById(String id);

    /**
     * Permet d'enregistrer une location en BDD
     * @param idLocataire String ->l'id du locataire
     * @param idVehicule String ->l'id du véhicule
     * @return Location -> la nouvelle location
     */
    Vehicule ajouterLocation(String idLocataire, String idVehicule, Location idLocation);

    /**
     * Permet de supprimer la location d'un véhicule
     * @param idVehicule String -> l'id du véhicule
     * @param idLocation String -> l'id de la location
     * @return Vehicule -> Le vehicule avec suppression de la location
     */
    Vehicule supprimerLocation(String idVehicule, String idLocation);
}
