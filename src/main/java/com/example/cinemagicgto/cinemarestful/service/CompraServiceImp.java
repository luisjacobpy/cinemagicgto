package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.dto.CompraRequestDTO;
import com.example.cinemagicgto.cinemarestful.entity.Compra;
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
    public void realizarCompra(CompraRequestDTO compraRequestDTO) {
        // Puedes realizar validaciones y lógica de negocio antes de realizar la compra
        // por ejemplo, verificar la disponibilidad del asiento, la clasificación de la película, etc.

        // Obtener el costo de la función desde Funcion en CompraRequestDTO
        BigDecimal costoFuncion = compraRequestDTO.getCostoFuncion().getCostoFuncion();

        // Calcular el total de la compra
        BigDecimal totalPago = compraRequestDTO.calcularTotalPago(costoFuncion);

        // Crear la entidad de compra
        Compra compra = Compra.builder()
                .usuarioID(compraRequestDTO.getUsuario())
                .titulo(compraRequestDTO.getPelicula())
                .clasificacion(compraRequestDTO.getClasificacionPelicula())
                .horarioID(compraRequestDTO.getHorarioID())
                .asientoID(compraRequestDTO.getNumeroAsiento())
                .fechaCompra(compraRequestDTO.getFechaCompra())
                .totalPago(totalPago)  // Utilizar el total calculado
                .medioDePagoID(compraRequestDTO.getMedioDePagoID())
                .build();

        // Guardar la compra en la base de datos
        compraRepository.save(compra);
    }
}
