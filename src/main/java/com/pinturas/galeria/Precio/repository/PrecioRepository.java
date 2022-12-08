package com.pinturas.galeria.Precio.repository;

import com.pinturas.galeria.Precio.model.Precio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface PrecioRepository extends JpaRepository<Precio,Long>{

    @Query(value = "SELECT COUNT(*) as total FROM precio;", nativeQuery = true)
    public long countPrecio();
}
