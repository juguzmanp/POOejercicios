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
public class ejercicio18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        long num = s.nextInt();
        long limit = num + 100;
        long suma = 0;
        for (num=num+1; num<=limit ; num++){
            suma = suma + num;
        }
        System.out.println("La suma de los 100 numeros siguientes es: " + suma);
    } 
}
