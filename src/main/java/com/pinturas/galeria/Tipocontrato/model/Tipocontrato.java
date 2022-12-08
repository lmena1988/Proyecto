package com.pinturas.galeria.Tipocontrato.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tipocontrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Ntipocontrato;
    private String Descripcion;

    public Tipocontrato() {
    }

    public Tipocontrato(String ntipocontrato, String descripcion) {
        Ntipocontrato = ntipocontrato;
        Descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNtipocontrato() {
        return Ntipocontrato;
    }

    public void setNtipocontrato(String ntipocontrato) {
        Ntipocontrato = ntipocontrato;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
