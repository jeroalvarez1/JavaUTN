/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio7.interfaz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeroa
 */
public abstract class Operacion implements Entradas, Calcular, RestValores{

    public Operacion() {
        super();
    }
    
    private List<Float> listaAutos = new ArrayList<Float>();

    public List<Float> getListaAutos() {
        return listaAutos;
    }
    
}
