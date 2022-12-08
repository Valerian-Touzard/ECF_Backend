package fr.valerian.formation.ecf.ecf_backend.locations;

import fr.valerian.formation.ecf.ecf_backend.locataires.Locataire;
import fr.valerian.formation.ecf.ecf_backend.locataires.LocataireService;
import fr.valerian.formation.ecf.ecf_backend.locations.dto.LocationFront;
import fr.valerian.formation.ecf.ecf_backend.vehicules.Vehicule;
import fr.valerian.formation.ecf.ecf_backend.vehicules.VehiculeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class LocationServiceImp implements LocationService {

    private final LocationRepository locationRepository;

    private final LocataireService locataireService;

    private final VehiculeService vehiculeService;

    public LocationServiceImp(LocationRepository locationRepository,
                              LocataireService locataireService,
                              VehiculeService vehiculeService
    ) {
        this.locationRepository = locationRepository;
        this.locataireService = locataireService;
        this.vehiculeService = vehiculeService;
    }

    @Override
    public List<Location> findAll() {
        return locationRepository.findAll();
    }

    @Override
    public Location save(Location entity) {
        return locationRepository.save(entity);
    }

    @Override
    public Location findById(String id) {
        return locationRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public void deleteById(String id) {
        Location location = this.findById(id);
        Vehicule vehicule = location.getVehicule();
        vehicule.setDispo(true);
        this.vehiculeService.save(vehicule);
        locationRepository.deleteById(id);
    }

    @Override
    public Location ajouterLocation(String idVehicule, LocationFront location) {
        Location location1 = new Location();
        Vehicule vehicule = this.vehiculeService.findById(idVehicule);
        System.out.println(location.getLocataire());
        Locataire locataire = this.locataireService.findById(location.getLocataire());


        location1.setId(location.getId());
        location1.setLocataire(locataire);
        location1.setImma(location.getImma());
        location1.setDateDebut(location.getDateDebut());
        location1.setDateFin(location.getDateFin());
        location1.setPrixLoca(location.getPrixLoca());


        vehicule.getLocations().add(location1);
        vehicule.setDispo(false);
        this.vehiculeService.save(vehicule);
        return this.save(location1);
    }

}
