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
        public static String convertirDecimalABinario(long decimal) {
		return Long.toBinaryString(decimal);
	}
        
          public static int BinaryToDecimal(String binario){  
           
        
        int decimal=Integer.parseInt(binario,2);  
         return decimal;
    }  
          
              public static boolean isNumeric(String s)
    {
        if (s == null || s.equals("")) {
            return false;
        }
 
        return s.chars().allMatch(Character::isDigit);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        LectorArchivo lector=new LectorArchivo();
//        List<String> lista=new ArrayList<>();
//        lista = lector.presentar();
//        for (String string : lista) {
//            System.out.println(string);
//        }
        int n=0;
        n=15;
        System.out.println(convertirDecimalABinario(n));
        n++;
        System.out.println(convertirDecimalABinario(n));
        
        System.out.println(BinaryToDecimal("1111"));
        
        System.out.println(isNumeric("55885"));
    }
    
}
