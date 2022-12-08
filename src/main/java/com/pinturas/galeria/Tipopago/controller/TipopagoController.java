package com.pinturas.galeria.Tipopago.controller;

import com.pinturas.galeria.Categoria.exception.CategoriaNotFoundException;
import com.pinturas.galeria.Tipopago.exception.TipopagoNotFoundException;
import com.pinturas.galeria.Tipopago.model.Tipopago;
import com.pinturas.galeria.Tipopago.repository.TipopagoRepository;
import com.pinturas.galeria.Tipopago.service.TipopagoService;
import com.pinturas.galeria.Tipoventa.service.TipoventaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class TipopagoController {

    @Autowired
    private TipopagoService studentServicee;

    @Autowired
    private TipopagoRepository tipopagoRepository;

    @PostMapping("/Tpago")
    Tipopago newTipopago(@RequestBody Tipopago newTipopago) {
        return tipopagoRepository.save(newTipopago);
    }

    @GetMapping("/Tpagos")
    List<Tipopago> getAllTipopago() {
        return tipopagoRepository.findAll();
    }

    @GetMapping(value="/gettp/{id}")
    Tipopago getTipopagoById(@PathVariable Long id) {
        return tipopagoRepository.findById(id)
                .orElseThrow(() -> new TipopagoNotFoundException(id));
    }

    @PutMapping(value="/edittp/{id}")
    Tipopago updateTipopago(@RequestBody Tipopago newTipopago, @PathVariable Long id) {
        return tipopagoRepository.findById(id)
                .map(tipopago -> {
                    tipopago.setNtipopago(newTipopago.getNtipopago());
                    tipopago.setDescripcion(newTipopago.getDescripcion());
                    return tipopagoRepository.save(tipopago);
                }).orElseThrow(() -> new TipopagoNotFoundException(id));

    }
    @DeleteMapping(value="/edittp/{id}")
    String deleteUser(@PathVariable Long id){
        if(!tipopagoRepository.existsById(id)){
            throw new CategoriaNotFoundException(id);
        }
        tipopagoRepository.deleteById(id);
        return  "User with id "+id+" has been deleted success.";
    }

    @GetMapping("/TotalTP")
    public long countTP(){
        return studentServicee.countTP();
    }
}
