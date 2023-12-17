package com.example.cinemagicgto.cinemarestful.controller;

import com.example.cinemagicgto.cinemarestful.entity.Usuario;
import com.example.cinemagicgto.cinemarestful.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinemagic/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/saveUsuario")
    public Usuario saveUsuario(@RequestBody Usuario usuario){
        return usuarioService.saveUsuario(usuario);
    }


}
