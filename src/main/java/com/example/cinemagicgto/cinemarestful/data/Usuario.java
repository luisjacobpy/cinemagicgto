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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioID;

    private String nombre;
    private String correo;

    @Enumerated
    private TipoUsuario tipoUsuario;



    // Constructores
    public enum TipoUsuario{
        ADMINISTRADOR,
        CLIENTE
    }

}
