package com.mycompany.calculararea;

public class Rectangulo extends Figura{
    public Rectangulo() {
        super();
    }
    public float calcular(){
        return this.getBase() * this.getAltura();
    }
    public float calcularPerimetro(){
        return (getBase()*2) + (getAltura()*2);
    }
}
