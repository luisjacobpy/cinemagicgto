package com.example.cinemagicgto.cinemarestful.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Genera los Getters y setters de todos los atributos de la clase
@AllArgsConstructor
@NoArgsConstructor
public class Greeting {
    private long id;
    private String content;
}
