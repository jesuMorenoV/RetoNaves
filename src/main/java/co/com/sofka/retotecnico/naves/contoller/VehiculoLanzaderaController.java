package co.com.sofka.retotecnico.naves.contoller;

import co.com.sofka.retotecnico.naves.model.VehiculoLanzadera;
import co.com.sofka.retotecnico.naves.service.implementacion.VehiculoLanzaderaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "", allowedHeaders = "")
public class VehiculoLanzaderaController {
    @Autowired
    VehiculoLanzaderaService vehiculoLanzaderaService ;

    @PostMapping("/vehiculolanzadera")
    public VehiculoLanzadera guardar(VehiculoLanzadera vehiculoLanzadera){
        return vehiculoLanzaderaService.guardar(vehiculoLanzadera);
    }

    @GetMapping("/vehiculolanzadera")
    public List<VehiculoLanzadera> listar(){
        return vehiculoLanzaderaService.listar();
    }

    @GetMapping("/vehiculolanzadera/id/{id}")
    public Optional<VehiculoLanzadera> buscarId(@PathVariable("id") String id){
        return Optional.ofNullable(vehiculoLanzaderaService.buscarPorId(id));
    }

    @DeleteMapping("/vehiculolanzadera/id/{id}")
    public void eliminar(@PathVariable("id")String id){
        vehiculoLanzaderaService.eliminar(id);
    }

}
