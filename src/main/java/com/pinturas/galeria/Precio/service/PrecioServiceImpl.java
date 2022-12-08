package com.pinturas.galeria.Precio.service;

import com.pinturas.galeria.Precio.model.Precio;
import com.pinturas.galeria.Precio.repository.PrecioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrecioServiceImpl implements PrecioService {
    @Autowired
    private PrecioRepository precioRepository;

    @Override
    public Precio savePrecio(Precio precio) {
        return precioRepository.save(precio);
    }


    @Override
    public List<Precio> getAllPrecios() {
        return precioRepository.findAll();
    }

    @Override
    public long countPrecio(){
        return precioRepository.countPrecio();
    }

}
