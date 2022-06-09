/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author jeroa
 */
public class Trabajador {
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;
    private String cargo;
    private Boolean sexo;
    private Boolean extranjero;

    public Trabajador() {
    }

    public Trabajador(String rut, String nombre, String apellido, int edad, String cargo, Boolean sexo, Boolean extranjero) {
        this.setRut(rut);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
        this.setCargo(cargo);
        this.setSexo(sexo);
        this.setExtranjero(extranjero);
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public Boolean getExtranjero() {
        return extranjero;
    }

    public void setExtranjero(Boolean extranjero) {
        this.extranjero = extranjero;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", cargo=" + cargo + ", sexo=" + sexo + ", extranjero=" + extranjero + '}';
    }
    
    
    
    
    
     
}
