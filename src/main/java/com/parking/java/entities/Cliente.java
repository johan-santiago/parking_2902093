package com.parking.java.entities;

import java.util.List;
import java.util.ArrayList;


public class Cliente {
    private String nombres;
    private String apellidos;
    private Long numeroIdentificacion;
    private List<Vehiculo> misVehiculos = 
            new ArrayList<Vehiculo>();
    //definir metodo de clase
    //addCar: vincular un carrito al cliente
    public void addVehicle (Vehiculo vehiculo){
        //añadir el carrito a la Lista
        //this: para acceder a atributos
        //y metodos al interior del objeto
        //NOTA: usenla al interior de metodos
        this.misVehiculos.add(vehiculo);
    
    }
public Cliente(String nombres, String apellidos, Long numeroIdentificacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
    }
//otra sobrecarga del método
//addVehicle
public void addVehicle(String placa,
                    TipoVehiculo tv){
Vehiculo v = new Vehiculo();
/*utilizando el setter de Placa
 * para asignar valor de placa 
 * al vehiculo
 */
v.setPlaca(placa);
v.setTipoVehiculo(tv);
this.misVehiculos.add(v);

}
public String getNombres() {
    return nombres;
}
public void setNombres(String nombres) {
    this.nombres = nombres;
}
public String getApellidos() {
    return apellidos;
}
public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}
public Long getNumeroIdentificacion() {
    return numeroIdentificacion;
}
public void setNumeroIdentificacion(Long numeroIdentificacion) {
    this.numeroIdentificacion = numeroIdentificacion;
}
public List<Vehiculo> getMisVehiculos() {
    return misVehiculos;
}
public void setMisVehiculos(List<Vehiculo> misVehiculos) {
    this.misVehiculos = misVehiculos;
}


}

