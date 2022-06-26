package co.com.sofka.retotecnico.naves.service;

import co.com.sofka.retotecnico.naves.model.NoTripulada;
import co.com.sofka.retotecnico.naves.model.VehiculoLanzadera;

import java.util.List;
import java.util.Optional;

public interface VehiculoLanzaderaServieI {


    public VehiculoLanzadera guardar(VehiculoLanzadera vehiculoLanzadera);
    public List<VehiculoLanzadera> listar();

    public void eliminar(String id);

    public VehiculoLanzadera buscarPorId(String id);

}
