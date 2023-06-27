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
public class Profesor extends Resource implements Serializable{
    public String especialidad;

    public Profesor(String name, int age, String address) {
        super(name, age, address);
    }

    public Profesor() {}

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override
    public String toString() {
        return super.toString() + "especialidad=" + especialidad;
    }
}
