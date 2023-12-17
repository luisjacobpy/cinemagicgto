package com.example.cinemagicgto.cinemarestful.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "funcion")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Funcion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int funcionID;

    @ManyToOne
    @JoinColumn(name = "peliculaID")
    private Pelicula pelicula;

    @ManyToOne
    @JoinColumn(name = "horarioID")
    private Horario horario;

    private String clasificacion;
    private int numAsientosDisponibles;
}
