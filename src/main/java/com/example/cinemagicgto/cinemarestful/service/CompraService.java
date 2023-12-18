package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.entity.Compra;

import java.util.List;

public interface CompraService {
    List<Compra> findAllCompras();

    Compra realizarCompra(CompraRequest compraRequest);
}
