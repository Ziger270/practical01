/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task01;

/**
 *
 * @author aleksandrbisirov
 */
public class Therapist extends Doctor {
    public Therapist(String name) {
        super(name);
    }
    public String WriteRecipe(String text){
        char[] arr = text.toCharArray();
        String res = "";
        for ( int i = 0; i < arr.length; i++){
            res += (char)(arr[i]+1);
        }
        return res;
    }
}
