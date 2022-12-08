package com.pinturas.galeria.Productos.service;

import com.pinturas.galeria.Productos.model.Producto;

import com.pinturas.galeria.Productos.repository.ProductoRepository;
import com.pinturas.galeria.Usuarios.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    @Override
    public long countProducto(){
        return productoRepository.countProducto();
    }

    @Override
    public List<Producto> buscarid() {
        return productoRepository.buscarid();
    }
}
