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
public class ejercicio30 {
    public static void main(String[] args) {
        boolean esprimo = true;
        for (int i=2; i<100; i++){
            esprimo = true;
            for(int j=2; j<=i/2; j++){
                if (i%j==0){
                    esprimo = false;
                    break;
                }
            }
            if (esprimo || i==2){
                System.out.println(i+" es primo");
            }
        }
    }
}