/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.holamundo;

import java.util.Scanner;

/**
 *
 * @author jeroa
 */
public class main {

    public static void main(String[] args) {

        /*var miVariableEnter = 10;
        var miVariableCadena = "Seguimos estudiando";
        System.out.println("miVariableEnter = " + miVariableEnter);
        System.out.println("miVariableCadena = " + miVariableCadena);*/
        //soutv + tab
        //Reglas para definir una variable en java
        //El primer caracter es con minuscula
        //No se pueden utilizar numeros como primer caracter de nuestra variable
        //las variables no pueden tener carecteres especiales
        //Si puede tener _ 
        //Se puede usar el signo del dolar
        //Se puede usar acento pero no es recomendable

        //Ejercicio de concatenacion
        /*var usuario = "Jero";
        var titular = "Tecnico";
        var union = titular + " " + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        var resultado = a + b;
        //con los paraentesis da prioridad de´realizacion
        System.out.println(usuario + " " + (a + b));

        //Ehercicio: Caracteres especiales Java
        var nombre = "Piter";
        System.out.println("Nueva linea: " + "\n" + nombre); //salto de linea
        System.out.println("Tabulador: \t" + nombre); //da una taburacion
        System.out.println("\t.:Menu:.");
        System.out.println("Retroceso: \b\b" + nombre); //caracter de retroceso(borra espacios hacia atras)
        System.out.println("Comillas simples: \'" + nombre + "\'"); //muestra comillas simple en cadena de texto
        System.out.println("Comillas dobles: \"" + nombre + "\""); //muestra comillas doble en cadena de texto
         */
        //clase Scaner 
        //sirve para pedirle al usaurio que ingrese un valor en una variable
        /*System.out.println("Ingres su nombre: ");
        Scanner entrada = new Scanner(System.in);
        var usuario2 = entrada.nextLine(); //next line detine la ejecucion del programa, y espera que el usuario presione enter, luego continua el programa.Lee una linea completa de la consola
        System.out.println("Usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Titulo = " + titulo2);
        System.out.println("resultado: " + titulo2 + " " + usuario2);*/
        /*
        byte numEnteroByte = (byte)1273;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del Byte: " + Byte.MAX_VALUE);
        
        short numEnteroShort = 3276;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo del Short: " + Short.MAX_VALUE);
        
        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del Int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo del Int: " + Integer.MAX_VALUE);
        
        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del Long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo del Long: " + Long.MAX_VALUE);
        */
        
        float numFloat = 3.4028235E38F; // or float numFloat = (float)3.4028235E38;
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor minimo del Float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo del Float: " + Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor minimo del Double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo del Double: " + Double.MAX_VALUE);
    }
}
