package com.example.cinemagicgto.cinemarestful.controller;

import com.example.cinemagicgto.cinemarestful.data.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s"; // End Point Dinamico
    private final AtomicLong counter = new AtomicLong(); // Permite simular IDs unicos

    // Metodo
    @GetMapping("/greeting") // Define un endpoint, para acceder a este recurso la peticion debe de ser de tipo Get
    public Greeting helloWorld(@RequestParam(value="name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));

    }

}
