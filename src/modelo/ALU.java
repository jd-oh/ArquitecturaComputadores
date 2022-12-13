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
public class ALU {
    /** 
     ADD = 000
     SUB = 001
     DIV = 010
     MUL = 011
     ABS = 100
     NEG = 101
     INC = 110
     DEC = 111
     */

    private int operador1;
    private int operador2;
    private int resultado;

    public ALU(int operador1, int operador2, int resultado) {
        this.operador1 = operador1;
        this.operador2 = operador2;
        this.resultado = resultado;
    }

    public int getOperador1() {
        return operador1;
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    public int getOperador2() {
        return operador2;
    }

    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    
}
