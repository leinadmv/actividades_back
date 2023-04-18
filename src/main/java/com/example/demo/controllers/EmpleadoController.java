package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.EmpleadoModel;
import com.example.demo.services.EmpleadoService;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    
    /**
     * Get encargado de traer la lista de empleados
     * @return lista de empleados
     */
    @GetMapping()
    @ResponseBody()
    public ArrayList<EmpleadoModel> obtenerEmpleados(){
        return empleadoService.obtenerEmpleados();
    } 
}
