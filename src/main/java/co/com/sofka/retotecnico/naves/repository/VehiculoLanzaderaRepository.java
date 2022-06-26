package co.com.sofka.retotecnico.naves.repository;

import co.com.sofka.retotecnico.naves.model.VehiculoLanzadera;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehiculoLanzaderaRepository extends CrudRepository<VehiculoLanzadera, String> {


}
