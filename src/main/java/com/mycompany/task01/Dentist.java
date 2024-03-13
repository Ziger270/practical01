/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task01;

/**
 *
 * @author aleksandrbisirov
 */
public class Dentist extends Doctor {
    public Dentist(String name) {
        super(name);
    }
    public String WriteRecipe(String text){
        char[] arr = text.toCharArray();
        String res = "";
        for (int i = arr.length-1; i >= 0; i--){
            res += arr[i];
        }
        return res;
    }
}
