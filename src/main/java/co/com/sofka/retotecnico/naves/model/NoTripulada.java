package co.com.sofka.retotecnico.naves.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;


@Table(name = "notripulada")
@Entity
public class NoTripulada {

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
    private String tipoEstudio;

    public NoTripulada() {
    }

    public NoTripulada( String nombre, String tipoCombustible, String paisOrigen, String anioLansamiento, String descripcion, String tipoEstudio) {
        this.nombre = nombre;
        this.tipoCombustible = tipoCombustible;
        this.paisOrigen = paisOrigen;
        this.anioLansamiento = anioLansamiento;
        this.descripcion = descripcion;
        this.tipoEstudio = tipoEstudio;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getAnioLansamiento() {
        return anioLansamiento;
    }

    public void setAnioLansamiento(String anioLansamiento) {
        this.anioLansamiento = anioLansamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoEstudio() {
        return tipoEstudio;
    }

    public void setTipoEstudio(String tipoEstudio) {
        this.tipoEstudio = tipoEstudio;
    }
}
