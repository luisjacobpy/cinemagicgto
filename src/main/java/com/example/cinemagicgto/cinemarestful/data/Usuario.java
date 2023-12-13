package com.example.cinemagicgto.cinemarestful.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {

    @Id
    private int usuarioID;
    private String nombre;

    @Enumerated(EnumType.STRING)
    private String tipoUsuario;

}
