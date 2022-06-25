package co.com.sofka.retotecnico.naves.repository;

import co.com.sofka.retotecnico.naves.model.NoTripulada;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoTripuladaRepository extends MongoRepository<NoTripulada, String> {
    public List<NoTripulada> findByTipoEstudio(String tipoEstudio);
}
