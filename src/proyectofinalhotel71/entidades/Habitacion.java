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
public class Habitacion {
    
    private int idHabitacion;
    private int nroHabitacion;
    private boolean activo;
    private TipoDeHabitacion tipoDeHabitacion;
    
    public Habitacion(){
    }
    
public Habitacion(int idHabitacion, int nroHabitacion, boolean activo, TipoDeHabitacion tipoDeHabitacion){
  this.idHabitacion = idHabitacion;
  this.nroHabitacion = nroHabitacion;
  this.activo = activo;
  this.tipoDeHabitacion = tipoDeHabitacion;   
}

public Habitacion(int nroHabitacion, boolean activo, TipoDeHabitacion tipoDeHabitacion){
  this.nroHabitacion = nroHabitacion;
  this.activo = activo;
  this.tipoDeHabitacion = tipoDeHabitacion;   
}

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public TipoDeHabitacion getTipoDeHabitacion() {
        return tipoDeHabitacion;
    }

    public void setTipoDeHabitacion(TipoDeHabitacion tipoDeHabitacion) {
        this.tipoDeHabitacion = tipoDeHabitacion;
    }

@Override
public String toString (){
        String habitacion=idHabitacion+" "+tipoDeHabitacion.getIdTipoDeHabitacion()+", "+tipoDeHabitacion.getCantPersonas()+", "+tipoDeHabitacion.getCantCamas()+", "+tipoDeHabitacion.getTipoCamas()+", "+tipoDeHabitacion.getTipoDehabitacion()+", "+tipoDeHabitacion.getPrecio();
        return habitacion;
    }

}

