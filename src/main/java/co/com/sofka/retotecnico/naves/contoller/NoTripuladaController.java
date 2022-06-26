package co.com.sofka.retotecnico.naves.contoller;

import co.com.sofka.retotecnico.naves.model.NoTripulada;
import co.com.sofka.retotecnico.naves.service.implementacion.NoTripuladaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "", allowedHeaders = "")
public class NoTripuladaController {

    @Autowired
    NoTripuladaService noTripuladaService;

    @PostMapping("/notripulado")
    @ResponseStatus(HttpStatus.CREATED)
    public NoTripulada guardar(NoTripulada noTripulada){
        return noTripuladaService.guardar(noTripulada);
    }

    @GetMapping("/notripulados")
    public List<NoTripulada> listar(){
        return noTripuladaService.listar();
    }

    @GetMapping("/notripulado/id/{id}")
    public Optional<NoTripulada> buscarId(@PathVariable("id") String id){
        return  noTripuladaService.busacarPorId(id);
    }

    @GetMapping("/notripulado/tipo_estudio/{tipo_estudio}")
    public List<NoTripulada> buscarTipoEstudio(@PathVariable("tipo_estudio") String tipoEstudio){
        return  noTripuladaService.buscarPorTipoEstudio(tipoEstudio);
    }
}
