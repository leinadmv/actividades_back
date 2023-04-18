package com.example.demo.models;

import java.sql.Timestamp;

import javax.persistence.*;

import lombok.Data;
 

@Entity
@Data
@Table(name = "actividades")
public class ActividadModel {
    
    /**
     * identificador de la tabla
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    /**
     * nombre de la actividad
     */
    @Column(nullable = false)
    private String nombre;
    /**
     * descripcion de la actividad
     */
    @Column(nullable = false)
    private String descripcion;
    /**
     * fecha estimada de finalizacion de la actividad
     */
    @Column(nullable = false)
    private Timestamp fechaEstimada;
    /**
     * estado de la actividad boolean donde
     * 1 realizado
     * 0 pendiente
     */
    @Column(nullable = false)
    private Boolean estado;
    /**
     * relacion de muchos a uno con la tabla empleado 
     */
    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private EmpleadoModel empleado;

}
