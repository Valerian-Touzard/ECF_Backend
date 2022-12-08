package fr.valerian.formation.ecf.ecf_backend.locations;

import fr.valerian.formation.ecf.ecf_backend.locataires.LocataireService;

import fr.valerian.formation.ecf.ecf_backend.vehicules.VehiculeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocationConfiguration {
    @Bean
    public LocationService locationService(
            LocationRepository locationRepository,
            VehiculeService vehiculeService,
            LocataireService locataireService
    ) {
        return new LocationServiceImp(locationRepository, locataireService, vehiculeService);
    }
}
