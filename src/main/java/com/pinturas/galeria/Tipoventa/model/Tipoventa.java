package com.pinturas.galeria.Tipoventa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tipoventa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Ntipoventa;
    private String Descripcion;

    public Tipoventa() {
    }

    public Tipoventa(String ntipoventa, String descripcion) {
        Ntipoventa = ntipoventa;
        Descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNtipoventa() {
        return Ntipoventa;
    }

    public void setNtipoventa(String ntipoventa) {
        Ntipoventa = ntipoventa;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
