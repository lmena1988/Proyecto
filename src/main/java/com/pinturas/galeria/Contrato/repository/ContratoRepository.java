package com.pinturas.galeria.Contrato.repository;

import com.pinturas.galeria.Contrato.model.Contrato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ContratoRepository extends JpaRepository<Contrato,Long> {

    @Query(value = "SELECT COUNT(*) FROM contrato;", nativeQuery = true)
    public long countCO();

    @Query(value = "SELECT * FROM contrato;", nativeQuery = true)
    public long q();
}
