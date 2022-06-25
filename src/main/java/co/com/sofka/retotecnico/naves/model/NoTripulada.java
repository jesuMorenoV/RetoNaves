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
@Document(collation = "nave_notripulada")
public class NoTripulada extends Nave {

    public String tipoEstudio;
}
