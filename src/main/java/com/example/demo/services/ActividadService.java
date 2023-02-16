package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ActividadModel;
import com.example.demo.repositories.ActividadRepository;

@Service
public class ActividadService {

    @Autowired
    ActividadRepository actividadRepository;

    public ArrayList<ActividadModel> obtenerActividades(){        
      return (ArrayList<ActividadModel>) actividadRepository.findAll();
    }

    public ActividadModel guardarActividad(ActividadModel actividad){
        return actividadRepository.save(actividad);
    }

    public void eliminarActividad(Long id) {
        actividadRepository.deleteById(id);
    }
    
}
