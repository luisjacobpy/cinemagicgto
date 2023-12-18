package com.example.cinemagicgto.cinemarestful.controller;

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
    public ResponseEntity<String> realizarCompra(@RequestBody CompraRequest compraRequest){

        // Realizar compra
        Compra compra = compraService.realizarCompra(compraRequest);
        // Crear un mensaje de confirmacion
        String mensajeConfirmacion = "¡Compra realizada con éxito!\n" +
                                    "Detalles de la compra:\n" +
                                    "ID de compra: " + compra.getCompraID() + "\n" +
                                    "Fecha de compra: " + compra.getFechaCompra() + "\n" +
                                    "Total pagado: " + compra.getTotalPago();
        // Devuelve una respuesta con el mensaje de confirmacion
        return new ResponseEntity<>(mensajeConfirmacion, HttpStatus.OK);

    }

    @GetMapping("/allCompras")
    public List<Compra> findAllCompras(){
        return compraService.findAllCompras();
    }

}
