package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.data.Pelicula;
import com.example.cinemagicgto.cinemarestful.error.PeliculaNotFoundException;
import com.example.cinemagicgto.cinemarestful.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PeliculaServiceImpl implements PeliculaService {
    @Autowired
    private PeliculaRepository peliculaRepository;


    // Buscar todas las peliculas

    @Override
    public List<Pelicula> findAllPeliculas() {
        return peliculaRepository.findAll();

    }

    @Override
    public Pelicula savePelicula(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);


    }

    @Override
    public Pelicula updatePelicula(Long id, Pelicula pelicula)
    {
        Pelicula peliculaDb = peliculaRepository.findById(id).get();
        if(Objects.nonNull(pelicula.getPeliculaID()) && !"".equalsIgnoreCase(String.valueOf(pelicula.getPeliculaID())){
            peliculaDb.setPeliculaID(pelicula.getPeliculaID());
        }
        if(Objects.nonNull(pelicula.getTitulo()) && !"".equalsIgnoreCase(pelicula.getTitulo())){
            peliculaDb.setTitulo(pelicula.getTitulo());
        }

        if(Objects.nonNull(pelicula.getDescripcion()) && !"".equalsIgnoreCase(pelicula.getDescripcion())){
            peliculaDb.setDescripcion(pelicula.getDescripcion());
        }

        if(Objects.nonNull(pelicula.getClasificacion()) && !"".equalsIgnoreCase(pelicula.getClasificacion())){
            peliculaDb.setClasificacion(pelicula.getClasificacion());
        }
        if(Objects.nonNull(pelicula.getDuracion()) && !"".equalsIgnoreCase(String.valueOf(pelicula.getDuracion()))){
            peliculaDb.setDuracion(pelicula.getDuracion());
        }

        if(Objects.nonNull(pelicula.getGenero()) && !"".equalsIgnoreCase(pelicula.getGenero())){
            peliculaDb.setGenero(pelicula.getGenero());
        }
    }

    @Override
    public void deletePelicula(Long id) {

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
