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
public class ejercicio26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 3 enteros");
        int x1 = s.nextInt();
        int x2 = s.nextInt();
        int x3 = s.nextInt();
        if (x1>=x2 && x1>=x3){
            System.out.println(x1+" es el mayor de todos");
        }
        else if(x2>=x1 && x2>=x3){
            System.out.println(x2+" es el mayor de todos");
        }
        else{
            System.out.println(x3+" es el mayor de todos");
        }
        if (x1<=x2 && x1<=x3){
            System.out.println(x1+" es el menor de todos");
        }
        else if (x1>=x2 && x1>=x3){
            System.out.println(x2+" es el menor de todos");
        }
        else{
            System.out.println(x3+" es el menor de todos");
        }
    }
}
