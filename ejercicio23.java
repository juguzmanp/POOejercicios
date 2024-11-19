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
public class ejercicio23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero");
        int num1 = s.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        int num2 = s.nextInt();
        while (num1!=num2){
            if (num1<num2){
                num2=num2-num1;
            }
            else{
                num1=num1-num2;
            }
        }
        System.out.println("El maximo comun divisor es: " + num1);
    }
}
