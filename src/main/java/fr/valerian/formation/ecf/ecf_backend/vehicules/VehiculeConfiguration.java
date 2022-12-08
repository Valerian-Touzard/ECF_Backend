package fr.valerian.formation.ecf.ecf_backend.vehicules;

import fr.valerian.formation.ecf.ecf_backend.locataires.LocataireService;
import fr.valerian.formation.ecf.ecf_backend.locations.LocationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehiculeConfiguration {
    @Bean
    public VehiculeService vehiculeService(VehiculeRepository vehiculeRepository){
        return new VehiculeServiceImp(vehiculeRepository);
    }
}
