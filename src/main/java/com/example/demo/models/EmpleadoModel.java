package com.example.demo.models;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name = "empleado")
public class EmpleadoModel {

    /**
     * identificador de la tabla empleado
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    /**
     * nombre del empleado
     */
    @Column(nullable = false)
    private String nombre;
    /**
     * apellido del empleado
     */
    @Column(nullable = false)
    private String apellido;
    /**
     * documento del empleado
     */
    @Column(nullable = false)
    private String documento;
    /**
     * nombre de usuario para el logueo
     */
    private String usuario;
    /**
     * password del usuario
     */
    private String password;

    /**
     * relacion de uno a muchos con la tabla actividades
     */
    @JsonIgnore
    @OneToMany(mappedBy = "empleado")
    private List<ActividadModel> actividades;

    
}