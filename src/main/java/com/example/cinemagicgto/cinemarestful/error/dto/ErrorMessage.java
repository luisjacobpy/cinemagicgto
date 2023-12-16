package com.example.cinemagicgto.cinemarestful.error.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
    // Plantilla a mostrar a la aplicacion cliente
    private HttpStatus status; // Puede ser un internal server error un bad request etc
    private String message; // Mensaje en donde le vamos a indicar que ocurrio dentro del servidor

}
