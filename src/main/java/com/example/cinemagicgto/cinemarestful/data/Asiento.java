package com.example.cinemagicgto.cinemarestful.data;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "asiento")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Asiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AsientoID")
    private int asientoID;

    @ManyToOne
    @JoinColumn(name = "HorarioId")
    private Horario horario;

    @Column(name = "NumeroAsiento")
    private int numeroAsiento;

    @Column(name = "Disponible")
    private Boolean disponible;

}
