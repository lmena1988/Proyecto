package com.pinturas.galeria.Tipopago.service;

import com.pinturas.galeria.Tipopago.model.Tipopago;

import java.util.List;

public interface TipopagoService {

    public Tipopago saveTipopago(Tipopago tipopago);
    public List<Tipopago> getAllTipopago();

    public long countTP();


}
