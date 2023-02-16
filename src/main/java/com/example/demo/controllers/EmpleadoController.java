package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.EmpleadoModel;
import com.example.demo.services.EmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping()
    @ResponseBody()
    public ArrayList<EmpleadoModel> obtenerUsuarios(){
        return empleadoService.obtenerEmpleados();
    } 
}
