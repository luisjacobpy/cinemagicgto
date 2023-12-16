package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.data.Pelicula;
import com.example.cinemagicgto.cinemarestful.error.PeliculaNotFoundException;
import com.example.cinemagicgto.cinemarestful.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PeliculaServiceImpl implements PeliculaService {
    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> findAllPeliculas() {
        return peliculaRepository.findAll();

    }

    @Override
    public Pelicula findPeliculaById(Long id) throws PeliculaNotFoundException {
        //Logica de la Excepcion
        Optional<Pelicula> pelicula = peliculaRepository.findById(id);
        if(!pelicula.isPresent()){ // Si el valor es Null
            throw new PeliculaNotFoundException("Pelicula No encontrada Intenta con otro ID");
        }
        // else
        return pelicula.get();

    }

} // Fin de class PeliculaServiceImpl
