package co.com.sofka.retotecnico.naves.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Table(name = "tripulada")
@Entity
public class Tripulada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column
    private String nombre;
    @Column
    private String tipoCombustible;
    @Column
    private String paisOrigen;
    @Column
    private String anioLansamiento;
    @Column
    private String descripcion;
    @Column
    private String capacidadPersonas;


    public Tripulada() {
    }

    public Tripulada(String nombre, String tipoCombustible, String paisOrigen, String anioLansamiento, String descripcion, String capacidadPersonas) {
        this.nombre = nombre;
        this.tipoCombustible = tipoCombustible;
        this.paisOrigen = paisOrigen;
        this.anioLansamiento = anioLansamiento;
        this.descripcion = descripcion;
        this.capacidadPersonas = capacidadPersonas;
    }
}
