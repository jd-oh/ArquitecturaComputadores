/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicial;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;

/**
 *
 * @author Santiago Roncancio González
 */
public class Main {

    static List<String> lista = new ArrayList<>();
    String vector[] = new String[60];
    int cont = 0;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Main lee = new Main();
        lee.presentar();
    }

    public String[] presentar() {
        JFileChooser buscador = new JFileChooser();
        buscador.showOpenDialog(buscador);

        try {
            String patch = buscador.getSelectedFile().getAbsolutePath();

            FileInputStream archivo = new FileInputStream(patch);
            DataInputStream entrada = new DataInputStream(archivo);

            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String lineas;

            while ((lineas = buffer.readLine()) != null) {
                lista.add(lineas);
                vector[cont] = lineas;
                cont++;
            }
            entrada.close();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        String[] segundo = new String[cont];

        for (int i = 0; i < segundo.length; i++) {
            segundo[i] = vector[i];
        }
        System.out.println();

        return segundo;
    }
}