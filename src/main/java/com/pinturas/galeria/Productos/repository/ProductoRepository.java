package com.pinturas.galeria.Productos.repository;

import com.pinturas.galeria.Productos.model.Producto;
import com.pinturas.galeria.Usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long>{
    @Query(value = "SELECT COUNT(*) as total FROM producto;", nativeQuery = true)
    public long countProducto();

    @Query(value = "SELECT * FROM producto WHERE id=11", nativeQuery = true)
    List<Producto> buscarid();

}
