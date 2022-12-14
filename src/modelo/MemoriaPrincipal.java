/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.HashMap;
/**
 *
 * @author SRG98
 */
public class MemoriaPrincipal {
    private int capacidad;
    private HashMap<String, String> direccionDatos = new HashMap<>(); //Izquierda direccion, derecha dato
    private HashMap<String, String> direccionVariable=new HashMap<>();  //Izquierda direccion, derecha variable

    public MemoriaPrincipal(int capacidad, HashMap<String, String> direccionDatos) {
        this.capacidad = capacidad;
        this.direccionDatos=direccionDatos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public HashMap<String, String> getDatosDireccion() {
        return direccionDatos;
    }

    public void setDatosDireccion(HashMap<String, String> datosDireccion) {
        this.direccionDatos = datosDireccion;
    }


    public HashMap<String, String> getDireccionVariable() {
        return direccionVariable;
    }

    public void setDireccionVariable(HashMap<String, String> direccionVariable) {
        this.direccionVariable = direccionVariable;
    }
    
    

    
    
    
    
    
}
