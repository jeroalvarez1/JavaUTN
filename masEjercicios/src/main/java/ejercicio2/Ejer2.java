/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author jeroa
 */
public class Ejer2 {
    
    private int number = 0;
    private Scanner ingresar = new Scanner(System.in);
    
    public Ejer2(){
        super();
    }
    
    public Integer calcular(){
        System.out.println("Ingrese un numero: ");
        number = ingresar.nextInt();
        int suma = 0;
        for (int i = number+1; i <= number+100; i++) {
            suma = suma + i;
        }
        return suma;
    }
    
}
