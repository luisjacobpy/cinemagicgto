package com.example.cinemagicgto.cinemarestful.service;

import com.example.cinemagicgto.cinemarestful.entity.MedioDePago;
import com.example.cinemagicgto.cinemarestful.error.MedioDePagoNotFoundException;
import com.example.cinemagicgto.cinemarestful.repository.MedioDePagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class MedioDePagoServiceImp implements MedioDePagoService{

    @Autowired
    MedioDePagoRepository medioDePagoRepository;

    @Override
    public MedioDePago saveMedioDePago(MedioDePago medioDePago) {
        return medioDePagoRepository.save(medioDePago);
    }

    @Override
    public MedioDePago updateMedioDePago(Integer id, MedioDePago medioDePago) {
        MedioDePago medioDePagoDB = medioDePagoRepository.findById(id).get(); // Traemos el registro de la base de datos
        // Validacion para no inroducir datos Null o vacios al actualizar
        if(Objects.nonNull(medioDePago.getNombre()) && !"".equalsIgnoreCase(medioDePago.getNombre())){
            medioDePagoDB.setNombre(medioDePago.getNombre());
        }
        if(Objects.nonNull(medioDePago.getInstitucionBancariaAsociada()) && !"".equalsIgnoreCase(medioDePago.getInstitucionBancariaAsociada())){
            medioDePagoDB.setInstitucionBancariaAsociada(medioDePago.getInstitucionBancariaAsociada());
        }
        return medioDePagoRepository.save(medioDePagoDB);
    }

    @Override
    public MedioDePago findMedioDePagoId(Integer id) throws MedioDePagoNotFoundException {
        Optional<MedioDePago> medioDePago = medioDePagoRepository.findById(id);
        if(!medioDePago.isPresent()){
            throw new MedioDePagoNotFoundException("Medio de pago No encontrado");
        }
        // else
        return  medioDePago.get();
    }

    @Override
    public List<MedioDePago> findAllMediosDePago() {
        return medioDePagoRepository.findAll();
    }
}
