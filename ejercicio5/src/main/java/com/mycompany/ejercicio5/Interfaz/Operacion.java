/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio5.Interfaz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeroa
 */
public abstract class Operacion implements Calcular, Entradas, RestValores{

    public Operacion() {
        super();
    }
    
    private List<Float> listCalificacion = new ArrayList<Float>(); 

    public List<Float> getListCalificacion() {
        return listCalificacion;
    }

    public void setListCalificacion(List<Float> listCalificacion) {
        this.listCalificacion = listCalificacion;
    }
    
    
    
}
