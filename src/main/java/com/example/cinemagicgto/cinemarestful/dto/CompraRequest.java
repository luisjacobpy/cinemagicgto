package com.example.cinemagicgto.cinemarestful.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompraRequest {
    private int horarioID;
    private int asientoID;
    private Timestamp fechaCompra;
    private BigDecimal totalPago;
    private int medioPagoID;

}
