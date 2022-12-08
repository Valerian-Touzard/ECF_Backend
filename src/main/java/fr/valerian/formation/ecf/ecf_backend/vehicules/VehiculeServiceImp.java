package fr.valerian.formation.ecf.ecf_backend.vehicules;

import fr.valerian.formation.ecf.ecf_backend.locataires.Locataire;
import fr.valerian.formation.ecf.ecf_backend.locataires.LocataireService;
import fr.valerian.formation.ecf.ecf_backend.locations.Location;
import fr.valerian.formation.ecf.ecf_backend.locations.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class VehiculeServiceImp implements VehiculeService {
    private final VehiculeRepository vehiculeRepository;
    private final LocationService locationService;
    public VehiculeServiceImp(VehiculeRepository vehiculeRepository, LocationService locationService) {
        this.vehiculeRepository = vehiculeRepository;
        this.locationService = locationService;
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

    @Override
    public Vehicule ajouterLocation(String idLocataire, String idVehicule, Location location){
        // On récupère les informations du locataire et du véhicules
        Vehicule vehicule = this.findById(idVehicule);

        // On enregistre le locataire et le véhicule dans l'objet location
//        location.setIdVehicule(idVehicule);
//        location.setIdLocataire(idLocataire);
//        location.setImma(vehicule.getImma());
        vehicule.getLocations().add(location);

        return this.save(vehicule);
    }

    @Override
    public Vehicule supprimerLocation(String idVehicule, String idLocation){
        Vehicule vehicule = this.findById(idVehicule);
        Location locationASupprimer = this.locationService.findById(idLocation);

        vehicule.getLocations().removeIf(location -> locationASupprimer.getId().equals(location.getId()));
        this.locationService.deleteById(idLocation);
        return this.save(vehicule);
    }
}
