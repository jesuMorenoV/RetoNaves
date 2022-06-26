package co.com.sofka.retotecnico.naves.service;

import co.com.sofka.retotecnico.naves.model.VehiculoLanzadera;

import java.util.List;
import java.util.Optional;

public interface VehiculoLanzaderaServieI {


    public VehiculoLanzadera guardar(VehiculoLanzadera vehiculoLanzadera);
    public List<VehiculoLanzadera> listar();
    public Optional<VehiculoLanzadera> busacarPorId(String id);
    public List<VehiculoLanzadera>  buscarPorCapasidadCarga(String capasidadCarga);
    public List<VehiculoLanzadera>  buscarPorTipoCarga(String tipoCarga);

}
