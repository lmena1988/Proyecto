package com.pinturas.galeria.Tipopago.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tipopago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Ntipopago;
    private String Descripcion;

    public Tipopago() {
    }

    public Tipopago(String ntipopago, String descripcion) {
        Ntipopago = ntipopago;
        Descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNtipopago() {
        return Ntipopago;
    }

    public void setNtipopago(String ntipopago) {
        Ntipopago = ntipopago;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
