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
public class ejercicio21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double num1 = s.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double num2 = s.nextDouble();
        if (num1>num2){
            System.out.println("El primer numero es mayor");
        }
        else{
            if (num1<num2){
                System.out.println("El segundo numero es mayor");
            }
            else{
                System.out.println("Los numeros son iguales");
            }
        }
    }
}
