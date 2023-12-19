package com.example.cinemagicgto.cinemarestful.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "funcion")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Funcion {
    @Id
    @Column(name = "FuncionID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int funcionID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "PeliculaID")
    private Pelicula peliculaID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "HorarioID")
    private Horario horarioID;

    @Column(name = "Clasificacion", nullable = false)
    private String clasificacion;

    @Column(name = "NumAsientosDisponibles", nullable = false)
    private int numAsientosDisponibles;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "SalaID")
    private Horario salaID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "FechaID")
    private Horario fechaID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "HoraInicioID")
    private Horario horaInicioID;

    @Column(name = "CostoFuncion", nullable = false)
    private BigDecimal costoFuncion;

}
