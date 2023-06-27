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
public abstract class Student implements Person, Serializable{
    private String name;
    private int age;
    private String address;
    private String stage;
    private double grade;
        
    /**
     * Constructor
     * @param name
     * @param age
     * @param address 
     * @param stage
     * @param grade
     */
    public Student(String name, int age, String address, String stage, double grade) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.stage = stage;
        this.grade = grade;
    }
    
    public Student() {}
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }    

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name=" + name + ", age=" + age + ", address=" + address + ", stage=" + stage + ", grade=" + grade;
    }    
}
