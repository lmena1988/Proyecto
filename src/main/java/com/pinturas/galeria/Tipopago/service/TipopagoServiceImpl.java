package com.pinturas.galeria.Tipopago.service;

import com.pinturas.galeria.Tipopago.model.Tipopago;
import com.pinturas.galeria.Tipopago.repository.TipopagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipopagoServiceImpl implements TipopagoService {
    @Autowired
    private TipopagoRepository tipopagoRepository;

    @Override
    public Tipopago saveTipopago(Tipopago tipopago) {
        return tipopagoRepository.save(tipopago);
    }


    @Override
    public List<Tipopago> getAllTipopago() {
        return tipopagoRepository.findAll();
    }

    @Override
    public long countTP(){
        return tipopagoRepository.countTP();
    }
}
