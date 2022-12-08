package com.pinturas.galeria.Incorporacion.controller;

import com.pinturas.galeria.Categoria.exception.CategoriaNotFoundException;
import com.pinturas.galeria.Incorporacion.exception.IncorporacionNotFoundException;
import com.pinturas.galeria.Incorporacion.model.Incorporacion;
import com.pinturas.galeria.Incorporacion.repository.IncorporacionRepository;
import com.pinturas.galeria.Incorporacion.service.IncorporacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class IncorporacionController {

    @Autowired
    private IncorporacionService studentService;
    @Autowired
    private IncorporacionRepository incorporacionRepository;

    @PostMapping("/Incorporacion")
    Incorporacion newIncorporacion(@RequestBody Incorporacion newIncorporacion) {
        return incorporacionRepository.save(newIncorporacion);
    }

    @GetMapping("/Incorporaciones")
    List<Incorporacion> getAllIncorporacion() {
        return incorporacionRepository.findAll();
    }

    @GetMapping(value="/geti/{id}")
    Incorporacion getIncorporacionById(@PathVariable Long id) {
        return incorporacionRepository.findById(id)
                .orElseThrow(() -> new IncorporacionNotFoundException(id));
    }

    @PutMapping(value="/editi/{id}")
    Incorporacion updateIncorporacion(@RequestBody Incorporacion newIncorporacion, @PathVariable Long id) {
        return incorporacionRepository.findById(id)
                .map(incorporacion -> {
                    incorporacion.setDescripcion(newIncorporacion.getDescripcion());
                    incorporacion.setVincorporacion(newIncorporacion.getVincorporacion());
                    incorporacion.setArtistai(newIncorporacion.getArtistai());
                    return incorporacionRepository.save(incorporacion);
                }).orElseThrow(() -> new IncorporacionNotFoundException(id));

    }
    @DeleteMapping(value="/editi/{id}")
    String deleteUser(@PathVariable Long id){
        if(!incorporacionRepository.existsById(id)){
            throw new CategoriaNotFoundException(id);
        }
        incorporacionRepository.deleteById(id);
        return  "User with id "+id+" has been deleted success.";
    }

    @GetMapping("/TotalI")
    public long countI(){
        return studentService.countI();
    }
}
