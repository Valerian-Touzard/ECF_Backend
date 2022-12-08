package fr.valerian.formation.ecf.ecf_backend.locations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocationConfiguration {
    @Bean
    public LocationService locationService(LocationRepository locationRepository){
        return new LocationServiceImp(locationRepository);
    }
}
