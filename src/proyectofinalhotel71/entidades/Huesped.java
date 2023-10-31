/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalhotel71.entidades;

/**
 *
 * @author Bello
 */
public class Huesped {
    
    private int idHuesped;
    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private String correo;
    private int celular;
    private boolean Activo;

    public Huesped() {
    }

    public Huesped(int idHuesped, String nombre, String apellido, int dni, String domicilio, String correo, int celular, boolean Activo) {
        this.idHuesped = idHuesped;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
        this.Activo = Activo;
    }
    
    public Huesped(String nombre, String apellido, int dni, String domicilio, String correo, int celular, boolean Activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
        this.Activo = Activo;
    }
    
    public int getIdHuesped(){
        return idHuesped;
    }
    
    public void setIdHuesped(int idHuesped){
        this.idHuesped = idHuesped;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }
    
    @Override
    public String toString(){
        return "Huesped{" + "idHuesped=" + idHuesped + "nombre=" + nombre + "apellido=" + apellido + "dni=" + dni 
                + "domicilio=" + domicilio + "correo=" + correo + "celular=" + celular + '}';
    }
    
    
    
}
