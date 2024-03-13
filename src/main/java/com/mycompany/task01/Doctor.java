/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task01;

/**
 *
 * @author aleksandrbisirov
 */
public class Doctor {
    public Doctor(String name){
        this.name = name;
    }
    public String WriteRecipe(String text){
        return text;
    }
    public String ToString() {
        return name;
    }
    private String name;
}
