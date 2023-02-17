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

    /**
     * Servicio que se encarga de obtener todas las actividades
     * @return lista de actividades
     */
    public ArrayList<ActividadModel> obtenerActividades(){        
      return (ArrayList<ActividadModel>) actividadRepository.findAll();
    }

    /**
     * Servicio que se encarga de guardar una actividad
     * @param actividad actividad a guardar
     * @return actividad guardada
     */
    public ActividadModel guardarActividad(ActividadModel actividad){
        return actividadRepository.save(actividad);
    }

    /**
     * Servicio que se encarga de eliminar una actividad
     * @param id id de la actividad a borrar
     */
    public void eliminarActividad(Long id) {
        actividadRepository.deleteById(id);
    }
    
}
