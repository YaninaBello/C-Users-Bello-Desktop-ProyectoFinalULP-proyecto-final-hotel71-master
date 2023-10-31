/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalhotel71.accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bello
 */
public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/";
        private static final String DB="hotel71";
        private static final String USUARIO="root";
        private static final String CONTRASENA="";
        private static Connection conexion;

    public Conexion() {}
        
        
    public static Connection getConexion(){
        
        if (conexion==null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(URL+DB, USUARIO, CONTRASENA);
                
                JOptionPane.showMessageDialog(null, "Conectado");
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar Driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexión");
            }
        } return conexion;
    }
}
