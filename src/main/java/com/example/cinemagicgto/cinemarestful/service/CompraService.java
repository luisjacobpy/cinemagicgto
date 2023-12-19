package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.dto.CompraRequestDTO;
import com.example.cinemagicgto.cinemarestful.entity.Compra;

import java.math.BigDecimal;
import java.util.List;

public interface CompraService {
    List<Compra> findAllCompras();

    BigDecimal calcularTotalPago(BigDecimal precioBase, BigDecimal precioAsiento);


    void realizarCompra(CompraRequestDTO compraRequestDTO);

}
