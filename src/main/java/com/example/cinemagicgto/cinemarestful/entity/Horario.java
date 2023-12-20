package com.example.cinemagicgto.cinemarestful.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "horario")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int horarioID;

    @ManyToMany // Una pelicula puede tener muchos horarios
    @JoinColumn(name = "peliculaID")
    private Pelicula pelicula;

    private Date fecha;

    @OneToOne // Una funcion puede tener un horario
    @JoinColumn(name = "HoraInicioID")
    private Funcion horaInicio;

    @OneToMany
    @JoinColumn(name = "SalaID")
    private Funcion salaID;

    @OneToMany(mappedBy = "horarioID", cascade = CascadeType.ALL)
    private List<Asiento> asientos;

    public List<Asiento> getAsientos() {
        return asientos;
    }
}
