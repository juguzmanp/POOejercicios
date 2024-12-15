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
public class ejercicio24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese los 3 coeficientes de la ecuacion");
        double a,b,c;
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        double disc = b*b-4*a*c;
        //verificar si la solucion es o no real//
        if (disc>=0){
            disc = Math.sqrt(disc);
            double x1 = (-b+disc)/(2*a);
            double x2 = (-b-disc)/(2*a);
            System.out.println("Solucion x1 =" + x1);
            System.out.println("         x2 =" + x2);
        }
        else{
            System.out.println("La solucion no es real");
        }
    }
}
