package com.pinturas.galeria.Usuarios.service;

import com.pinturas.galeria.Usuarios.exception.UserNotFoundException;
import com.pinturas.galeria.Usuarios.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    public Usuario saveUsuario(Usuario usuario);
    public List<Usuario> getAllUsuarios();

    List<Usuario> buscarPrivilegio3(int privilegio);

    public long count();

    List<Usuario> buscarUsu(String nombres);

    public List<Usuario> login(String username, String password);


}
