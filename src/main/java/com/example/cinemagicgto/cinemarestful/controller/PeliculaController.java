package com.example.cinemagicgto.cinemarestful.controller;

import com.example.cinemagicgto.cinemarestful.entity.Pelicula;
import com.example.cinemagicgto.cinemarestful.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculaController {

    // Inyectamos nuestro servicio
    @Autowired
    PeliculaService peliculaService;

    // Creamos un metodo que nos devuelve una lista de todas las peliculas
    @GetMapping("/findAllPeliculas")
    public List<Pelicula> findAllPeliculas(){
        return peliculaService.findAllPeliculas();
    }

    @PostMapping("/savePelicula") // Como es un metodo post debe de llavar un Body
    public Pelicula savePelicula(@RequestBody Pelicula pelicula){
        return peliculaService.savePelicula(pelicula);
    }

    @PutMapping("/updatePelicula/{id}")
    public Pelicula updatePelicula(@PathVariable Integer id, @RequestBody Pelicula pelicula){
        return peliculaService.updatePelicula(id, pelicula);

    }

    @DeleteMapping("/deletePelicula/{id}")
    public String deletePelicula(@PathVariable Integer id){
        peliculaService.deletePelicula(id);
        return "Succesfully deleted";


    }


}
