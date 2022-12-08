package com.pinturas.galeria.Sala.service;

import com.pinturas.galeria.Sala.model.Sala;

import java.util.List;

public interface SalaService {

    public Sala saveSala(Sala sala);
    public List<Sala> getAllSalas();

    public long countS();

}
