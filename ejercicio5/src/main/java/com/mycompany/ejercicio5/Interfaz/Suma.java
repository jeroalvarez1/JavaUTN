/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio5.Interfaz;

/**
 *
 * @author jeroa
 */
public class Suma extends Operacion{

    public Suma() {
        super();
    }
    
    private Float result = 0f;
    
    @Override
    public Float calcular() {
        for (int i = 0; i < this.getListCalificacion().size(); i++) {
            result = result + this.getListCalificacion().get(i);
        }
        return result;
    }

    @Override
    public void entradaDatos(Float dato) {
        this.getListCalificacion().add(dato);
    }

    @Override
    public void resetearValores() {
        result = 0f;
        this.getListCalificacion().clear();
    }
    
}
