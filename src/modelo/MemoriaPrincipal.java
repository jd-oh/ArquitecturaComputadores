/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

import java.util.HashMap;
/**
 *
 * @author SRG98
 */
public class MemoriaPrincipal {
    private int capacidad;
    private HashMap<Long, Long> datosDireccion = new HashMap<>(); //Izquierda dato, derecha dirección

    public MemoriaPrincipal(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public HashMap<Long, Long> getDatosDireccion() {
        return datosDireccion;
    }

    public void setDatosDireccion(HashMap<Long, Long> datosDireccion) {
        this.datosDireccion = datosDireccion;
    }
    
    
    
    
}
