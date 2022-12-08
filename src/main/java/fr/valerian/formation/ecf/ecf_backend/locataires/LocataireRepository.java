package fr.valerian.formation.ecf.ecf_backend.locataires;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocataireRepository extends MongoRepository<Locataire, String> {
}
