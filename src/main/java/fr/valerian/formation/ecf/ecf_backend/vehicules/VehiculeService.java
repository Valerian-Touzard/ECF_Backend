package fr.valerian.formation.ecf.ecf_backend.vehicules;

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
}
