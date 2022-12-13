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

    private int operador1;
    private int operador2;
    private int resultado;

    public ALU(int operador1, int operador2, int resultado) {
        this.operador1 = operador1;
        this.operador2 = operador2;
        this.resultado = resultado;
    }
    
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
}
