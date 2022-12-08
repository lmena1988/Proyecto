package com.pinturas.galeria.Tipocontrato.service;

import com.pinturas.galeria.Tipocontrato.model.Tipocontrato;
import com.pinturas.galeria.Tipocontrato.repository.TipocontratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipocontratoServiceImpl implements TipocontratoService {
    @Autowired
    private TipocontratoRepository tipocontratoRepository;

    @Override
    public Tipocontrato saveTipocontrato(Tipocontrato tipocontrato) {
        return tipocontratoRepository.save(tipocontrato);
    }


    @Override
    public List<Tipocontrato> getAllTipocontrato() {
        return tipocontratoRepository.findAll();
    }

    @Override
    public long countTC(){
        return tipocontratoRepository.countTC();
    }
}
