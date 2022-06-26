package co.com.sofka.retotecnico.naves.service;

import co.com.sofka.retotecnico.naves.model.NoTripulada;

import java.util.List;
import java.util.Optional;

public interface NoTripuladaServieI {

    public NoTripulada guardar(NoTripulada noTripulada);
    public List<NoTripulada>  listar();
    public void eliminar(String id);

    public NoTripulada buscarPorId(String id);

}
