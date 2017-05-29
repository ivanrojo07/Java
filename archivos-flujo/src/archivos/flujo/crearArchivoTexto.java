/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos.flujo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivan Rojo
 */
public class crearArchivoTexto {
    public static void main(String[] args) {
        FileWriter fw = null;
        PrintWriter salida = null;
        try{
            Scanner sc = new Scanner(System.in);
            fw = new FileWriter("C:/archivos/datos.txt");
            salida = new PrintWriter(fw);
            String cadena;
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN: ");
            cadena = sc.nextLine();
            while(!cadena.equalsIgnoreCase("FIN")){//mientras cadena sea diferente de "FIN"
                salida.println(cadena);//imprima en el objeto, la cadena
                cadena = sc.nextLine();//leo la siguiente cadena
            }
            salida.flush();//Cuando use fin, flush graba la salida
        }
        catch (IOException ex){
            Logger.getLogger(crearArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            salida.close();
        }
    }
}
