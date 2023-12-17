package com.example.cinemagicgto.cinemarestful.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "asientos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Asiento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AsientoID")
    private int asientoID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "HorarioId")
    private Horario horarioID;

    @Column(name = "NumeroAsiento")
    private int numeroAsiento;

    @Column(name = "Disponible")
    private Boolean disponible;

}
