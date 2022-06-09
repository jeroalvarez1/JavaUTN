/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;//conexion en si
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager; //relizar la conexion hacia el primer paquete


/**
 *
 * @author jeroa
 */
public class Conexion {
    
    private Connection conexion;
    
    private String host = "localhost";
    private String usuario = "root";
    private String password = "";
    private String nombreBD = "recursos_humanos_dsy";
    
    private String url = "jdbc:mysql://"+host+"/"+nombreBD;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            this.conexion = DriverManager.getConnection(this.url, this.usuario, this.password);
        } catch (Exception e) {
            System.out.println("Error de conexion: " + e.getMessage());
        }
        return this.conexion;
    }
    
    
}
