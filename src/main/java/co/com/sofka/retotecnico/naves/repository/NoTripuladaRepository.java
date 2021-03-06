package co.com.sofka.retotecnico.naves.repository;

import co.com.sofka.retotecnico.naves.model.NoTripulada;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoTripuladaRepository extends CrudRepository<NoTripulada, String> {
}
