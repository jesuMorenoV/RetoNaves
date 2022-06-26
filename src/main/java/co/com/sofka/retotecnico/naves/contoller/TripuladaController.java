package co.com.sofka.retotecnico.naves.contoller;

import co.com.sofka.retotecnico.naves.model.Tripulada;
import co.com.sofka.retotecnico.naves.service.implementacion.TripuladaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "", allowedHeaders = "")
public class TripuladaController {

    @Autowired
    TripuladaService tripuladaService;

    @PostMapping("/tripulado")
    public Tripulada guardar(Tripulada tripulada) {
        return tripuladaService.guardar(tripulada);
    }

    @GetMapping("/tripulados")
    public List<Tripulada> listar() {
        return tripuladaService.listar();
    }

    @GetMapping("/tripulado/id/{id}")
    public Optional<Tripulada> buscarId(@PathVariable("id") String id) {
        return Optional.ofNullable(tripuladaService.buscarPorId(id));
    }

    @DeleteMapping("/tripulada/id/{id}")
    public void eliminar(@PathVariable("id")String id){
        tripuladaService.eliminar(id);
    }

}
