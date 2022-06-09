/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author jeroa
 */
public class Ejer1 {
    
    private int numero = 0;
    private String frase = "";
    
    public Ejer1() {
        super();
    }
    public String devFrase(){
        Scanner entrar = new Scanner(System.in);
        System.out.println("Ingrese la frase: ");
        frase = entrar.nextLine();
        System.out.println("Ingrese el numero: ");
        numero = entrar.nextInt();
        return "El numero es: " + String.valueOf(numero) + ", y la frase es: " + frase ;
    }
}
