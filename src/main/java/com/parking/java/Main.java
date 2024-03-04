    package com.parking.java;

import com.parking.java.entities.Cliente;
import com.parking.java.entities.Cupo;
import com.parking.java.entities.Empleado;
import com.parking.java.entities.Pago;
import com.parking.java.entities.TipoVehiculo;
import com.parking.java.entities.Vehiculo;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
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
       Vehiculo motico = new Vehiculo(null, null)
        motico.setPlaca("XS 341");

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
    
         Empleado empleado1 = new Empleado("Luis Stiven", "Fernandez Gaitan", "123");
        //recorrer la lista de vehiculos del cliente
        
       //instanciar cupos
       Cupo cupito1 = new Cupo('A');
       Cupo cupito2 = new Cupo( 'B');

       //crear fechas
       LocalDateTime fechaHoraInicio = LocalDateTime.of (2024,Month.FEBRUARY, 1, 15, 30, 0);
       LocalDateTime fechaHoraFin = LocalDateTime.of (2024,Month.FEBRUARY, 1, 22, 30, 0);

    //hacer registros (pagos) E/S de vehiculos
    Pago pago1 = new Pago(LocalDateTime.of(2024, Month.FEBRUARY, 1, 15, 30, 9), LocalDateTime.of(2024, Month.FEBRUARY, 10, 6, 15, 5), 5000.0, cliente1.misVehiculos.get(0), cupito1, empleado1);
    Pago pago2 = new Pago(fechaHoraInicio, fechaHoraFin, 10000.0, cliente1.misVehiculos.get(1), cupito2, empleado1);

    //añadir pagos a una lista de pagos

    List<Pago> misPagos = new ArrayList<Pago>();
    misPagos.add(pago1);
    misPagos.add(pago2);

    //recorrer los pagos para mostrar información
    for(Pago pago : misPagos){
        //evidencia:
        /*mostrar :
         * -Placa del vehiculo
         * -Valor pagado
         * -Fecha y hora de inicio
         * -Fecha y hora de fin
         * -Cupo(nombre)
         */
        System.out.println("Pago:|Placa:" + pago.getVehiculo().getPlaca() + "|" + "|Valor" + pago.getValor() + "|" + "|Fecha y hora entrada:" + 
                            pago.getFechaHoraInicio().toString() + "|" + "|Cupo" + pago.getCupo().getNombre() + "|" +"|Código empleado:" + pago.getEmpleado().getCodigo() + "|");
    }
}
    
}