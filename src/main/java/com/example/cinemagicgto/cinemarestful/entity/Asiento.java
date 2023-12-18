package com.example.cinemagicgto.cinemarestful.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "asientos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Asiento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AsientoID")
    private int asientoID;

    @Column(name = "precioAsiento")
    private BigDecimal precioAsiento;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "HorarioId")
    private Horario horarioID;

    @Column(name = "NumeroAsiento")
    private int numeroAsiento;

    @Column(name = "Disponible")
    private Boolean disponible;
}
