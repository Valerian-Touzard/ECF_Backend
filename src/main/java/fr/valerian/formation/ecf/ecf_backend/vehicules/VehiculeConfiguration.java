package fr.valerian.formation.ecf.ecf_backend.vehicules;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehiculeConfiguration {
    @Bean
    public VehiculeService vehiculeService(VehiculeRepository vehiculeRepository){
        return new VehiculeServiceImp(vehiculeRepository);
    }
}
