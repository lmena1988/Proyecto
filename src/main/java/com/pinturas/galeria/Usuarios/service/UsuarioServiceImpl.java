package com.pinturas.galeria.Usuarios.service;

import com.pinturas.galeria.Usuarios.exception.UserNotFoundException;
import com.pinturas.galeria.Usuarios.model.Usuario;
import com.pinturas.galeria.Usuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public List<Usuario> buscarPrivilegio3(int privilegio) {
        return usuarioRepository.buscarPriv(privilegio);
    }

    @Override
    public long count(){
        return usuarioRepository.count();
    }

    @Override
    public List<Usuario> buscarUsu(String nombres){
        return usuarioRepository.buscarUsu(nombres);
    }

    @Override
    public List<Usuario> login(String username, String password){return usuarioRepository.login(username, password);}


}
