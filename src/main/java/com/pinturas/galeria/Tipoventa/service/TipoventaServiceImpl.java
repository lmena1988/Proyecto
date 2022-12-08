package com.pinturas.galeria.Tipoventa.service;

import com.pinturas.galeria.Tipoventa.model.Tipoventa;
import com.pinturas.galeria.Tipoventa.repository.TipoventaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoventaServiceImpl implements TipoventaService {
    @Autowired
    private TipoventaRepository tipoventaRepository;

    @Override
    public Tipoventa saveTipoventa(Tipoventa tipoventa) {
        return tipoventaRepository.save(tipoventa);
    }


    @Override
    public List<Tipoventa> getAllTipoventas() {
        return tipoventaRepository.findAll();
    }

    @Override
    public long countTV(){
        return tipoventaRepository.countTV();
    }
}
