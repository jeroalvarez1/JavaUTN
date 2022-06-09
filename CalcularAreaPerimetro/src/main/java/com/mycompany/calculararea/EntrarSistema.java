package com.mycompany.calculararea;

import java.util.Scanner;

public class EntrarSistema {
    
    private static Rectangulo rec = new Rectangulo();
    private static TrianguloRectangulo tri = new TrianguloRectangulo();
    private static EntrarSistema es = null; //variable del tipo clase entrar sistema
    
    public EntrarSistema() {
        super();
    }

    public static void main(String[] args) {
        //mostrar nombre de la clase
        es  = new EntrarSistema();
        String miNombre = es.getClass().getName();
        System.out.println(miNombre);
        //
        
        Scanner entrar = new Scanner(System.in);
        Float miEntrada;
        
        //entrar datos de altura
        System.out.println("Introduzca el valor de la altura: ");
        miEntrada = entrar.nextFloat();
        rec.setAltura(miEntrada);
        tri.setAltura(miEntrada);
        
        //entrar datos de base
        System.out.println("Introduzca el valor de la base");
        miEntrada = entrar.nextFloat();
        rec.setBase(miEntrada);
        tri.setBase(miEntrada);
        
        
        System.out.println("La altura ingresada es: " + rec.getAltura());
        System.out.println("La base ingresada es: " + rec.getBase());
        
        //llamar a operaciones calcular de la clase Rectangulo y TrianguloRectangulo
        Float rl;
        rl = rec.calcular();
        Float tr;
        tr = tri.calcular();
        //imprimir resultados
        System.out.println("El area del rectangulo es = " + rl);
        System.out.println("El perimetro del rectangulo es = " + rec.calcularPerimetro());
        System.out.println("El area del triangulo rectangulo es = " + tr);
        System.out.println("El perimetro del triangulo es = " + tri.calcularPerimetro());
    }
}
