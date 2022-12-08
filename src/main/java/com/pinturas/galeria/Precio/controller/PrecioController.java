package com.pinturas.galeria.Precio.controller;

import com.pinturas.galeria.Categoria.exception.CategoriaNotFoundException;
import com.pinturas.galeria.Precio.exception.PrecioNotFoundException;
import com.pinturas.galeria.Precio.model.Precio;
import com.pinturas.galeria.Precio.repository.PrecioRepository;
import com.pinturas.galeria.Precio.service.PrecioService;
import com.pinturas.galeria.Tipoventa.service.TipoventaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class PrecioController {

    @Autowired
    private PrecioService studentServicee;
    @Autowired
    private PrecioRepository precioRepository;

    @PostMapping("/precio")
    Precio newPrecio(@RequestBody Precio newPrecio) {
        return precioRepository.save(newPrecio);
    }

    @GetMapping("/precios")
    List<Precio> getAllPrecios() {
        return precioRepository.findAll();
    }

    @GetMapping(value="/getp/{id}")
    Precio getPrecioById(@PathVariable Long id) {
        return precioRepository.findById(id)
                .orElseThrow(() -> new PrecioNotFoundException(id));
    }

    @PutMapping(value="/editp/{id}")
    Precio updatePrecio(@RequestBody Precio newPrecio, @PathVariable Long id) {
        return precioRepository.findById(id)
                .map(precio -> {
                    precio.setValor(newPrecio.getValor());
                    return precioRepository.save(precio);
                }).orElseThrow(() -> new PrecioNotFoundException(id));

    }
    @DeleteMapping(value="/editp/{id}")
    String deleteUser(@PathVariable Long id){
        if(!precioRepository.existsById(id)){
            throw new CategoriaNotFoundException(id);
        }
        precioRepository.deleteById(id);
        return  "User with id "+id+" has been deleted success.";
    }

    @GetMapping("/TotalPrecio")
    public long countPrecio(){
        return studentServicee.countPrecio();
    }

}
