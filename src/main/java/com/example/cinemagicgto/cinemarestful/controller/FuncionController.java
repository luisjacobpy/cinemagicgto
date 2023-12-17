package com.example.cinemagicgto.cinemarestful.controller;

import com.example.cinemagicgto.cinemarestful.entity.Funcion;
import com.example.cinemagicgto.cinemarestful.service.FuncionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/peliculas")
public class FuncionController {

    // Inyectamos Servicio
    @Autowired
    FuncionService funcionService;
    // End Point Ver todas las funciones disponibles
    @GetMapping("/findAllFunciones")
    public List<Funcion> findAllFunciones(){
        return funcionService.findAllFunciones();
    }



}
