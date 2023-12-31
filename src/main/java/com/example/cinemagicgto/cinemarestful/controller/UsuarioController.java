package com.example.cinemagicgto.cinemarestful.controller;

import com.example.cinemagicgto.cinemarestful.entity.Usuario;
import com.example.cinemagicgto.cinemarestful.error.UsuarioNotFoundException;
import com.example.cinemagicgto.cinemarestful.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinemagic/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/saveUsuario")
    public Usuario saveUsuario(@RequestBody Usuario usuario){
        return usuarioService.saveUsuario(usuario);
    }

    @PutMapping("/updateUsuario/{id}")
    public Usuario updateUsuario(@PathVariable Integer id, @RequestBody Usuario usuario){
        return usuarioService.updateUsuario(id, usuario);
    }

    @DeleteMapping("/deleteUsuario/{id}")
    public String deleteUsuario(@PathVariable Integer id){
        usuarioService.deleteUsuario(id);
        return "Usuario eliminado con exito";

    }

    // Metodo que devuelve todos los usuarios
    @GetMapping(value = "allUsuarios")
    public List<Usuario> findAllUsuarios(){
        return usuarioService.findAllUsuarios();
    }

    @GetMapping("/findUsuarioById/{id}")
    Usuario findUsuarioById(@PathVariable Integer id) throws UsuarioNotFoundException {
        return usuarioService.findUsuarioById(id);
    }



} // Fin de la clase Usuario Controller
