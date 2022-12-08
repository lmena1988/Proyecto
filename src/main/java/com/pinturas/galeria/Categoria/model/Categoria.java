package com.pinturas.galeria.Categoria.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Ncategoria;
    private String Descripcion;

    public Categoria() {
    }

    public Categoria(String ncategoria, String descripcion) {
        Ncategoria = ncategoria;
        Descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNcategoria() {
        return Ncategoria;
    }

    public void setNcategoria(String ncategoria) {
        Ncategoria = ncategoria;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
