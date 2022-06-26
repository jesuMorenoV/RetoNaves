package co.com.sofka.retotecnico.naves.service.implementacion;

import co.com.sofka.retotecnico.naves.model.NoTripulada;
import co.com.sofka.retotecnico.naves.model.Tripulada;
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
        return (List<VehiculoLanzadera>) vehiculoLanzaderaRepository.findAll()
                ;
    }

    @Override
    public void eliminar(String id) {
        try{
            vehiculoLanzaderaRepository.deleteById(id);
        }catch (Exception e){
            System.out.println("Ocurrio un error ");
        }

    }

    @Override
    public VehiculoLanzadera buscarPorId(String id) {

        Optional<VehiculoLanzadera> optionalList = vehiculoLanzaderaRepository.findById(id);

        return (optionalList.get());
    }


}
