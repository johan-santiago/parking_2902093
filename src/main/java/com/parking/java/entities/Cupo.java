package com.parking.java.entities;

public class Cupo { 
    private char nombre;
//constructor por defecto
    public Cupo() {
    }      
//constructor parametrizado
    public Cupo(char nombre) {
        this.nombre = nombre;
    }
    public char getNombre() {
        return nombre;
    }
    public void setNombre(char nombre) {
        this.nombre = nombre;
    }



}
