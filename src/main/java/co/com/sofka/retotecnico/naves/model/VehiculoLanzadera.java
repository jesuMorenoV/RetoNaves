package co.com.sofka.retotecnico.naves.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "vehiculo_lanzadera")
public class VehiculoLanzadera extends Nave{

   public String capasidadCarga;
   public String tipoCarga;


}
