package fr.valerian.formation.ecf.ecf_backend.locations;

import fr.valerian.formation.ecf.ecf_backend.locations.dto.LocationFront;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/locations")
public class LocationController {
    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("")
    public List<Location> findAll() {
        return locationService.findAll();
    }

    @GetMapping("{id}")
    public Location findById(@PathVariable String id) {
        return locationService.findById(id);
    }

    @PostMapping("")
    public Location save(@RequestBody Location entity) {
        return locationService.save(entity);
    }

    @PostMapping("/vehicules/{idVehicule}")
    public Location ajouterLocation(
            @PathVariable String idVehicule,
            @RequestBody LocationFront location
    ) {
        return locationService.ajouterLocation(idVehicule, location);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        locationService.deleteById(id);
    }

}
