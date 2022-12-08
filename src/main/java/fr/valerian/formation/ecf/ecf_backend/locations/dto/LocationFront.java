package fr.valerian.formation.ecf.ecf_backend.locations.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LocationFront {
    private String id;
    private String idVehicule;
    private String locataire;
    private String imma;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String prixLoca;
}
