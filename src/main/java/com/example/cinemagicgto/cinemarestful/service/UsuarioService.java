package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.entity.Usuario;
import com.example.cinemagicgto.cinemarestful.error.UsuarioNotFoundException;

import java.util.List;

public interface UsuarioService {

    // Save Usuario
    Usuario saveUsuario(Usuario usuario);

    // Update Usuario
    Usuario updateUsuario(Integer id, Usuario usuario);

    // Get All Usuarios
    List<Usuario> findAllUsuarios();

    // Metodo para borrar un Usuario por su Id
    void deleteUsuario(Integer id);

    // Metodo para buscar un usuario por su ID
    Usuario findUsuarioById(Integer id) throws UsuarioNotFoundException;




}
