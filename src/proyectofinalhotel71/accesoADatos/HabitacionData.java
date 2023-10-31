/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalhotel71.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectofinalhotel71.entidades.Habitacion;
import proyectofinalhotel71.entidades.TipoDeHabitacion;

/**
 *
 * @author Bello
 */
public class HabitacionData {

    private Connection con = null;
    private Object habitaciones;


    public HabitacionData() {

        this.con = Conexion.getConexion();

    }

//    public void insertarHabitacion(Habitacion habitacion) {
//
//        try {
//            String sql = "INSERT INTO habitaciones (idHabitaciones, numeroHabitacion, estado) VALUES (?, ?, ?);"
//+ "INSERT INTO tipoDeHabitacion (idTipoDeHabitacion, cantPersonas, cantCamas, tipoDeCamas, precio) VALUES (?, ?, ?, ?, ?);"
//+ "SELECT * FROM habitaciones JOIN tipoDeHabitacion ON habitaciones.idHabitaciones = tipoDeHabitacion.idTipoDeHabitacion;"
//                    
//                    /*"INSERT INTO habitaciones (idHabitacion, numeroHabitacion, estado) VALUES (?, ?, ?)";*/
//
//            PreparedStatement ps = con.prepareStatement(sql);
//
//            ps.setInt(2, habitacion.getNroHabitacion());
//            ps.setBoolean(3, habitacion.isActivo());
//            ps.executeUpdate();
//
//            ResultSet rs = ps.getGeneratedKeys();
//            if (rs.next()) {
//
//                habitacion.setIdHabitacion(rs.getInt(1));  int idHabitacion = rs.getInt(1);
//                JOptionPane.showMessageDialog(null, "Nueva habitacion registrada");
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitaciones");
//        }
//    }
    
    public void altaHabitacion(Habitacion habitacion) {

        String sql = "INSERT INTO habitacion (idHabitacion, numeroHabitacion, estado, tipoDehabitacion) VALUES(? ,? ,? ,?)";

        try {
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, habitacion.getNroHabitacion());
            ps.setBoolean(2, habitacion.isActivo());
            ps.setInt(3, habitacion.getTipoDeHabitacion().getIdTipoDeHabitacion());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                habitacion.setIdHabitacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Habitacion cargada");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion 1");
        }
    }
    

    public void modificarHabitacion(Habitacion habitacion) {

        String sql = "UPDATE habitacion SET numeroHabitacion = ?, estado = ? WHERE idhabitacion = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, habitacion.getNroHabitacion());
            ps.setBoolean(2, habitacion.isActivo());

            int exito = ps.executeUpdate();
            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Habitacion Modificada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion");
        }
    }

    public void eliminarHabitacion(int id) {

        String sql = "UPDATE hsbitsciones SET estado = 0 WHERE idHabitacion = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Habitacion Eliminada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitaciones");
        }
    }

//
//"INSERT INTO habitaciones (idHabitaciones, numeroHabitacion, estado) VALUES (?, ?, ?);"
//+ "INSERT INTO tipoDeHabitacion (idTipoDeHabitacion, cantPersonas, cantCamas, tipoDeCamas, precio) VALUES (?, ?, ?, ?, ?);"
//+ "SELECT * FROM habitaciones JOIN tipoDeHabitacion ON habitaciones.idHabitaciones = tipoDeHabitacion.idTipoDeHabitacion;"


//public void insertarHabitacionCompleta(Habitacion habitacion, TipoDeHabitacion tipoDeHabitacion) {
//    try {
//        String insertHabitacionSql = "INSERT INTO habitaciones (idHabitacion, numeroHabitacion, estado) VALUES (?, ?, ?);";
//        String insertTipodehabitacionSql = "INSERT INTO tipoDeHabitacion (idTipoDeHabitacion, cantPersonas, cantCamas, tipoDeCamas, precio) VALUES (?, ?, ?, ?, ?);";
//        String selectSql = "SELECT * FROM habitaciones JOIN tipoDeHabitacion ON habitaciones.idHabitaciones = tipoDeHabitacion.idTipoDeHabitacion;";
//
//        PreparedStatement ps = con.prepareStatement(insertHabitacionSql, Statement.RETURN_GENERATED_KEYS);
//        ps.setInt(1, habitacion.getNroHabitacion());
//        ps.setBoolean(2, habitacion.isActivo());
//        ps.executeUpdate();
//
//        ResultSet rs = ps.getGeneratedKeys();
//        if (rs.next()) {
//            /*int idHabitacion = rs.getInt(1);*/
//            habitacion.setIdHabitacion(rs.getInt(1));
//
//            PreparedStatement ps2 = con.prepareStatement(insertTipodehabitacionSql, Statement.RETURN_GENERATED_KEYS);
//            ps2.setInt(1, tipoDeHabitacion.getCantPersonas());
//            ps2.setInt(2, tipoDeHabitacion.getCantCamas());
//            ps2.setString(3, tipoDeHabitacion.getTipoCamas());
//            ps2.setInt(4, tipoDeHabitacion.getPrecio());
//            ps2.executeUpdate();
//
//            ResultSet rs2 = ps2.getGeneratedKeys();
//            if (rs2.next()) {
////                int idTipoHabitacion = rs2.getInt(1);
//                tipoDeHabitacion.setIdTipoDeHabitacion(rs.getInt(1));
//
//                // Execute the SELECT statement only after both INSERT statements have been executed
//                Statement statement = con.createStatement();
//                ResultSet selectResult = statement.executeQuery(selectSql);
//
//                // Process the SELECT result as needed
//
//                statement.close();
//            }
//
//            JOptionPane.showMessageDialog(null, "Nueva habitacion registrada");
//        }
//
//        ps.close();
//    } catch (SQLException ex) {
//        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitaciones");
//    }
//}

    
//    public void insertarHabitacionCompleta(Habitacion habitacion, TipoDeHabitacion tipoDeHabitacion) {
//    try {
//        String insertHabitacionSql = "INSERT INTO habitaciones (numeroHabitacion, estado) VALUES (?, ?);";
//        String insertTipodehabitacionSql = "INSERT INTO tipoDeHabitacion (cantPersonas, cantCamas, tipoDeCamas, precio) VALUES (?, ?, ?, ?);";
//
//        PreparedStatement ps = con.prepareStatement(insertHabitacionSql, Statement.RETURN_GENERATED_KEYS);
//        ps.setInt(1, habitacion.getNroHabitacion());
//        ps.setBoolean(2, habitacion.isActivo());
//        ps.executeUpdate();
//
//        ResultSet rs = ps.getGeneratedKeys();
//        if (rs.next()) {
//            habitacion.setIdHabitacion(rs.getInt(1));
//
//            PreparedStatement ps2 = con.prepareStatement(insertTipodehabitacionSql, Statement.RETURN_GENERATED_KEYS);
//            ps2.setInt(1, tipoDeHabitacion.getCantPersonas());
//            ps2.setInt(2, tipoDeHabitacion.getCantCamas());
//            ps2.setString(3, tipoDeHabitacion.getTipoCamas());
//            ps2.setInt(4, tipoDeHabitacion.getPrecio());
//            ps2.executeUpdate();
//
//            ResultSet rs2 = ps2.getGeneratedKeys();
//            if (rs2.next()) {
//                tipoDeHabitacion.setIdTipoDeHabitacion(rs2.getInt(1));
//            }
//
//            JOptionPane.showMessageDialog(null, "Nueva habitacion registrada");
//        }
//
//        ps.close();
//    } catch (SQLException ex) {
//        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitaciones");
//}
//}

    
    
}


