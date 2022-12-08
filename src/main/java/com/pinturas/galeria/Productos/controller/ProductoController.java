package com.pinturas.galeria.Productos.controller;

import com.pinturas.galeria.Productos.exception.ProductNotFoundException;
import com.pinturas.galeria.Productos.service.ProductoService;
import com.pinturas.galeria.Productos.model.Producto;
import com.pinturas.galeria.Productos.repository.ProductoRepository;
import com.pinturas.galeria.Usuarios.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class ProductoController {

    @Autowired
    private ProductoService studentService;
    @Autowired
    private ProductoRepository productoRepository;

    @PostMapping("/producto")
    Producto newPrecio(@RequestBody Producto newProducto) {
        return productoRepository.save(newProducto);
    }

    @GetMapping("/productooos")
    List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    @GetMapping(value="/getP/{id}")
    Producto getProductoById(@PathVariable Long id) {
        return productoRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }

    @PutMapping(value="/editProducto/{id}")
    Producto updateProducto(@RequestBody Producto newUser, @PathVariable Long id) {
        return productoRepository.findById(id)
                .map(user -> {
                    user.setNombres(newUser.getNombres());
                    user.setAño(newUser.getAño());
                    user.setPintura(newUser.getPintura());
                    user.setArtista(newUser.getArtista());
                    user.setCategoria(newUser.getCategoria());
                    user.setPrecio(newUser.getPrecio());
                    user.setSala(newUser.getSala());

                    return productoRepository.save(user);
                }).orElseThrow(() -> new ProductNotFoundException(id));

    }
    @DeleteMapping(value="/deleteproducto/{id}")
    String deleteUser(@PathVariable Long id){
        if(!productoRepository.existsById(id)){
            throw new ProductNotFoundException(id);
        }
        productoRepository.deleteById(id);
        return  "User with id "+id+" has been deleted success.";
    }

    @GetMapping("/TotalProducto")
    public long countProducto(){
        return studentService.countProducto();
    }

    @GetMapping("/busc")
    public List<Producto> hola(){
        return studentService.buscarid();
    }

}
