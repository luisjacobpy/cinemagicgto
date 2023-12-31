package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.entity.Usuario;
import com.example.cinemagicgto.cinemarestful.error.UsuarioNotFoundException;
import com.example.cinemagicgto.cinemarestful.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UsuarioServiceImp implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAllUsuarios() {
        return usuarioRepository.findAll();
    }

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

    @Override
    public void deleteUsuario(Integer id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario findUsuarioById(Integer id) throws UsuarioNotFoundException {
        // Programamos la logica para le Exception
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if(!usuario.isPresent()){
            throw new UsuarioNotFoundException("Usuario no encontrado revise eL Id y vuelva a intentar");
        }
        // else
        return usuario.get();

    }
}
