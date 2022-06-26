package co.com.sofka.retotecnico.naves.service.implementacion;

import co.com.sofka.retotecnico.naves.model.Tripulada;
import co.com.sofka.retotecnico.naves.repository.TripuladaRepository;
import co.com.sofka.retotecnico.naves.service.TripuladaServieI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TripuladaService implements TripuladaServieI {

    @Autowired
    TripuladaRepository tripuladaRepository;

    @Override
    public Tripulada guardar(Tripulada tripulada) {
        return tripuladaRepository.save(tripulada);
    }

    @Override
    public List<Tripulada> listar() {
        return tripuladaRepository.findAll();
    }

    @Override
    public Optional<Tripulada> busacarPorId(String id) {
        return tripuladaRepository.findById(id);
    }

    @Override
    public List<Tripulada> buscarPorCapacidadPersonas(String capacidadPersonas) {
        return tripuladaRepository.findByCapacidadPersonas(capacidadPersonas);
    }

}
