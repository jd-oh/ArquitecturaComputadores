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
public class BancoRegistros {
    private int datos [] = {};
    private int direcciones [] = {};
    private int control [] = {};

    public BancoRegistros( int [] datos, int [] direcciones, int control []) {
        this.datos = datos;
        this.direcciones = direcciones;
        this.control = control;
    }

    public int[] getDatos() {
        return datos;
    }

    public void setDatos(int[] datos) {
        this.datos = datos;
    }

    public int[] getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(int[] direcciones) {
        this.direcciones = direcciones;
    }

    public int[] getControl() {
        return control;
    }

    public void setControl(int[] control) {
        this.control = control;
    }
    
}
