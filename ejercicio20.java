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
public class ejercicio20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la altura del rectangulo");
        double altura = s.nextDouble();
        System.out.println("Ingrese la anchura del rectangulo");
        double anchura = s.nextDouble();
        double area = altura * anchura;
        System.out.println("El area del rectangulo es: " + area);
    }
}

