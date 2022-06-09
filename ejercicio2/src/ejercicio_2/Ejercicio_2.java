/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import CargarLibro.CargarLibro;
import vista.PrincipalView;

/**
 *
 * @author jeroa
 */
public class Ejercicio_2 {

    //private static CargarLibro cargar = new CargarLibro();
    private static PrincipalView window = new PrincipalView();
    
    
    public static void main(String[] args) {

        
        window.setTitle("Cargar Libro");
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        //cargar.ingresar();
        //System.out.println(cargar.devolver());
        
    }
    
}
