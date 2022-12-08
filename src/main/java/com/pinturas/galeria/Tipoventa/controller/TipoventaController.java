package com.pinturas.galeria.Tipoventa.controller;

import com.pinturas.galeria.Categoria.exception.CategoriaNotFoundException;
import com.pinturas.galeria.Tipoventa.exception.TipoventaNotFoundException;
import com.pinturas.galeria.Tipoventa.model.Tipoventa;
import com.pinturas.galeria.Tipoventa.repository.TipoventaRepository;
import com.pinturas.galeria.Tipoventa.service.TipoventaService;
import com.pinturas.galeria.Usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class TipoventaController {
    @Autowired
    private TipoventaService studentServicee;
    @Autowired
    private TipoventaRepository tipoventaRepository;

    @PostMapping("/Tventa")
    Tipoventa newTipoventa(@RequestBody Tipoventa newTipoventa) {
        return tipoventaRepository.save(newTipoventa);
    }

    @GetMapping("/Tventas")
    List<Tipoventa> getAllTipoventas() {
        return tipoventaRepository.findAll();
    }

    @GetMapping(value="/gettv/{id}")
    Tipoventa getTipoventaById(@PathVariable Long id) {
        return tipoventaRepository.findById(id)
                .orElseThrow(() -> new TipoventaNotFoundException(id));
    }

    @PutMapping(value="/edittv/{id}")
    Tipoventa updateTipoventa(@RequestBody Tipoventa newTipoventa, @PathVariable Long id) {
        return tipoventaRepository.findById(id)
                .map(tipoventa -> {
                    tipoventa.setNtipoventa(newTipoventa.getNtipoventa());
                    tipoventa.setDescripcion(newTipoventa.getDescripcion());
                    return tipoventaRepository.save(tipoventa);
                }).orElseThrow(() -> new TipoventaNotFoundException(id));

    }

    @DeleteMapping(value="/edittv/{id}")
    String deleteUser(@PathVariable Long id){
        if(!tipoventaRepository.existsById(id)){
            throw new CategoriaNotFoundException(id);
        }
        tipoventaRepository.deleteById(id);
        return  "User with id "+id+" has been deleted success.";
    }

    @GetMapping("/TotalTV")
    public long countTV(){
        return studentServicee.countTV();
    }
}
