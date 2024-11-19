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
public class ejercicio22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = s.nextInt();
        System.out.println("Los numeros impares anteriores a este numero son:");
        for (num=num-1 ; num>0 ; num--){
            if (num % 2 != 0){
                System.out.println(num);
            }
        }
    }
}
