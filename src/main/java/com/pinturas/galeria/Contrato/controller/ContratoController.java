package com.pinturas.galeria.Contrato.controller;

import com.pinturas.galeria.Categoria.exception.CategoriaNotFoundException;
import com.pinturas.galeria.Contrato.exception.ContratoNotFoundException;
import com.pinturas.galeria.Contrato.model.Contrato;
import com.pinturas.galeria.Contrato.repository.ContratoRepository;
import com.pinturas.galeria.Contrato.service.ContratoService;
import com.pinturas.galeria.Tipoventa.service.TipoventaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class ContratoController {



    @Autowired
    private ContratoService studentService;

    @Autowired
    private ContratoRepository contratoRepository;

    @PostMapping("/contrato")
    Contrato newUsuario(@RequestBody Contrato newContrato) {
        return contratoRepository.save(newContrato);
    }

    @GetMapping("/contratos")
    List<Contrato> getAllContratos() {
        return contratoRepository.findAll();
    }

    @GetMapping(value="/getc/{id}")
    Contrato getContratoById(@PathVariable Long id) {
        return contratoRepository.findById(id)
                .orElseThrow(() -> new ContratoNotFoundException(id));
    }

    @PutMapping(value="/editc/{id}")
    Contrato updateContrato(@RequestBody Contrato newUser, @PathVariable Long id) {
        return contratoRepository.findById(id)
                .map(user -> {
                    user.setDescripcion(newUser.getDescripcion());
                    user.setTipocontrato(newUser.getTipocontrato());
                    user.setSala(newUser.getSala());
                    user.setArtista(newUser.getArtista());
                    user.setPlazo(newUser.getPlazo());
                    user.setValor(newUser.getValor());



                    return contratoRepository.save(user);
                }).orElseThrow(() -> new ContratoNotFoundException(id));

    }
    @DeleteMapping(value="/editc/{id}")
    String deleteUser(@PathVariable Long id){
        if(!contratoRepository.existsById(id)){
            throw new CategoriaNotFoundException(id);
        }
        contratoRepository.deleteById(id);
        return  "User with id "+id+" has been deleted success.";
    }

    @GetMapping("/TotalCO")
    public long countCO(){
        return studentService.countCO();
    }

    @GetMapping("/q")
    public long q(){
        return studentService.q();
    }
}
