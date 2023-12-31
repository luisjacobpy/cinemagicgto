package com.example.cinemagicgto.cinemarestful.controller;


import com.example.cinemagicgto.cinemarestful.entity.MedioDePago;
import com.example.cinemagicgto.cinemarestful.service.MedioDePagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/peliculas")
public class MedioDePagoController {

    @Autowired
    MedioDePagoService medioDePagoService;

    @GetMapping("/allMediosDePago")
    public List<MedioDePago> findAllMediosDePago(){
        return medioDePagoService.findAllMediosDePago();
    }

    // Registrar un nuevo medio de pago



}
