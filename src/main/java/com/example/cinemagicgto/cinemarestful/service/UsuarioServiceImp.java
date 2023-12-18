package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.entity.Usuario;
import com.example.cinemagicgto.cinemarestful.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UsuarioServiceImp implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;

    // SAVE USUARIO
    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Update Usuario
    @Override
    public Usuario updateUsuario(Integer id, Usuario usuario){
        Usuario usuarioDB = usuarioRepository.findById(id).get();
        // Validacion para no introducir datos Null al actualizar
        if(Objects.nonNull(usuario.getNombre()) && !"".equalsIgnoreCase(usuario.getNombre())){
            usuarioDB.setNombre(usuario.getNombre());
        }
        if(Objects.nonNull(usuario.getCorreo()) && !"".equalsIgnoreCase(usuario.getCorreo())){
            usuarioDB.setCorreo(usuario.getCorreo());
        }
        if(Objects.nonNull(usuario.getTipoUsuario()) && !"".equalsIgnoreCase(String.valueOf(usuario.getTipoUsuario()))){
            usuarioDB.setTipoUsuario(usuario.getTipoUsuario());
        }
        return usuarioRepository.save(usuarioDB);
    }
}
