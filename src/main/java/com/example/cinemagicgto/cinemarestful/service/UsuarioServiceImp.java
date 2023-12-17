package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.entity.Usuario;
import com.example.cinemagicgto.cinemarestful.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;

    // SAVE USUARIO
    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
