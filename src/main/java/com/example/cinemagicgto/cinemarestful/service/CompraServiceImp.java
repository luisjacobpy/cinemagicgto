package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.dto.CompraRequestDTO;
import com.example.cinemagicgto.cinemarestful.entity.Compra;
import com.example.cinemagicgto.cinemarestful.entity.Pelicula;
import com.example.cinemagicgto.cinemarestful.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CompraServiceImp implements CompraService{


    @Autowired
    CompraRepository compraRepository;

    @Override
    public List<Compra> findAllCompras() {
        return compraRepository.findAll();
    }



    @Override
    public BigDecimal calcularTotalPago(BigDecimal precioBase, BigDecimal precioAsiento) {
        // Lógica de cálculo del totalPago
        return precioBase.add(precioAsiento);
    }

    @Override
    public Compra realizarCompra(CompraRequestDTO compraRequest) {
        BigDecimal precioBase = compraRequest.getTitulo().getPrecio();
        BigDecimal precioAsiento = compraRequest.getAsiento().getPrecioAsiento();
        BigDecimal totalPago = calcularTotalPago(precioBase, precioAsiento);

        Compra compra = Compra.builder()
                .usuarioID(compraRequest.getUsuario())
                .titulo(compraRequest.getTitulo())
                .clasificacion(compraRequest.getClasificacion())
                .horarioID(compraRequest.getHorarioID())
                .asientoID(compraRequest.getAsiento())
                .fechaCompra(new Timestamp(System.currentTimeMillis()))
                .totalPago(totalPago)
                .medioDePagoID(compraRequest.getMedioDePagoID())
                .build();

        return compraRepository.save(compra);
    }




}
