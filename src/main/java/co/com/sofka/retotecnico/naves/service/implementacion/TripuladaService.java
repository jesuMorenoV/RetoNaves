package co.com.sofka.retotecnico.naves.service.implementacion;

import co.com.sofka.retotecnico.naves.model.NoTripulada;
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
        return (List<Tripulada>) tripuladaRepository.findAll();
    }

    @Override
    public void eliminar(String id) {
        try{
            tripuladaRepository.deleteById(id);
        }catch (Exception e){
            System.out.println("Ocurrio un error ");
        }

    }

    @Override
    public Tripulada buscarPorId(String id) {

        Optional<Tripulada> optionalList = tripuladaRepository.findById(id);

        return (optionalList.get());
    }


}
