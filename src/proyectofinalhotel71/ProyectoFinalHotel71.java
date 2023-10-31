/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalhotel71;

import java.sql.Connection;
import proyectofinalhotel71.accesoADatos.Conexion;
import proyectofinalhotel71.accesoADatos.HabitacionData;
import proyectofinalhotel71.accesoADatos.HuespedData;
import proyectofinalhotel71.accesoADatos.TipoDeHabitacionData;
import proyectofinalhotel71.entidades.Habitacion;
import proyectofinalhotel71.entidades.Huesped;
import proyectofinalhotel71.entidades.TipoDeHabitacion;

/**
 *
 * @author brito
 */
public class ProyectoFinalHotel71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Connection con = Conexion.getConexion();
        
//ALTA HUESPED
        
//        Huesped Lucas=new Huesped("Lucas Gabriel", "Montes", 12345678, "Av. Mundial 254", "lgMontes@gmail.com", 151234567, true);
//        HuespedData hue=new HuespedData();
//        hue.altaHuesped(Lucas);

//        Huesped Matias=new Huesped("Matias Nahuel", "Lopez", 87654321, "Av. Sarmiento 612", "mnLopez@gmail.com", 157654321, true);
//        HuespedData hue=new HuespedData();
//        hue.altaHuesped(Matias);

//        Huesped Mariela=new Huesped("Mariela Alejandra", "Albarracin", 78456213, "Av. Ortega 2214", "maAlbarracin@gmail.com", 157564132, true);
//        HuespedData hue=new HuespedData();
//        hue.altaHuesped(Mariela);
        
//        Huesped Evelin=new Huesped("Evelin Solange", "Garcia", 52163487, "Av. Juan B. Justo 014", "esGarcia@gmail.com", 155746123, true);
//        HuespedData hue=new HuespedData();
//        hue.altaHuesped(Evelin);

//        Huesped Rocio=new Huesped("Rocio Nicole", "Sanz", 12456987, "Av. Luro 187", "rnSanz@gmail.com", 153756421, true);
//        HuespedData hue=new HuespedData();
//        hue.altaHuesped(Rocio);

//        Huesped Eleana=new Huesped("Eleana Gabriela", "Gonzalez", 74125654, "Av. Davinci 580", "egGonzalez@gmail.com", 151116668, true);
//        HuespedData hue=new HuespedData();
//        hue.altaHuesped(Eleana);

//MODIFICAR HUESPED

//        Huesped Lucas=new Huesped(1, "Lucas Ariel", "Montes", 12345678, "Av. Mundial 254", "laMontes@gmail.com", 151234567, true);
//        HuespedData hue=new HuespedData();
//        hue.modificarHuesped(Lucas);

//        Huesped Lucas=new Huesped(1 ,"Lucas Gabriel", "Montes", 12345678, "Av. Mundial 254", "lgMontes@gmail.com", 151234567, true);
//        HuespedData hue=new HuespedData();
//        hue.modificarHuesped(Lucas);

//BAJA HUESPED

//        Huesped Lucas=new Huesped(1, "Lucas Ariel", "Montes", 12345678, "Av. Mundial 254", "laMontes@gmail.com", 151234567, true);
//        HuespedData hue=new HuespedData();
//        hue.bajaHuesped(1);

//BUSCAR HUESPED POR ID CON ESTADO ACTIVO

//         HuespedData hue=new HuespedData();
//         Huesped huespedEncontrado=hue.buscarHuespedPorId(1);
//         if(huespedEncontrado!=null){
//           System.out.println("nombre "+huespedEncontrado.getNombre());
//           System.out.println("apellido "+huespedEncontrado.getApellido());
//           System.out.println("dni "+huespedEncontrado.getDni());
//         }

//BUSCAR HUESPED POR NUMERO DE DNI

//         HuespedData hue=new HuespedData();
//         Huesped huespedEncontrado=hue.buscarHuespedPorDni(12345678);
//         if(huespedEncontrado!=null){
//           System.out.println("nombre "+huespedEncontrado.getNombre());
//           System.out.println("apellido "+huespedEncontrado.getApellido());
//           System.out.println("dni "+huespedEncontrado.getDni());
//         }
//

//LISTAR HUESPEDES

//    HuespedData hue=new HuespedData();
//    for(Huesped huesped:hue.listarHuespedes()){
//        
//        System.out.println(huesped.getNombre());
//        System.out.println(huesped.getApellido());
//        System.out.println(huesped.getDni());
//        System.out.println(huesped.getCorreo());
//        System.out.println(huesped.getCelular());
//    }

//CREAR UNA HABITACION

//        TipoDeHabitacion estandarSimple=new TipoDeHabitacion(1, 1, "Simple", "Estandar Simple", 1500);
//        TipoDeHabitacionData thd=new TipoDeHabitacionData();
//        thd.altaTipoHabitacion(estandarSimple);


//        TipoDeHabitacion estandarDoble=new TipoDeHabitacion(2, 1, "Queen", "Estandar Doble", 2500);
//        TipoDeHabitacionData thd=new TipoDeHabitacionData();
//        thd.altaTipoHabitacion(estandarDoble);

//        TipoDeHabitacion suiteLujo=new TipoDeHabitacion(2, 1, "King Size", "Suite de Lujo", 4500);
//        TipoDeHabitacionData thd=new TipoDeHabitacionData();
//        thd.altaTipoHabitacion(suiteLujo);

//        TipoDeHabitacion suiteLujo=new TipoDeHabitacion(1, 1, "King Size", "Suite de Lujo", 4500, true);
//        TipoDeHabitacionData thd=new TipoDeHabitacionData();
//        thd.altaTipoHabitacion(suiteLujo);

//MODIFICAR TIPO HABITACION

//        TipoDeHabitacion suiteLujo=new TipoDeHabitacion(5, 2, 1, "King Size", "Suite de Lujo", 5500);
//        TipoDeHabitacionData thd=new TipoDeHabitacionData();
//        thd.modificarTipoDeHabitacion(suiteLujo);

//ELIMINAR TIPO HABITACION

//        TipoDeHabitacion suiteLujo=new TipoDeHabitacion(2, 1, "King Size", "Suite de Lujo", 4500, true);
//        TipoDeHabitacionData thd=new TipoDeHabitacionData();
//        thd.bajaHabitacion(6);

//INSERTAR HABITACION EN DOS TABLAS

         Habitacion Simple = new Habitacion(1,true,null);
         HabitacionData hd=new HabitacionData();
         hd.altaHabitacion(Simple);
         
//       int idTipoDeHabitacion = Simple.getTipoDeHabitacion().getIdTipoDeHabitacion()
//         
//         
//         TipoDeHabitacion estandarSimple=new TipoDeHabitacion(1, 1, "Simple", "Estandar Simple", 1500);
//         TipoDeHabitacionData thd=new TipoDeHabitacionData();
//         thd.altaTipoHabitacion(estandarSimple);
    }
    }
