package com.example.cinemagicgto.cinemarestful.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "pelicula")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="PeliculaID", nullable = false)
    private UUID peliculaID;

    @Column(name="Titulo", nullable = false)
    private String titulo; // Nombre de la pelicula

    @Column(name="Descripcion", nullable = false)
    private String descripcion;

    @Column(name="ClasificacionPelicula", nullable = false)
    private String clasificacionPelicula;

    @Column(name="Duracion", nullable = false)
    private int duracion;

    @Column(name="Genero", nullable = false)
    private String genero;
}
