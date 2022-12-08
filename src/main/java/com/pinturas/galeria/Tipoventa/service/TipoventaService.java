package com.pinturas.galeria.Tipoventa.service;

import com.pinturas.galeria.Tipoventa.model.Tipoventa;

import java.util.List;

public interface TipoventaService {

    public Tipoventa saveTipoventa(Tipoventa tipoventa);
    public List<Tipoventa> getAllTipoventas();

    public long countTV();

}
