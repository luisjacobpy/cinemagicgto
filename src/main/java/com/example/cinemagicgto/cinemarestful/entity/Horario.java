package com.example.cinemagicgto.cinemarestful.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "horario")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Horario {
    /*
    * Esta entidad controla
    * Las fechas
    * Horas de inicio con base en la fecha
    * SalaID
    * */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int horarioID;

    @ManyToMany(fetch = FetchType.LAZY) // Una pelicula puede tener muchos horarios
    @JoinTable(
            name = "horario_pelicula_relacion", // Nombre de la tabla relacional
            joinColumns = @JoinColumn(name = "horarioID"),
            inverseJoinColumns = @JoinColumn(name = "Titulo")
    )
    private List<Pelicula> peliculas; // Revisa las peliculas disponibles por horario


    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @OneToMany(mappedBy = "horario", cascade = CascadeType.ALL)
    private List<Funcion> funciones;

    @ManyToMany(mappedBy = "horarios", cascade = CascadeType.ALL)
    private List<Sala> salas;


}
