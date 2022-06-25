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
@Document(collation = "nave_tripulada")
public class Tripulada extends Nave {

    public String capacidadPersonas;
}
