/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos.flujo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Ivan Rojo
 */
public class LeerArchivoTexto {
    
    public static void main(String[] args) {
        FileReader fr = null;
        
        try{
            fr = new FileReader("c:/archivos/datos.txt");
            BufferedReader entrada = new BufferedReader(fr);
            /*String cadena = entrada.readLine();
            while(cadena !=null){
                System.out.println(cadena);
                cadena = entrada.readLine();
            }*/
            int car = entrada.read();
            while(car !=-1){
                System.out.println((char)car);
                car = entrada.read();
            }
          
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    
finally{
    try{
        if(fr !=null){
        fr.close();
        }
    }
    catch (IOException e){
        System.out.println(e.getMessage());
    }
}
}
}