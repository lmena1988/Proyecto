package com.pinturas.galeria.Tipocontrato.controller;

import com.pinturas.galeria.Categoria.exception.CategoriaNotFoundException;
import com.pinturas.galeria.Tipocontrato.exception.TipocontratoNotFoundException;
import com.pinturas.galeria.Tipocontrato.model.Tipocontrato;
import com.pinturas.galeria.Tipocontrato.repository.TipocontratoRepository;
import com.pinturas.galeria.Tipocontrato.service.TipocontratoService;
import com.pinturas.galeria.Tipoventa.service.TipoventaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class TipocontratoController {

    @Autowired
    private TipocontratoService studentServicee;
    @Autowired
    private TipocontratoRepository tipocontratoRepository;

    @PostMapping("/Tcontrato")
    Tipocontrato newTipocontrato(@RequestBody Tipocontrato newTipocontrato) {
        return tipocontratoRepository.save(newTipocontrato);
    }

    @GetMapping("/Tcontratos")
    List<Tipocontrato> getAllTipocontrato() {
        return tipocontratoRepository.findAll();
    }

    @GetMapping(value="/gettc/{id}")
    Tipocontrato getTipocontratoById(@PathVariable Long id) {
        return tipocontratoRepository.findById(id)
                .orElseThrow(() -> new TipocontratoNotFoundException(id));
    }

    @PutMapping(value="/edittc/{id}")
    Tipocontrato updateTipocontrato(@RequestBody Tipocontrato newTipocontrato, @PathVariable Long id) {
        return tipocontratoRepository.findById(id)
                .map(tipocontrato -> {
                    tipocontrato.setNtipocontrato(newTipocontrato.getNtipocontrato());
                    tipocontrato.setDescripcion(newTipocontrato.getDescripcion());
                    return tipocontratoRepository.save(tipocontrato);
                }).orElseThrow(() -> new TipocontratoNotFoundException(id));

    }
    @DeleteMapping(value="/edittc/{id}")
    String deleteUser(@PathVariable Long id){
        if(!tipocontratoRepository.existsById(id)){
            throw new CategoriaNotFoundException(id);
        }
        tipocontratoRepository.deleteById(id);
        return  "User with id "+id+" has been deleted success.";
    }

    @GetMapping("/TotalTC")
    public long countTC(){
        return studentServicee.countTC();
    }
}
