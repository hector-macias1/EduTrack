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
public class AlumnoPrimaria extends Student implements Serializable {

    public AlumnoPrimaria(String name, int age, String address, String stage, double grade) {
        super(name, age, address, stage, grade);
    }
    
    public AlumnoPrimaria() {}

    @Override
    public String toString() {
        return super.toString();
    }
}
