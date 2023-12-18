package com.example.cinemagicgto.cinemarestful.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "resena")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Resena {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int resenaID;

    @ManyToOne
    @JoinColumn(name = "usuarioID")
    private Usuario usuarioID;

    @ManyToOne
    @JoinColumn(name = "peliculaID")
    private Pelicula peliculaID;

    private int calificacion;
    private String comentario;
    private Timestamp fechaResena;
}
