package com.pinturas.galeria.Contrato.service;

import com.pinturas.galeria.Contrato.model.Contrato;

import java.util.List;

public interface ContratoService {

    public Contrato saveContrato(Contrato contrato);
    public List<Contrato> getAllContratos();

    public long countCO();

    public long q();
}
