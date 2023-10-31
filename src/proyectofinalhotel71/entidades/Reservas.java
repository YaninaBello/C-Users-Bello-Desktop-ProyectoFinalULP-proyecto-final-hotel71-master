/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalhotel71.entidades;

import java.time.LocalDate;

/**
 *
 * @author Bello
 */
public class Reservas {

    private int idReserva;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private int cantPersonas;
    private double importe;
    private boolean activo;
    private Huesped huesped;
    private Habitacion habitacion;

    public Reservas() {
    }
    
    public Reservas(int IdReserva, LocalDate fechaEntrada, LocalDate fechaSalida, int cantPersonas, double importe, boolean activo, Huesped huesped, Habitacion habitacion){
        this.idReserva = idReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cantPersonas = cantPersonas;
        this.importe = importe;
        this.activo = activo;
        this.huesped = huesped;
        this.habitacion = habitacion;    
    }
    
    public Reservas(LocalDate fechaEntrada, LocalDate fechaSalida, int cantPersonas, double importe, boolean activo, Huesped huesped, Habitacion habitacion){
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cantPersonas = cantPersonas;
        this.importe = importe;
        this.activo = activo;
        this.huesped = huesped;
        this.habitacion = habitacion;    
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String toString (){
        String reservas=idReserva+" "+habitacion.getIdHabitacion()+", "+habitacion.getNroHabitacion()+", "+habitacion.getTipoDeHabitacion();
        return reservas;
    }
}
