package co.com.sofka.retotecnico.naves.service.implementacion;

import co.com.sofka.retotecnico.naves.model.VehiculoLanzadera;
import co.com.sofka.retotecnico.naves.repository.VehiculoLanzaderaRepository;
import co.com.sofka.retotecnico.naves.service.VehiculoLanzaderaServieI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoLanzaderaService implements VehiculoLanzaderaServieI {
    @Autowired
    VehiculoLanzaderaRepository vehiculoLanzaderaRepository ;

    @Override
    public VehiculoLanzadera guardar(VehiculoLanzadera vehiculoLanzadera) {
        return vehiculoLanzaderaRepository.save(vehiculoLanzadera);
    }

    @Override
    public List<VehiculoLanzadera> listar() {
        return vehiculoLanzaderaRepository.findAll();
    }

    @Override
    public Optional<VehiculoLanzadera> busacarPorId(String id) {
        return vehiculoLanzaderaRepository.findById(id);
    }

    @Override
    public List<VehiculoLanzadera> buscarPorCapasidadCarga(String capasidadCarga) {
        return vehiculoLanzaderaRepository.findByCapasidadCarga(capasidadCarga);
    }

    public List<VehiculoLanzadera> buscarPorTipoCarga(String tipoCarga) {
        return vehiculoLanzaderaRepository.findByCapasidadCarga(tipoCarga);
    }
}
