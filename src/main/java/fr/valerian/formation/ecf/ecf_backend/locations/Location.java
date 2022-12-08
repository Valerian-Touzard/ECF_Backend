package fr.valerian.formation.ecf.ecf_backend.locations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    private String id;
    @DBRef
    private String idVehicule;
    @DBRef
    private String idLocataire;
    private String imma;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String prixLoca;
}
