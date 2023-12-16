package com.example.cinemagicgto.cinemarestful.data;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "horario")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Horario {
    @Id
    private int horarioID;

    @ManyToOne
    @JoinColumn(name = "peliculaID")
    private Pelicula pelicula;

    private Date fecha;
    private Time horaInicio;
    private String sala;
    private BigDecimal precio;

}
