package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.entity.Compra;
import com.example.cinemagicgto.cinemarestful.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraServiceImp implements CompraService{

    @Autowired
    CompraRepository compraRepository;
    @Override
    public List<Compra> findAllCompras() {
        return compraRepository.findAll();
    }
}
