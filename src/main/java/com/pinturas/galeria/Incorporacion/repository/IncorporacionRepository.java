package com.pinturas.galeria.Incorporacion.repository;

import com.pinturas.galeria.Incorporacion.model.Incorporacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface IncorporacionRepository extends JpaRepository<Incorporacion,Long>{

    @Query(value = "SELECT COUNT(*) as total FROM incorporacion;", nativeQuery = true)
    public long countI();
}
