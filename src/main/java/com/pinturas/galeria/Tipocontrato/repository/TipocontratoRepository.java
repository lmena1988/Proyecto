package com.pinturas.galeria.Tipocontrato.repository;

import com.pinturas.galeria.Tipocontrato.model.Tipocontrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface TipocontratoRepository extends JpaRepository<Tipocontrato,Long>{

    @Query(value = "SELECT COUNT(*) as total FROM tipocontrato;", nativeQuery = true)
    public long countTC();

}
