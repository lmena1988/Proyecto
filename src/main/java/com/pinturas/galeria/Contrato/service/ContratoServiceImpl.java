package com.pinturas.galeria.Contrato.service;

import com.pinturas.galeria.Contrato.model.Contrato;
import com.pinturas.galeria.Contrato.repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratoServiceImpl implements ContratoService {
    @Autowired
    private ContratoRepository contratoRepository;

    @Override
    public Contrato saveContrato(Contrato contrato) {
        return contratoRepository.save(contrato);
    }

    @Override
    public List<Contrato> getAllContratos() {
        return contratoRepository.findAll();
    }

    @Override
    public long countCO(){
        return contratoRepository.countCO();
    }
    @Override
    public long q(){
        return contratoRepository.q();
    }
}
