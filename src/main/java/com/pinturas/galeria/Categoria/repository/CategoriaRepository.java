package com.pinturas.galeria.Categoria.repository;

import com.pinturas.galeria.Categoria.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long>{

    @Query(value = "SELECT COUNT(*) as total FROM categoria;", nativeQuery = true)
    public long countCA();
}
