package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.entity.MedioDePago;
import com.example.cinemagicgto.cinemarestful.error.MedioDePagoNotFoundException;

import java.util.List;

public interface MedioDePagoService {

    // Save Medio de pago
    MedioDePago saveMedioDePago(MedioDePago medioDePago);

    // Update Medio de Pago
    MedioDePago updateMedioDePago(Integer id, MedioDePago medioDePago);

    // Metodo para buscar un medio de pago por su Id
    MedioDePago findMedioDePagoId(Integer id) throws MedioDePagoNotFoundException;


    // Get All Medios de Pago
    List<MedioDePago> findAllMediosDePago();


}
