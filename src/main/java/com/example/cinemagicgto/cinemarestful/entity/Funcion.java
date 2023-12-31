package com.example.cinemagicgto.cinemarestful.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "funcion")
@Getter
@Setter
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
    private Horario horario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "HoraInicioID")
    private Horario horaInicioID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "FechaID")
    private Horario fecha;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "SalaID")
    private Sala sala;

    @Column(name = "Clasificacion", nullable = false)
    private String clasificacion;

    @Column(name = "NumAsientosDisponibles", nullable = false)
    private int numAsientosDisponibles;

    @OneToMany(mappedBy = "asientos", cascade = CascadeType.ALL)
    private List<Asiento> asientos;

    @Column(name = "CostoFuncion", nullable = false)
    private BigDecimal costoFuncion;

}
