package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.EmpleadoModel;
import com.example.demo.repositories.EmpleadoRepository;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public ArrayList<EmpleadoModel> obtenerEmpleados(){
        return (ArrayList<EmpleadoModel>) empleadoRepository.findAll();
    }
    
}
