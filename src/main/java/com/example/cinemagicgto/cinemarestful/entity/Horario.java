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

    @ManyToOne
    @JoinColumn(name = "peliculaID")
    private Pelicula pelicula;

    private Date fecha;
    private Time horaInicio;
    private String sala;
    private BigDecimal precio;

    @OneToMany(mappedBy = "horarioID", cascade = CascadeType.ALL)
    private List<Asiento> asientos;

    public List<Asiento> getAsientos() {
        return asientos;
    }
}
