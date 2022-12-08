package com.pinturas.galeria.Tipopago.repository;

import com.pinturas.galeria.Tipopago.model.Tipopago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface TipopagoRepository extends JpaRepository<Tipopago,Long>{

    @Query(value = "SELECT COUNT(*) as total FROM tipopago;", nativeQuery = true)
    public long countTP();
}
