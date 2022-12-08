package com.pinturas.galeria.Usuarios.repository;

import com.pinturas.galeria.Usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Tuple;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    @Query(value = "SELECT * FROM usuario WHERE privilegio=1", nativeQuery = true)
    List<Usuario> buscarPriv(int privilegio);

    List<Usuario> findByPrivilegio(int privilegio);

    @Query(value = "SELECT COUNT(*) as total FROM usuario;", nativeQuery = true)
    public long count();

    @Query(value = "SELECT * FROM usuario WHERE nombres=?1", nativeQuery = true)
    List<Usuario> buscarUsu(String nombres);



    //@Query(value = "SELECT * FROM usuario WHERE username = ?1 and password = ?1", nativeQuery = true)
    //List<Usuario> login(String username, String password);


    @Query(value = "SELECT * FROM usuario u WHERE u.username = ?1 and u.password = ?2", nativeQuery = true)
    List<Usuario> login(
            String username, String password);

}
