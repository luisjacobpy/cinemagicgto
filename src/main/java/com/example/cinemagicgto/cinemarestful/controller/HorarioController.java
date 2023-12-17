package com.example.cinemagicgto.cinemarestful.controller;

import com.example.cinemagicgto.cinemarestful.entity.Horario;
import com.example.cinemagicgto.cinemarestful.service.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/peliculas")
public class HorarioController {

    @Autowired
    HorarioService horarioService;

    // Metodo que devuelve todos los horarios
    @GetMapping("/findAllHorarios")
    public List<Horario> findAllHorarios(){
        return horarioService.findAllHorarios();
    }
    // Endpoint para administradores

    // Actualizar horarios de funciones

}
