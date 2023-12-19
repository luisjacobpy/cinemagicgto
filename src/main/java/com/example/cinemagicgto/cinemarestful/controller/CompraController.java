package com.example.cinemagicgto.cinemarestful.controller;

import com.example.cinemagicgto.cinemarestful.dto.CompraRequestDTO;
import com.example.cinemagicgto.cinemarestful.entity.Compra;
import com.example.cinemagicgto.cinemarestful.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinemaicgto/compra")
public class CompraController {

    @Autowired
    CompraService compraService;



    @PostMapping("/realizarCompra")
    public ResponseEntity<String> realizarCompra(@RequestBody CompraRequestDTO compraRequestDTO) {
        try {
            compraService.realizarCompra(compraRequestDTO);
            return ResponseEntity.ok("Compra realizada exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al procesar la compra: " + e.getMessage());
        }
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
