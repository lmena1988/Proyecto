package com.pinturas.galeria.Tipoventa.repository;

import com.pinturas.galeria.Tipoventa.model.Tipoventa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface TipoventaRepository extends JpaRepository<Tipoventa,Long>{

    @Query(value = "SELECT COUNT(*) as total FROM tipoventa;", nativeQuery = true)
    public long countTV();
}
