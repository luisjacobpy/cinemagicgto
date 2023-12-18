package com.example.cinemagicgto.cinemarestful.controller;

import com.example.cinemagicgto.cinemarestful.dto.CompraRequestDTO;
import com.example.cinemagicgto.cinemarestful.entity.Compra;
import com.example.cinemagicgto.cinemarestful.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinemaicgto/compra")
public class CompraController {

    @Autowired
    CompraService compraService;



    @PostMapping("/realizar")
    public ResponseEntity<Compra> realizarCompra(@RequestBody CompraRequestDTO compraRequestDTO) {
        Compra compra = compraService.realizarCompra(compraRequestDTO);
        return ResponseEntity.ok(compra);
    }


    @GetMapping("/allCompras")
    public List<Compra> findAllCompras(){
        return compraService.findAllCompras();
    }

//    public ResponseEntity<List<Compra>> findAllCompras() {
//        List<Compra> compras = compraService.findAllCompras();
//        return ResponseEntity.ok(compras);
//    }


}
