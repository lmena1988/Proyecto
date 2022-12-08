package com.pinturas.galeria.Productos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pinturas.galeria.Categoria.model.Categoria;
import com.pinturas.galeria.Precio.model.Precio;
import com.pinturas.galeria.Sala.model.Sala;
import com.pinturas.galeria.Usuarios.model.Usuario;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Blob;
import java.sql.Date;

@Entity
@Table(name = "Producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private Date año;

    private String pintura;
    private String artista;
    private String categoria;
    private int precio;
    private String sala;

    public Producto() {
    }

    public Producto(Long id, String nombres, Date año, String pintura, String artista, String categoria, int precio, String sala) {
        this.id = id;
        this.nombres = nombres;
        this.año = año;
        this.pintura = pintura;
        this.artista = artista;
        this.categoria = categoria;
        this.precio = precio;
        this.sala = sala;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    public String getPintura() {
        return pintura;
    }

    public void setPintura(String pintura) {
        this.pintura = pintura;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
