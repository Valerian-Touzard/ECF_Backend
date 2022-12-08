package fr.valerian.formation.ecf.ecf_backend.locataires;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

public class LocataireServiceImp implements LocataireService {
    private final LocataireRepository locataireRepository;

    public LocataireServiceImp(LocataireRepository locataireRepository) {
        this.locataireRepository = locataireRepository;
    }

    @Override
    public List<Locataire> findAll() {
        return locataireRepository.findAll();
    }

    @Override
    public Locataire save(Locataire entity) {
        return locataireRepository.save(entity);
    }

    @Override
    public Locataire findById(String id) {
        return locataireRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public void deleteById(String id) {
        locataireRepository.deleteById(id);
    }
}
