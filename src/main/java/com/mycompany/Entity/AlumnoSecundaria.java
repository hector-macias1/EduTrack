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
public class AlumnoSecundaria extends Student implements Serializable{
    private String taller;

    public AlumnoSecundaria(String name, int age, String address, String stage, double grade) {
        super(name, age, address, stage, grade);
    }

    public AlumnoSecundaria() {}

    public String getTaller() {
        return taller;
    }

    public void setTaller(String taller) {
        this.taller = taller;
    }

    @Override
    public String toString() {
        return super.toString() + ", Taller= " + taller;
    }
}
