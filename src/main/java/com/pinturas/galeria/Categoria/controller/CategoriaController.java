package com.pinturas.galeria.Categoria.controller;

import com.pinturas.galeria.Categoria.exception.CategoriaNotFoundException;
import com.pinturas.galeria.Categoria.model.Categoria;
import com.pinturas.galeria.Categoria.repository.CategoriaRepository;
import com.pinturas.galeria.Categoria.service.CategoriaService;
import com.pinturas.galeria.Tipoventa.service.TipoventaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class CategoriaController {

    @Autowired
    private CategoriaService studentServicee;
    @Autowired
    private CategoriaRepository categoriaRepository;

    @PostMapping("/categoria")
    Categoria newCategoria(@RequestBody Categoria newCategoria) {
        return categoriaRepository.save(newCategoria);
    }

    @GetMapping("/categorias")
    List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    @GetMapping("/editt/{id}")
    Categoria getCatById(@PathVariable Long id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new CategoriaNotFoundException(id));
    }

    @PutMapping("/editt/{id}")
    Categoria updateCat(@RequestBody Categoria newCat, @PathVariable Long id) {
        return categoriaRepository.findById(id)
                .map(cat -> {
                    cat.setNcategoria(newCat.getNcategoria());
                    cat.setDescripcion(newCat.getDescripcion());
                    return categoriaRepository.save(cat);
                }).orElseThrow(() -> new CategoriaNotFoundException(id));

    }
    @DeleteMapping("/editt/{id}")
    String deleteUser(@PathVariable Long id){
        if(!categoriaRepository.existsById(id)){
            throw new CategoriaNotFoundException(id);
        }
        categoriaRepository.deleteById(id);
        return  "User with id "+id+" has been deleted success.";
    }

    @GetMapping("/TotalCA")
    public long countCA(){
        return studentServicee.countCA();
    }


}
