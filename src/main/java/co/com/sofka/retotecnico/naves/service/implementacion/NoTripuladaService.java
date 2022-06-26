package co.com.sofka.retotecnico.naves.service.implementacion;

import co.com.sofka.retotecnico.naves.model.NoTripulada;
import co.com.sofka.retotecnico.naves.repository.NoTripuladaRepository;
import co.com.sofka.retotecnico.naves.service.NoTripuladaServieI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoTripuladaService implements NoTripuladaServieI {

    @Autowired
    NoTripuladaRepository noTripuladaRepository;


    @Override
    public NoTripulada guardar(NoTripulada noTripulada) {
        return noTripuladaRepository.save(noTripulada);
    }

    @Override
    public List<NoTripulada> listar() {
        return (List<NoTripulada>) noTripuladaRepository.findAll();
    }

    @Override
    public void eliminar(String id) {
        try{
            noTripuladaRepository.deleteById(id);
        }catch (Exception e){
            System.out.println("Ocurrio un error ");
        }
    }

    @Override
    public NoTripulada buscarPorId(String id) {
        Optional<NoTripulada> optionalList = noTripuladaRepository.findById(id);

        return (optionalList.get());
    }



}
