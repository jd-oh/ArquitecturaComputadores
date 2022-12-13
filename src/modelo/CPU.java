/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Juan David
 */
public class CPU {
    private ALU alu;
    private String IR;
    private String MAR;
    private String MBR;
    private String PC;

    public CPU(ALU alu, String IR, String MAR, String MBR, String PC) {
        this.alu = alu;
        this.IR = IR;
        this.MAR = MAR;
        this.MBR = MBR;
        this.PC = PC;
    }

    public ALU getAlu() {
        return alu;
    }

    public void setAlu(ALU alu) {
        this.alu = alu;
    }

    public String getIR() {
        return IR;
    }

    public void setIR(String IR) {
        this.IR = IR;
    }

    public String getMAR() {
        return MAR;
    }

    public void setMAR(String MAR) {
        this.MAR = MAR;
    }

    public String getMBR() {
        return MBR;
    }

    public void setMBR(String MBR) {
        this.MBR = MBR;
    }

    public String getPC() {
        return PC;
    }

    public void setPC(String PC) {
        this.PC = PC;
    }
    
    

}
