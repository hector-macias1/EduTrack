/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Entity;

import java.io.Serializable;

/**
 *
 * @author Hecta
 */
public class AlumnoPreparatoria extends Student implements Serializable{
    private String especialidad;

    public AlumnoPreparatoria(String name, int age, String address, String stage, double grade) {
        super(name, age, address, stage, grade);
    }
    
    public AlumnoPreparatoria() {}

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Especialidad= " + especialidad;
    }
}
