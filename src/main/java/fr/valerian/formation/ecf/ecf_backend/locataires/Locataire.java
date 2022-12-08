package fr.valerian.formation.ecf.ecf_backend.locataires;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Locataire {
    private String id;
    private String nom;
    private String prenom;
    private LocalDate dateNaiss;
    private String email;
    private String tel;
}
