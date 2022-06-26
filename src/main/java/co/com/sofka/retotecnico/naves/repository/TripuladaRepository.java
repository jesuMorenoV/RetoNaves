package co.com.sofka.retotecnico.naves.repository;

import co.com.sofka.retotecnico.naves.model.Tripulada;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TripuladaRepository extends CrudRepository<Tripulada, String> {
}
