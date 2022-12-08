package fr.valerian.formation.ecf.ecf_backend.locataires;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/locataires")
public class LocataireController {

    private final LocataireService locataireService;

    public LocataireController(LocataireService locataireService) {
        this.locataireService = locataireService;
    }

    @GetMapping("")
    public List<Locataire> findAll() {
        return locataireService.findAll();
    }

    @GetMapping("{id}")
    public Locataire findById(String id) {
        return locataireService.findById(id);
    }

    @PostMapping("")
    public Locataire save(@RequestBody Locataire entity) {
        return locataireService.save(entity);
    }

    @DeleteMapping("{id}")
    public void deleteById(String id) {
        locataireService.deleteById(id);
    }
}
