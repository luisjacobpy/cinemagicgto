package com.example.cinemagicgto.cinemarestful.dto;

import com.example.cinemagicgto.cinemarestful.entity.*;
import lombok.*;
import java.math.BigDecimal;
import java.security.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompraRequestDTO {
    private Usuario usuario;
    private Pelicula titulo;
    private Pelicula clasificacion; // Relacionado al titulo de la pelicula
    private Horario horarioID; // Relacionado class Horario
    private Timestamp fechaCompra;
    private Asiento asiento;
    private MedioDePago medioDePagoID;
    private Pelicula precioAsiento;

    // Método para obtener el cálculo del totalPago basado en la lógica del servicio
    public BigDecimal calcularTotalPago(BigDecimal precioBase, BigDecimal precioAsiento) {
        // Lógica de cálculo del totalPago
        // Este método puede ser invocado en el servicio al calcular el totalPago
        // Aquí se realiza un cálculo simple para ilustrar el concepto
        return precioBase.add(precioAsiento);
    }

}
