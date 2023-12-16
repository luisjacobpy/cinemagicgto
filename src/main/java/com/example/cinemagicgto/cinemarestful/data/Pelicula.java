package com.example.cinemagicgto.cinemarestful.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private Long peliculaID;
    private String titulo;
    private String descripcion;
    private String clasificacion;
    private int duracion;
    private String genero;

}
