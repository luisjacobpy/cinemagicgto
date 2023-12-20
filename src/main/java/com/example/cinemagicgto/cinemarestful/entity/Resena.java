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

    @Column(name = "Clasificacion", nullable = true, length = 45)
    private int calificacion;

    @Column(name = "Comentario", nullable = true, length = 100)
    private String comentario;

    @Column(name = "FechaResena", nullable = true)
    private Timestamp fechaResena;
}
