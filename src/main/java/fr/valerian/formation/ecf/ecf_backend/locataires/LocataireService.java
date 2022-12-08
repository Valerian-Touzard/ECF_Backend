package fr.valerian.formation.ecf.ecf_backend.locataires;

import java.util.List;

public interface LocataireService {

    /**
     * Permet de retourner la liste complète des locataires
     * @return List<Locataire> -> La liste des locataires
     */
    List<Locataire> findAll();

    /**
     * Permet de sauvegarder en Base de donnée le locataire
     * @param entity Locataire -> Le locataire a sauvegarder
     * @return le locataire enregistrer
     */
    Locataire save(Locataire entity);

    /**
     * Permet de retourner le locataire identifier par son id
     * @param id String -> l'id du locataire
     * @return Locataire -> le locataire identifier par son id
     */
    Locataire findById(String id);

    /**
     * Permet de supprimer un locataire via son id
     * @param id String -> l'id du locataire à supprimer
     */
    void deleteById(String id);
}
