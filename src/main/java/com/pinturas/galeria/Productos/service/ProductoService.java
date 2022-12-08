package com.pinturas.galeria.Productos.service;

import com.pinturas.galeria.Productos.model.Producto;
import com.pinturas.galeria.Usuarios.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import java.nio.file.Path;
import java.util.List;

public interface ProductoService {

    public Producto saveProducto(Producto producto);
    public List<Producto> getAllProductos();

    public long countProducto();

    List<Producto> buscarid();

}
