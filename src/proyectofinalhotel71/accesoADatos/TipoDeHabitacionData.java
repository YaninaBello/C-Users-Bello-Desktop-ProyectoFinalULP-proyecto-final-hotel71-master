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
public class TipoDeHabitacionData {

    private Connection con = null;
    private Object tipoDeHabitacion;

    public TipoDeHabitacionData() {

        this.con = Conexion.getConexion();
    }

    public void altaTipoHabitacion(TipoDeHabitacion tipoDeHabitacion) {

        String sql = "INSERT INTO tipodehabitacion (cantPersonas, cantCamas, tipoCamas, tipoDeHabitacion, precio, estado) VALUES(? ,? ,? ,? ,? ,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, tipoDeHabitacion.getCantPersonas());
            ps.setInt(2, tipoDeHabitacion.getCantCamas());
            ps.setString(3, tipoDeHabitacion.getTipoCamas());
            ps.setString(4, tipoDeHabitacion.getTipoDehabitacion());
            ps.setInt(5, tipoDeHabitacion.getPrecio());
            ps.setBoolean(6, tipoDeHabitacion.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                tipoDeHabitacion.setIdTipoDeHabitacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Categoria registrada");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipo de habitacion 1");
        }
    }

    public void modificarTipoDeHabitacion(TipoDeHabitacion tipoDeHabitacion) {

        String sql = "UPDATE tipodehabitacion SET cantPersonas = ?, cantCamas = ?, tipoCamas = ?, precio = ? WHERE idTipoDeHabitacion = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, tipoDeHabitacion.getCantPersonas());
            ps.setInt(2, tipoDeHabitacion.getCantCamas());
            ps.setString(3, tipoDeHabitacion.getTipoCamas());
            ps.setDouble(4, tipoDeHabitacion.getPrecio());
            ps.setInt(5, tipoDeHabitacion.getIdTipoDeHabitacion());
            int exito = ps.executeUpdate();
            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Habitacion modificada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipo de habitacion 2");
        }
    }

    public void bajaHabitacion(int id) {
        String sql = "UPDATE tipodehabitacion SET estado = 0 WHERE idTipoDeHabitacion = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Habitacion eliminada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipo de habitacion 3");
        }

    }
}
