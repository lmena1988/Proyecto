package com.pinturas.galeria.Sala.repository;

import com.pinturas.galeria.Sala.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface SalaRepository extends JpaRepository<Sala,Long>{

    @Query(value = "SELECT COUNT(*) as total FROM sala;", nativeQuery = true)
    public long countS();
}
