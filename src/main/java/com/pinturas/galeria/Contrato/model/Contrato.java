package com.pinturas.galeria.Contrato.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pinturas.galeria.Sala.model.Sala;
import com.pinturas.galeria.Tipocontrato.model.Tipocontrato;
import com.pinturas.galeria.Usuarios.model.Usuario;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Contrato")
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Descripcion;
    private String Tipocontrato;
    private String Sala;
    private String Artista;

    private Date Plazo;
    private int Valor;

    public Contrato() {
    }

    public Contrato(Long id, String descripcion, String tipocontrato, String sala, String artista, Date plazo, int valor) {
        this.id = id;
        Descripcion = descripcion;
        Tipocontrato = tipocontrato;
        Sala = sala;
        Artista = artista;
        Plazo = plazo;
        Valor = valor;
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

    public String getTipocontrato() {
        return Tipocontrato;
    }

    public void setTipocontrato(String tipocontrato) {
        Tipocontrato = tipocontrato;
    }

    public String getSala() {
        return Sala;
    }

    public void setSala(String sala) {
        Sala = sala;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }

    public Date getPlazo() {
        return Plazo;
    }

    public void setPlazo(Date plazo) {
        Plazo = plazo;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int valor) {
        Valor = valor;
    }
}
