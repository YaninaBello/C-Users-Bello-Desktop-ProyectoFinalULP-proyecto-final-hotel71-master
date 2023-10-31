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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectofinalhotel71.entidades.Huesped;
/**
 *
 * @author Bello
 */
public class HuespedData {
    private Connection con = null;
    private Object huespedes;

    public HuespedData() {
        
        con=Conexion.getConexion();
        
    }
    
 public void altaHuesped(Huesped huesped){
        
        String sql="INSERT INTO huespedes (nombre, apellido, dni, domicilio, correo, celular, estado)"
                + "VALUES(? ,? ,? ,? ,? ,? ,?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido()); 
            ps.setInt(3, huesped.getDni());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());  
            ps.setInt(6, huesped.getCelular());
            ps.setBoolean(7, huesped.isActivo());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                
                huesped.setIdHuesped(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Huesped registrado");
            }
            ps.close();
            
            
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huespedes");
        }
    }
 

    public void modificarHuesped(Huesped huesped){
        
        String sql="UPDATE huespedes SET nombre = ?, apellido = ?, dni = ?, domicilio = ?, correo = ?, celular = ? WHERE idHuesped = ?";
        
// UPDATE huespedes SET nombre = 'Lucas Ariel', apellido = 'Montes', dni = '12345678', domicilio = 'Av. Mundial 254', correo = 'laMontes@gmail.com', celular = '151234567' WHERE idHuesped = 1;
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setInt(3, huesped.getDni());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setInt(6, huesped.getCelular());
            ps.setInt(7, huesped.getIdHuesped());
            int exito = ps.executeUpdate();
            if(exito==1){
                
                JOptionPane.showMessageDialog(null, "Huesped modificado");
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huespedes");
        }
    }
    
    public void bajaHuesped(int id){
        
        String sql="UPDATE huespedes SET estado = 0 WHERE idHuesped = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            if(exito==1){
                
                JOptionPane.showMessageDialog(null, "Huesped Eliminado");
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huespedes");
        }
    }
    
    public Huesped buscarHuespedPorId(int id){
        
        String sql="SELECT nombre, apellido, dni, domicilio, correo, celular FROM huespedes WHERE idHuesped = ? AND estado = 1";
        Huesped huesped=null;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
               
                huesped=new Huesped();
                
                huesped.setIdHuesped(id);
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getInt("celular"));
                huesped.setActivo(true);
                
                
            } else{
                
                JOptionPane.showMessageDialog(null, "No existe ese huesped");
            }
            ps.close();
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huespedes");  
        }
        return huesped;
    }
    
    public Huesped buscarHuespedPorDni(int dni){
        
        String sql="SELECT idHuesped, nombre, apellido, dni, domicilio, correo, celular FROM huespedes WHERE dni = ? AND estado = 1";
        Huesped huesped=null;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
               
                huesped=new Huesped();
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getInt("celular"));
                huesped.setActivo(true);
                
                
            } else{
                
                JOptionPane.showMessageDialog(null, "No existe ese huesped");
            }
            
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huespedes");  
        }
        return huesped;
    }
    
    public List<Huesped> listarHuespedes(){
        
        String sql="SELECT idHuesped, nombre, apellido, dni, correo, celular FROM huespedes WHERE estado = 1";
        ArrayList<Huesped> huespedes=new ArrayList<>();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
               Huesped huesped=new Huesped();
                
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getInt("celular"));
                huesped.setActivo(true);
                huespedes.add(huesped);   
                
            } 
            ps.close();
            
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");  
        }
        return huespedes;
    }   
    
}
