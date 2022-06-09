/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio6.interfaz;

/**
 *
 * @author jeroa
 */
public abstract class Operacion implements MMitadDeN, MitadDeMYMitadN{

    public Operacion() {
        super();
    }
    
    private Float actor1 = 0f;

    public Float getActor1() {
        return actor1;
    }

    public void setActor1(Float actor1) {
        this.actor1 = actor1;
    }
    
}
