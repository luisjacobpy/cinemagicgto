package com.example.cinemagicgto.cinemarestful.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.security.Timestamp;

@Entity
@Table(name = "compra")
@Data
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

    @ManyToOne
    @JoinColumn(name = "HorarioID")
    private Horario horarioID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "AsientoID")
    private Asiento asientoID;

    @Column(name = "FechaCompra", nullable = false)
    private Timestamp fechaCompra;

    @Column(name = "TotalPago", nullable = false)
    private BigDecimal totalPago;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "MedioPagoID")
    private MedioDePago medioDePago;

}
