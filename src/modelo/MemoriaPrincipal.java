/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author SRG98
 */
public class MemoriaPrincipal {
    private int capacidad;
    private int dato [] = {};

    public MemoriaPrincipal(int capacidad, int [] dato) {
        this.capacidad = capacidad;
        this.dato = dato;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int[] getDato() {
        return dato;
    }

    public void setDato(int[] dato) {
        this.dato = dato;
    }
    
    
    
}
