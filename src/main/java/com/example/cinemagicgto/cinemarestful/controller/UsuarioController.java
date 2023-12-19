package com.example.cinemagicgto.cinemarestful.controller;

import com.example.cinemagicgto.cinemarestful.entity.Usuario;
import com.example.cinemagicgto.cinemarestful.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


}
