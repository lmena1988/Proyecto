package com.pinturas.galeria.Incorporacion.service;

import com.pinturas.galeria.Incorporacion.model.Incorporacion;

import java.util.List;

public interface IncorporacionService {

    public Incorporacion saveIncorporacion(Incorporacion incorporacion);
    public List<Incorporacion> getAllIncorporacion();

    public long countI();


}
