package fr.valerian.formation.ecf.ecf_backend.vehicules;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

public class VehiculeServiceImp implements VehiculeService {
    private final VehiculeRepository vehiculeRepository;

    public VehiculeServiceImp(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    @Override
    public List<Vehicule> findAll() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule save(Vehicule entity) {
        return vehiculeRepository.save(entity);
    }

    @Override
    public Vehicule findById(String id) {
        return vehiculeRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public void deleteById(String id) {
        vehiculeRepository.deleteById(id);
    }
}
