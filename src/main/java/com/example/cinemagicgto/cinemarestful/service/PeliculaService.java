package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.data.Pelicula;
import com.example.cinemagicgto.cinemarestful.error.PeliculaNotFoundException;

import java.util.List;
import java.util.Optional;

public interface PeliculaService {

    // Método para encontrar todas las películas
    List<Pelicula> findAllPeliculas();

    // Busqueda por id, puede devolver un LocalNotFoundException
    Pelicula findPeliculaById(Long id) throws PeliculaNotFoundException;


}
