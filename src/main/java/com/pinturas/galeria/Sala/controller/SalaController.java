package com.pinturas.galeria.Sala.controller;

import com.pinturas.galeria.Categoria.exception.CategoriaNotFoundException;
import com.pinturas.galeria.Sala.exception.SalaNotFoundException;
import com.pinturas.galeria.Sala.model.Sala;
import com.pinturas.galeria.Sala.repository.SalaRepository;
import com.pinturas.galeria.Sala.service.SalaService;
import com.pinturas.galeria.Tipoventa.service.TipoventaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class SalaController {

    @Autowired
    private SalaService studentServicee;
    @Autowired
    private SalaRepository salaRepository;

    @PostMapping("/sala")
    Sala newSala(@RequestBody Sala newSala) {
        return salaRepository.save(newSala);
    }

    @GetMapping("/salas")
    List<Sala> getAllSalas() {
        return salaRepository.findAll();
    }

    @GetMapping(value="/gets/{id}")
    Sala getSalaById(@PathVariable Long id) {
        return salaRepository.findById(id)
                .orElseThrow(() -> new SalaNotFoundException(id));
    }

    @PutMapping(value="/edits/{id}")
    Sala updateSala(@RequestBody Sala newSala, @PathVariable Long id) {
        return salaRepository.findById(id)
                .map(sala -> {
                    sala.setNsala(newSala.getNsala());
                    sala.setDescripcion(newSala.getDescripcion());
                    return salaRepository.save(sala);
                }).orElseThrow(() -> new SalaNotFoundException(id));

    }
    @DeleteMapping(value="/edits/{id}")
    String deleteUser(@PathVariable Long id){
        if(!salaRepository.existsById(id)){
            throw new CategoriaNotFoundException(id);
        }
        salaRepository.deleteById(id);
        return  "User with id "+id+" has been deleted success.";
    }

    @GetMapping("/TotalS")
    public long countS(){
        return studentServicee.countS();
    }
}
