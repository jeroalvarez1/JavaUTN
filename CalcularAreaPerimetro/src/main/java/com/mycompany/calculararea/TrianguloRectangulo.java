package com.mycompany.calculararea;

public class TrianguloRectangulo extends Figura{
    public TrianguloRectangulo() {
        super();
    }
    public float calcular(){
        return (this.getAltura() * this.getBase()) / 2 ;
    }
    public float calcularPerimetro(){
        return (getBase()) + (getAltura()*2);
    }
}
