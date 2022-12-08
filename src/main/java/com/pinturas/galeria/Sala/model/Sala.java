package com.pinturas.galeria.Sala.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nsala;
    private String Descripcion;

    public Sala() {
    }

    public Sala(String nsala, String descripcion) {
        Nsala = nsala;
        Descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNsala() {
        return Nsala;
    }

    public void setNsala(String nsala) {
        Nsala = nsala;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
