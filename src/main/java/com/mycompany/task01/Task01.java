/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task01;

import java.util.Scanner;

/**
 *
 * @author aleksandrbisirov
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        System.out.println("Вариант 3. Бисиров Александр Васильевич");
        System.out.println("Введите имя врача: ");
        String name = scan.next();
        int option;
        do {
            System.out.println("Выберите специалиста:");
            System.out.println("1. Стоматолог\n2. Терпапевт");
            option = scan.nextInt();
            if (option < 1 || option > 2){
                System.out.println("Неверный выбор!");
            }
        } while (option < 1 || option > 2);
        Doctor doc = null;
        switch(option){
            case 1: {
                doc = new Dentist(name);
                break;
            }
            case 2: {
                doc = new Therapist(name);
                break;
            }
        }
        System.err.println("Введите текст рецепта: ");
        String text = scan.next();
        text = doc.WriteRecipe(text);
        System.out.println("Новый текст рецепта:\n"+text+"\n Имя врача: "+doc.ToString());
    }
}
