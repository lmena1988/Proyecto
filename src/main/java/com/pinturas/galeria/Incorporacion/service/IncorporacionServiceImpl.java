package com.pinturas.galeria.Incorporacion.service;

import com.pinturas.galeria.Incorporacion.model.Incorporacion;
import com.pinturas.galeria.Incorporacion.repository.IncorporacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncorporacionServiceImpl implements IncorporacionService {
    @Autowired
    private IncorporacionRepository incorporacionRepository;

    @Override
    public Incorporacion saveIncorporacion(Incorporacion incorporacion) {
        return incorporacionRepository.save(incorporacion);
    }


    @Override
    public List<Incorporacion> getAllIncorporacion() {
        return incorporacionRepository.findAll();
    }

    @Override
    public long countI(){
        return incorporacionRepository.countI();
    }
}
