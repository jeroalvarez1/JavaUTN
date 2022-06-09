/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabajopractico4.main;

import ejercicio1.Ejer1;
import ejercicio2.Ejer2;
import ejercicio3.Ejer3;
import java.util.Scanner;

/**
 *
 * @author jeroa
 */
public class main {
    
    private static Ejer1 one = new Ejer1();
    private static Ejer2 two = new Ejer2();
    private static Ejer3 three = new Ejer3();
    private static Scanner ingresar = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese el numero del ejercicio que usted quiere ejecutar: ");
        Integer numero = ingresar.nextInt();
        if (numero == 1) {
            String impEjer1;
            impEjer1 = one.devFrase();
            System.out.println(impEjer1);
        } else if (numero == 2){
            String impEjer2;
            impEjer2 = two.calcular().toString();
            System.out.println("La suma de los 100 numeros siguientes al numero ingresado es: " + impEjer2);
        } else if (numero == 3){
            String impEjer3;
            impEjer3 = three.convertir().toString();
            System.out.println("La conversion de euro a dolar da: " + impEjer3);
        } else {
            System.out.println("El numero ingresado no pertenece a un ejercicio");
        }
    }
}
