package com.pinturas.galeria.Usuarios.controller;

import com.pinturas.galeria.Categoria.exception.CategoriaNotFoundException;
import com.pinturas.galeria.Usuarios.model.Usuario;
import com.pinturas.galeria.Usuarios.exception.UserNotFoundException;

import com.pinturas.galeria.Usuarios.repository.UsuarioRepository;
import com.pinturas.galeria.Usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Tuple;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
public class UsuarioController {


    @Autowired
    private UsuarioService studentService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/usuario")
    Usuario newUsuario(@RequestBody Usuario newUsuario) {
        return usuarioRepository.save(newUsuario);
    }

    @GetMapping("/usuarios")
    List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @GetMapping(value="/get/{id}")
    Usuario getUserById(@PathVariable Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @PutMapping(value="/edit/{id}")
    Usuario updateUser(@RequestBody Usuario newUser, @PathVariable Long id) {
        return usuarioRepository.findById(id)
                .map(user -> {
                    user.setDNI(newUser.getDNI());
                    user.setNombres(newUser.getNombres());
                    user.setApellidos(newUser.getApellidos());
                    user.setTelefono(newUser.getTelefono());
                    user.setDireccion(newUser.getDireccion());
                    user.setUsername(newUser.getUsername());
                    user.setEmail(newUser.getEmail());
                    user.setPassword(newUser.getPassword());
                    user.setPrivilegio(newUser.getPrivilegio());


                    return usuarioRepository.save(user);
                }).orElseThrow(() -> new UserNotFoundException(id));

    }

    @DeleteMapping(value="/edit/{id}")
    String deleteUser(@PathVariable Long id){
        if(!usuarioRepository.existsById(id)){
            throw new CategoriaNotFoundException(id);
        }
        usuarioRepository.deleteById(id);
        return  "User with id "+id+" has been deleted success.";
    }

    @GetMapping("/hola/{privilegio}")
    public List<Usuario> hola(@PathVariable Integer privilegio){
        return studentService.buscarPrivilegio3(privilegio);
    }

    @GetMapping("/Total")
    public long count(){
        return studentService.count();
    }

     @GetMapping("/buscar/{nombres}")
        public List<Usuario> buscar(@PathVariable String nombres){
            return studentService.buscarUsu(nombres);
     }

     @GetMapping("/login/{username}/{password}")
        public List<Usuario> login(@PathVariable String username, @PathVariable String password){return studentService.login(username, password);}


}
