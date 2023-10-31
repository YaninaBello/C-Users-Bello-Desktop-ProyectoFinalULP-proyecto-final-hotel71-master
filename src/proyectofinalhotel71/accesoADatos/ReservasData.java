/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalhotel71.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectofinalhotel71.entidades.Habitacion;
import proyectofinalhotel71.entidades.Huesped;
import proyectofinalhotel71.entidades.Reservas;

/**
 *
 * @author Bello
 */
public class ReservasData {
    private Connection con = null;
    private  HuespedData md = new HuespedData();
    private HabitacionData ad = new HabitacionData();

    public ReservasData() {
        
        this.con=Conexion.getConexion();
        
    }
    
   public void guardarReserva(Reservas res){
    
        String sql="INSERT INTO reserva(idHuesped, idHabitacion, fechaEntrada, fechaSalida, cantPersonas, importe) VALUES (?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,res.getHuesped().getIdHuesped());
            ps.setInt(2, res.getHabitacion().getIdHabitacion());
            ps.setDate(3, Date.valueOf(res.getFechaEntrada()));  //ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setDate(4, Date.valueOf(res.getFechaSalida()));
            ps.setInt(5, res.getCantPersonas());
            ps.setDouble(6, res.getImporte());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
            
                
                res.setIdReserva(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Reserva registrada");
            }
            
            ps.close();
        
        
        } catch (SQLException ex) {
                  JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
                  }
        
    }
    
    public void modificarReserva(Reservas reservas, int idHuesped, int idHabitacion, LocalDate fechaEntrada, LocalDate fechaSalida, int cantPersonas, double importe){
    
        String sql="UPDATE reserva SET fechaEntrada = ?, fechaSalida = ?, cantPersonas = ?, importe = ? WHERE idAlumno = ? and idMateria = ? ";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setDate(1, Date.valueOf(reservas.getFechaEntrada()));      
            ps.setDate(2, Date.valueOf(reservas.getFechaSalida()));
            ps.setInt(3, cantPersonas);
            ps.setDouble(4, importe);
            ps.setInt(5, idHuesped);
            ps.setInt(6, idHabitacion);
            
            int filas=ps.executeUpdate();
            if(filas>0) {
            JOptionPane.showMessageDialog(null, "Reserva Actualizada");
            }
           ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
        }
    }
    
    public void eliminarReserva(int idhuesped, int idhabitacion){
    
    String sql="DELETE FROM reserva WHERE idHuesped = ? and idHabitacion = ?";
    
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ps.setInt(2, idHabitacion);
            
            int filas=ps.executeUpdate();
            if (filas>0){
            
                JOptionPane.showMessageDialog(null, "Reserva eliminada");
            }
            
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
        }
    
    } 
    
     public List<Reservas> obtenerReservasPorHuesped(int idHuesped){
        
        ArrayList<Reservas> reservas=new ArrayList<>();
        
        String sql="SELECT * FROM reserva WHERE idhuesped = ?";
        
        try {         
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
            
                Reservas res=new Reservas();
                res.setIdReserva(rs.getInt("idReserva"));
                Huesped hues=hd.buscarHuesped(rs.getInt("idHuesped"));
                Habitacion hab=hn.buscarHabitacion(rs.getInt("idhabitacion"));
                res.setHuesped(hues);
                res.setHabitacion(hab);
                res.set(rs.get(""));
                reservas.add(res);               
            }
            ps.close();
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
        }
        
        return reservas;
    }
}
