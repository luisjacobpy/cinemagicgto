package com.example.cinemagicgto.cinemarestful.dto;

import com.example.cinemagicgto.cinemarestful.entity.*;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompraRequestDTO {
    private Usuario usuario;
    private Pelicula pelicula;
    private Pelicula clasificacionPelicula; // Relacionado al titulo de la pelicula
    private Horario horarioID; // Relacionado class Horario
    private Timestamp fechaCompra;
    private Asiento numeroAsiento;
    private MedioDePago medioDePagoID;

    @ManyToOne
    @JoinColumn(name = "costoFuncion")
    private Funcion costoFuncion;


    // Método para obtener el cálculo del totalPago basado en la lógica del servicio
    public BigDecimal calcularTotalPago(BigDecimal precioBase) {
        // Lógica de cálculo del totalPago
        // Este método puede ser invocado en el servicio al calcular el totalPago
        // Aquí se realiza un cálculo simple para ilustrar el concepto
        BigDecimal precioAsiento = null;
        return precioBase.add(precioAsiento);
    }

}
