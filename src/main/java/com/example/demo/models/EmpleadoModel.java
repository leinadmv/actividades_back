package com.example.demo.models;

import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
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
     * relacion de uno a muchos con la tabla actividades
     */
    @JsonIgnore
    @OneToMany(mappedBy = "empleado")
    private List<ActividadModel> actividades;

    public List<ActividadModel> getActividades() {
        return actividades;
    }

    public void setActividades(List<ActividadModel> actividades) {
        this.actividades = actividades;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
}