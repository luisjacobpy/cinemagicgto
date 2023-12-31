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
    @JoinColumn(name = "FechaID")
    private Horario fecha;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "SalaID")
    private Sala sala;

    @Column(name = "Clasificacion", nullable = false)
    private String clasificacion;

    @Column(name = "NumAsientosDisponibles", nullable = false)
    private int numAsientosDisponibles;

    @OneToMany(
            fetch = FetchType.LAZY
            )
    @JoinTable(
            name = "funcion_asientos", // Nombre de la tabla relacional
            joinColumns = @JoinColumn(name = "funcionID"),
            inverseJoinColumns = @JoinColumn(name = "asientoID")
    )
    private List<Asiento> asientos;


    @Column(name = "CostoFuncion", nullable = false)
    private BigDecimal costoFuncion;

}
