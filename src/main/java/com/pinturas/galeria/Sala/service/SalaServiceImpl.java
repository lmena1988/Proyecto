package com.pinturas.galeria.Sala.service;

import com.pinturas.galeria.Sala.model.Sala;
import com.pinturas.galeria.Sala.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaServiceImpl implements SalaService {
    @Autowired
    private SalaRepository salaRepository;

    @Override
    public Sala saveSala(Sala sala) {
        return salaRepository.save(sala);
    }


    @Override
    public List<Sala> getAllSalas() {
        return salaRepository.findAll();
    }

    @Override
    public long countS(){
        return salaRepository.countS();
    }
}
