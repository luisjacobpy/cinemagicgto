package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.entity.Pelicula;
import com.example.cinemagicgto.cinemarestful.error.PeliculaNotFoundException;

import java.util.List;

public interface PeliculaService {

    // Método para encontrar todas las películas
    List<Pelicula> findAllPeliculas();

    // Save Pelicula
    Pelicula savePelicula(Pelicula pelicula);

    // Update Pelicula
    Pelicula updatePelicula(Integer id, Pelicula pelicula);

    // Delete Pelicula
    void deletePelicula(Integer id);



    // Busqueda por id, puede devolver un LocalNotFoundException
    Pelicula findPeliculaById(Long id) throws PeliculaNotFoundException;



}
