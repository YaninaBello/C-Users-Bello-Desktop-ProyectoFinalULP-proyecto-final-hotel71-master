/*ódigo, cantidad de personas (maxima), cantidad de camas, tipo de camas (Simples, Queen, King Size), precio por noche
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalhotel71.entidades;

/**
 *
 * @author Bello
 */
public class TipoDeHabitacion {
    private int idTipoDeHabitacion;
    private int cantPersonas;
    private int cantCamas;
    private String tipoCamas;
    private String tipoDeHabitacion;
    public int precio;
    private boolean Activo;


    public TipoDeHabitacion() {
    }

    public TipoDeHabitacion(int idTipoDeHabitacion, int cantPersonas, int cantCamas, String tipoCamas, String tipoDeHabitacion, int precio, boolean Activo) {
        this.idTipoDeHabitacion = idTipoDeHabitacion;
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoCamas = tipoCamas;
        this.tipoDeHabitacion = tipoDeHabitacion;
        this.precio = precio;
        this.Activo = Activo;
 
    }
    
    public TipoDeHabitacion(int cantPersonas, int cantCamas, String tipoCamas, String tipoDeHabitacion, int precio, boolean Activo) {
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoCamas = tipoCamas;
        this.tipoDeHabitacion = tipoDeHabitacion;
        this.precio = precio;
        this.Activo = Activo;
 
    }
    
    public int getIdTipoDeHabitacion(){
        return idTipoDeHabitacion;
    }
    
    public void setIdTipoDeHabitacion(int idTipoDeHabitacion) {
        this.idTipoDeHabitacion = idTipoDeHabitacion;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public String getTipoCamas() {
        return tipoCamas;
    }

    public void setTipoCamas(String tipoCamas) {
        this.tipoCamas = tipoCamas;
    }
    
    public String getTipoDehabitacion() {
        return tipoDeHabitacion;
    }
    
    public void setTipoDeHabitacion(String tipoDeHabitacion) {
        this.tipoDeHabitacion = tipoDeHabitacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

     public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }
    
  
    @Override
    public String toString(){
        return "Huesped{" + "idTipoDeHabitacion=" + idTipoDeHabitacion + "cantPersonas=" + cantPersonas + "cantCamas=" + cantCamas 
                + "tipoCamas=" + tipoCamas + "tipoDeHabitacion=" + tipoDeHabitacion + "precio=" + precio + '}';
    }
    
    
}
