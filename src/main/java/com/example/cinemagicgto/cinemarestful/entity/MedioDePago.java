package com.example.cinemagicgto.cinemarestful.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "medioDePago")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MedioDePago {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int medioPagoID;
    private String nombre;
}
