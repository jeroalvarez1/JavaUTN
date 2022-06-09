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
public class CantDinero extends Operacion{

    public CantDinero() {
        super();
    }

    @Override
    public Float mMitadDeN() {
        return this.getActor1() / 2;
    }

    @Override
    public Float mitadDeMYMitadN() {
        return (mMitadDeN()/2) + (this.getActor1() / 2);
    }
    
}
