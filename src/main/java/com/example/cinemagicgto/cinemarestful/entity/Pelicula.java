package com.example.cinemagicgto.cinemarestful.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pelicula")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int peliculaID;
    private String titulo; // Nombre de la pelicula
    private String descripcion;
    private String clasificacionPelicula;
    private int duracion;
    private String genero;
}
