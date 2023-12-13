package com.example.cinemagicgto.cinemarestful.repository;

import com.example.cinemagicgto.cinemarestful.data.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PeliculaRepository  extends JpaRepository<Pelicula, Integer> {

    @Query(value = """
            SELECT c FROM Pelicula c
            """)
    List<Pelicula> findAllPeliculas();
}
