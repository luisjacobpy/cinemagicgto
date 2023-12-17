package com.example.cinemagicgto.cinemarestful.repository;

import com.example.cinemagicgto.cinemarestful.entity.Horario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorarioRepository extends JpaRepository<Horario, Integer> {

//    @Query("SELECT l FROM horario l WHERE l.date = :date")
//    Optional<Horario> findHorarioByDateWhitJPQL;
}
