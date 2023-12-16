package com.example.cinemagicgto.cinemarestful.controller;
import com.example.cinemagicgto.cinemarestful.data.Pelicula;
import com.example.cinemagicgto.cinemarestful.error.PeliculaNotFoundException;
import com.example.cinemagicgto.cinemarestful.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    // Buscar pelicula por id
    @GetMapping("/findPeliculaById/{id}")
    Pelicula findPeliculaById(@PathVariable Long id) throws PeliculaNotFoundException {
        return peliculaService.findPeliculaById(id);
    }

    // Traer todas las peliculas
    @GetMapping(value = "/allPeliculas")
    public List<Pelicula> findAllPeliculas() {
        return peliculaService.findAllPeliculas();

    }

}
