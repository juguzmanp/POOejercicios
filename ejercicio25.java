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
public class ejercicio25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un entero para calcular factorial");
        int x1 = s.nextInt();
        int f = factorial(x1);
        System.out.println(f);
        System.out.println("Ingrese dos enteros para calcular Ackermann");
        x1 = s.nextInt();
        int x2 = s.nextInt();
        int a = ackermann(x1,x2);
        System.out.println(a);
    }
    
    public static int factorial(int n){
        if (n<2){
            return 1;
        }
        return n * factorial(n-1);
    }
    
    public static int ackermann(int x, int y){
        if (x==0){
            return y + 1;
        }
        if (x>0 && y==0){
            return ackermann(x-1,1);
        }
        if (x>0 && y>0){
            return ackermann(x-1, ackermann(x,y-1));
        }
        return 0;
    }
}