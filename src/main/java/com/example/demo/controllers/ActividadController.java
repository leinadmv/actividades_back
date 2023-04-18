package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.ActividadModel;
import com.example.demo.services.ActividadService;


@RestController
@RequestMapping("/api/actividades")
public class ActividadController {

    @Autowired
    ActividadService actividadService;


    /**
     * Get encargado de traer todas las actividades
     * @return lista de actividades
     */
    @GetMapping()
    public ArrayList<ActividadModel> obtenerUsuarios(){        
        return actividadService.obtenerActividades();
    }

    /**
     * Post encargado de guardar una actividad
     * @param actividad actividad a guardar
     * @return actividad guardada
     */
    @PostMapping()
    public ActividadModel guardarActividad(@RequestBody ActividadModel actividad){
        return actividadService.guardarActividad(actividad);
    }

    /**
     * Delete encargado de borrar una actividad por su id
     * @param id id de la actividad a eliminar
     * @return status de exito o error
     */
    @DeleteMapping( path = "/{id}")
    public ResponseEntity<Object> eliminarPorId(@PathVariable("id") Long id){
        actividadService.eliminarActividad(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
