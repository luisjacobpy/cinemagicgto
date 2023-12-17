package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.entity.Horario;
import com.example.cinemagicgto.cinemarestful.repository.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorarioServiceImp implements HorarioService {

    @Autowired
    HorarioRepository horarioRepository;

    @Override
    public List<Horario> findAllHorarios() {
        return horarioRepository.findAll();
    }
}
