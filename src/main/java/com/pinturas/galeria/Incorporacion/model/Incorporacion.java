package com.pinturas.galeria.Incorporacion.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Incorporacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Descripcion;
    private String Vincorporacion;

    private String Artistai;

    public Incorporacion() {
    }

    public Incorporacion(String descripcion, String vincorporacion, String artistai) {
        Descripcion = descripcion;
        Vincorporacion = vincorporacion;
        Artistai = artistai;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getVincorporacion() {
        return Vincorporacion;
    }

    public void setVincorporacion(String vincorporacion) {
        Vincorporacion = vincorporacion;
    }

    public String getArtistai() {
        return Artistai;
    }

    public void setArtistai(String artistai) {
        Artistai = artistai;
    }
}
