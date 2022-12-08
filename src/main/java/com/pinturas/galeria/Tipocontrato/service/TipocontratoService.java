package com.pinturas.galeria.Tipocontrato.service;

import com.pinturas.galeria.Tipocontrato.model.Tipocontrato;

import java.util.List;

public interface TipocontratoService {

    public Tipocontrato saveTipocontrato(Tipocontrato tipocontrato);
    public List<Tipocontrato> getAllTipocontrato();

    public long countTC();

}
