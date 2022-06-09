/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio7.interfaz;

/**
 *
 * @author jeroa
 */
public class Sueldo extends Operacion{

    public Sueldo() {
        super();
    }
    
    private Float salario = 1000F;
    private Float comision = 150F;
    private Float porsentaje = 0.05F;
    private Float result = 0F;
    

    @Override
    public void entradaDatos(Float dato) {
        this.getListaAutos().add(dato);
    }

    @Override
    public Float calcular() {
        for (int i = 0; i < this.getListaAutos().size(); i++) {
            result = result + ((this.getListaAutos().get(i) * porsentaje) + comision);
        }
        return result + salario;
    }
    
        @Override
    public void resetearValores() {
        result = 0F;
    }

}
