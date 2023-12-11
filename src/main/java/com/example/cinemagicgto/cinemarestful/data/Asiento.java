package com.example.cinemagicgto.cinemarestful.data;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "asiento")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Asiento {
}
