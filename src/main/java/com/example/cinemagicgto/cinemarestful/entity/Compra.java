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

    @ManyToOne
    @JoinColumn(name = "usuarioID")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "horarioID")
    private Horario horario;

    @ManyToOne
    @JoinColumn(name = "asientoID")
    private Asiento asiento;

    private Timestamp fechaCompra;
    private BigDecimal totalPago;

    @ManyToOne
    @JoinColumn(name = "medioPagoID")
    private MedioDePago medioDePago;

}
