package com.pinturas.galeria.Precio.service;

import com.pinturas.galeria.Precio.model.Precio;

import java.util.List;

public interface PrecioService {

    public Precio savePrecio(Precio precio);
    public List<Precio> getAllPrecios();


    public long countPrecio();
}
