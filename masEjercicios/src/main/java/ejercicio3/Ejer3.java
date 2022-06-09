/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author jeroa
 */
public class Ejer3 {
    
    private Float cantidad = 0.0F;
    private Float resultado = 0.0F;
    private Scanner scanner = new Scanner(System.in);
    
    public Ejer3(){
        super();
    }
    
    public Float convertir(){
        System.out.println("Ingrese la cantidad de euros que desee convertir: ");
        cantidad = scanner.nextFloat();
        resultado = cantidad * 1.0831F;
        return resultado;
    } 
}
