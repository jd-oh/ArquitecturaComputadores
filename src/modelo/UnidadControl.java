/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import modelo.IR;

/**
 *
 * @author SRG98
 */
public class UnidadControl {
    int contador;
    int ir; // Traer el ir
    String decodificador;

    public UnidadControl(int contador, int ir, String decodificador) {
        this.contador = contador;
        this.ir = ir;
        this.decodificador = decodificador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getIr() {
        return ir;
    }

    public void setIr(int ir) {
        this.ir = ir;
    }

    public String getDecodificador() {
        return decodificador;
    }

    public void setDecodificador(String decodificador) {
        this.decodificador = decodificador;
    }
    
}
