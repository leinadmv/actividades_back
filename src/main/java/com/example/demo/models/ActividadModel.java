package com.example.demo.models;

import java.sql.Timestamp;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
 

@Entity
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

    public Timestamp getFechaEstimada() {
        return fechaEstimada;
    }
    public void setFechaEstimada(Timestamp fechaEstimada) {
        this.fechaEstimada = fechaEstimada;
    }
    public EmpleadoModel getEmpleado() {
        return empleado;
    }
    public void setEmpleado(EmpleadoModel empleado) {
        this.empleado = empleado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
