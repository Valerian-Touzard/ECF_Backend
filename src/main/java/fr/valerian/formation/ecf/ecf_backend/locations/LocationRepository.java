package fr.valerian.formation.ecf.ecf_backend.locations;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationRepository extends MongoRepository<Location, String> {
}
