package com.example.cinemagicgto.cinemarestful.entity;


import jakarta.persistence.*;
import lombok.*;

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
    private int asientoID; // Numero de asiento

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FuncionID")
    private Funcion funcionID;


    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "HorarioId")
    private Horario horarioID;

    @Column(name = "NumeroAsiento")
    private int numeroAsiento;

    @Column(name = "Disponible")
    private Boolean disponible; // Indica si el asiento esta disponible o no
}
