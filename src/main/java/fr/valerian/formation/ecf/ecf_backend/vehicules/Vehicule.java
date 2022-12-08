package fr.valerian.formation.ecf.ecf_backend.vehicules;

import fr.valerian.formation.ecf.ecf_backend.locations.Location;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule {
    private String id;
    private String marque;
    private String modele;
    private String type;
    private String imma;
    private String etat;
    private String prix;
    private Boolean dispo;

    private List<Location> locations;
}
