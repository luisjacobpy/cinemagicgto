package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.entity.Funcion;
import com.example.cinemagicgto.cinemarestful.repository.FuncionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionServiceImp implements FuncionService {

    @Autowired // Inyectamos el repositorio para la inversion de control
    FuncionRepository funcionRepository;

    @Override
    public List<Funcion> findAllFunciones(){
        return funcionRepository.findAll();

    }

}
