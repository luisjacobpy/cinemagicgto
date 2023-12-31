package com.example.cinemagicgto.cinemarestful.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "compra")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int compraID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "UsuarioID")
    private Usuario usuarioID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "titulo")
    private Pelicula titulo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "clasificacion")
    private Pelicula clasificacion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "HorarioID")
    private Horario horarioID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "AsientoID")
    private Asiento asientoID;

    @Column(name = "FechaCompra", nullable = false)
    private LocalDateTime fechaCompra;

    @Column(name = "TotalPago", nullable = false)
    private BigDecimal totalPago;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "MedioPagoID")
    private MedioDePago medioDePagoID;
}