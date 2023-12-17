package com.example.cinemagicgto.cinemarestful.repository;

import com.example.cinemagicgto.cinemarestful.entity.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface HorarioRepository extends JpaRepository<Horario, Integer> {
    //
    @Query("SELECT l FROM horario l WHERE l.date = :date")
    Optional<Horario> findHorarioByDateWhitJPQL;
}
