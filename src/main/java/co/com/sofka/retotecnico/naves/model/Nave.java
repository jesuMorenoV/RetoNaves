package co.com.sofka.retotecnico.naves.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Nave {

    @Id
    public String id;
    public String nombre;
    public String tipoCombustible;
    public String paisOrigen;
    public String añoLansamiento;
    public String descripcion;

}
