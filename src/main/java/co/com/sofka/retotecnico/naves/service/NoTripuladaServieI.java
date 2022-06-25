package co.com.sofka.retotecnico.naves.service;

import co.com.sofka.retotecnico.naves.model.NoTripulada;

import java.util.List;
import java.util.Optional;

public interface NoTripuladaServieI {

    public NoTripulada guardar(NoTripulada noTripulada);
    public List<NoTripulada>  listar();
    public Optional<NoTripulada> busacarPorId(String id);
    public List<NoTripulada>  buscarPorTipoEstudio(String tipoEstudio);

}
