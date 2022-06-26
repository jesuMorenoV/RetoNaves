package co.com.sofka.retotecnico.naves.service;

import co.com.sofka.retotecnico.naves.model.NoTripulada;
import co.com.sofka.retotecnico.naves.model.Tripulada;

import java.util.List;
import java.util.Optional;

public interface TripuladaServieI {


    public Tripulada guardar(Tripulada tripulada);
    public List<Tripulada> listar();

    public void eliminar(String id);

    public Tripulada buscarPorId(String id);


}
