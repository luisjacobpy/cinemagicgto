package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.entity.MedioDePago;
import com.example.cinemagicgto.cinemarestful.repository.MedioDePagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedioDePagoServiceImp implements MedioDePagoService{

    @Autowired
    MedioDePagoRepository medioDePagoRepository;

    @Override
    public List<MedioDePago> findAllMediosDePago() {
        return medioDePagoRepository.findAll();
    }
}
