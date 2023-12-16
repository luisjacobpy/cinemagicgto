package com.example.cinemagicgto.cinemarestful.controller;

import com.example.cinemagicgto.cinemarestful.data.Pelicula;
import com.example.cinemagicgto.cinemarestful.error.PeliculaNotFoundException;
import com.example.cinemagicgto.cinemarestful.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

//@Validated
@RestController
public class PeliculaController {

    @Autowired
    PeliculaService peliculaService;

    @PostMapping("/savePelicula")
    public Pelicula guardarPelicula(@Valid @RequestBody  PeliculaDTO peliculaDTO) {
        return peliculaService.guardarPelicula(peliculaDTO);
    }


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
