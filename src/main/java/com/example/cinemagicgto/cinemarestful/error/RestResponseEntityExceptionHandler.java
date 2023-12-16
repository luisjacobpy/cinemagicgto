package com.example.cinemagicgto.cinemarestful.error;


import com.example.cinemagicgto.cinemarestful.error.dto.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    /*
     * Maneja las excepciones de tipo LocalNotFoundException.
     * Responde con un mensaje de error personalizado y un código de estado HTTP 404.
     *
     * @param exception La excepción de tipo LocalNotFoundException lanzada.
     * @return ResponseEntity con el código de estado 404 y un cuerpo que contiene el mensaje de error.
     */
    @ExceptionHandler(PeliculaNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorMessage> peliculaNotFoundException(PeliculaNotFoundException exception){
        // Crea un objeto ErrorMessage con el código de estado y el mensaje de la excepción original.
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        // Retorna una respuesta con el código de estado 404 y el cuerpo que contiene el objeto ErrorMessage.
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }

}
