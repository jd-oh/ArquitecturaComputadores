/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.LectorArchivo;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Juan David
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LectorArchivo lector=new LectorArchivo();
        List<String> lista=new ArrayList<>();
        lista = lector.presentar();
        for (String string : lista) {
            System.out.println(string);
        }
        
    }
    
}
