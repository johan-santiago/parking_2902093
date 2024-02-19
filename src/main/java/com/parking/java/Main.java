    package com.parking.java;

import com.parking.java.entities.Cliente;
import com.parking.java.entities.TipoVehiculo;
import com.parking.java.entities.Vehiculo;

public class Main {
    public static void main(String[] args) {
       //Sistema de gestion de e/s
       //de vehiculos en un parking
       //1. dos carritos:
       //Objetos (Instancias)
       //1. tipo de clase
       //2. nombre del objeto
       //2. asignacion y new
       //4. constructor del objeto
       Vehiculo carrito1 = new Vehiculo("ASD 789",
                             TipoVehiculo.PARTICULAR);
       carrito1.placa = "ASD 789";
       carrito1.tipoVehiculo = TipoVehiculo.PARTICULAR;
       Vehiculo carrito2 = new Vehiculo("SDF 232",
       TipoVehiculo.MOTO);
       carrito2.placa = "SDF 232";
       carrito2.tipoVehiculo = TipoVehiculo.MOTO;
   

       System.out.println(carrito1.placa);
       System.out.println(carrito2.tipoVehiculo);
        //crear(instanciar) un cliente
        Cliente cliente1 = new Cliente("johan Esteban","Martinez Trujillo",13124123L);
        cliente1.nombres = "Johan Esteban";
        cliente1.apellidos = "Martinez Trujillo";
        cliente1.numeroIdentificacion = 13124123L;
        //invocar el metodo addCar
        cliente1.addVehicle(carrito1);
        cliente1.addVehicle(carrito2);
    cliente1.addVehicle("WWW ERT",
                    TipoVehiculo.MOTO);
        //recorrer la lista de vehiculos del cliente
        
        for(Vehiculo v :cliente1.misVehiculos){
                System.out.println(v.placa);
            System.out.println(v.tipoVehiculo);
            System.out.println("--------");
            }
    }
    
}