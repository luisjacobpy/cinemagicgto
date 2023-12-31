package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.entity.Pelicula;
import com.example.cinemagicgto.cinemarestful.error.PeliculaNotFoundException;
import com.example.cinemagicgto.cinemarestful.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PeliculaServiceImpl implements PeliculaService{

    @Autowired // Para que Spring Boot Inyecte el Repositorio
    PeliculaRepository peliculaRepository;


    @Override
    public List<Pelicula> findAllPeliculas() {
        return peliculaRepository.findAll();
    }

    // SAVE / Guardar
    @Override
    public Pelicula savePelicula(Pelicula pelicula) {

        return peliculaRepository.save(pelicula);
    }

    // UPDATE / ACTUALIZAR
    @Override
    public Pelicula updatePelicula(Integer id, Pelicula pelicula) {
        Pelicula peliculaDB = peliculaRepository.findById(id).get(); // Nos traemos el registro de la base de datos
        // Validacion para no introducir datos null o vacios al actualizar

        if(Objects.nonNull(pelicula.getTitulo()) && !"".equalsIgnoreCase(pelicula.getTitulo())){
            peliculaDB.setTitulo(pelicula.getTitulo());
        }

        if(Objects.nonNull(pelicula.getDescripcion()) && !"".equalsIgnoreCase(pelicula.getDescripcion())){
            peliculaDB.setDescripcion(pelicula.getDescripcion());
        }

        if(Objects.nonNull(pelicula.getDuracion()) && !"".equalsIgnoreCase(String.valueOf(pelicula.getDuracion()))){
            peliculaDB.setDuracion(pelicula.getDuracion());
        }

        if(Objects.nonNull(pelicula.getGenero()) && !"".equalsIgnoreCase(pelicula.getGenero())){
            peliculaDB.setGenero(pelicula.getGenero());
        }

        return peliculaRepository.save(peliculaDB);
    }

    // DELETE / BORRAR
    @Override
    public void deletePelicula(Integer id) {
        peliculaRepository.deleteById(id);

    }


    // FIND BY ID
    @Override
    public Pelicula findPeliculaById(Integer id) throws PeliculaNotFoundException {
        //  Programammos la logica para la Excepcion
        Optional<Pelicula> pelicula = peliculaRepository.findById(id);
        if(!pelicula.isPresent()){
            throw new PeliculaNotFoundException("Pelicula no encontrada con ese ID");
        }
        // Else
        return pelicula.get();
    }



}
