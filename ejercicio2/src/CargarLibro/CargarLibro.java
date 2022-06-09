/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CargarLibro;

import javax.swing.JOptionPane;
import vista.PrincipalView;

/**
 *
 * @author jeroa
 */
public class CargarLibro {

    private String nombre;
    private String id;
    private Float precio;
    private Boolean envioGratuito;
    private String cadenaResultado;
    
    public CargarLibro() {
        super();
    }
    
    public void ingresar(){
        
        //captura el valor de los text field
        nombre = PrincipalView.nombre.getText();
        id = PrincipalView.id.getText();
        precio = Float.parseFloat(PrincipalView.precio.getText());
        
        if (PrincipalView.si.isSelected()){
            envioGratuito = true;
        } else if (PrincipalView.no.isSelected()) {
            envioGratuito = false;
        }
            
        
    }
    
    public void devolver(){
        cadenaResultado = "El nombre del libro es: " + nombre + "\n" + "El ID del libro es: " + id + "\n" + "El precio del libro es: $" + precio + "\n" + "¿El envio es gratuito?: " + envioGratuito; 
        JOptionPane.showMessageDialog(null, cadenaResultado, "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }
    
}
