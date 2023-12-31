package com.example.cinemagicgto.cinemarestful.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "Salas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @Column(name = "NombreSala", nullable = false)
    private String nombreSala;

    // Usa sala pude tener muchos Horarios
    @ManyToMany(
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "sala_horario", // Nombre de la tabla relacional
            joinColumns = @JoinColumn(name = "sala_uuid"),
            inverseJoinColumns = @JoinColumn (name = "horario_id")

    )
    private Set<Horario> horarios; // Con el uso de Set evitamos generar duplicados

}
