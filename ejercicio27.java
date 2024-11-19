/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author luren
 */
import java.util.*; //para usar Scanner
public class ejercicio27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double temp = 0;
        double convert = 5;
        convert = convert / 9;
        while (temp!=999){
            System.out.println("Ingrese la temperatura en Farenheit");
            temp = s.nextDouble();
            if (temp==999){
                break;
            }
            temp = temp-32;
            temp = temp*convert;
            System.out.println("La temperatura en Celsius es: " + temp);
        }
    }            
}
