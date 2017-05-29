/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos.flujo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivan Rojo
 */
public class CrearArchivoBinario {
    private ObjectOutputStream salida;
    
    public void abrirArchivo(){
        try {
            salida = new ObjectOutputStream(new FileOutputStream("oersonas.ser"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CrearArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CrearArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void agregarRegistros(){
        Persona objPersona;
        String nombre;
        String direccion;
        String nacionalidad;
        int edad;
        double salario;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca los datos de la persona, \n para terminar escriba el indicador"
        +"de fin de archivos. \n Para UNIX/Linux o Mac OS X escriba <ctrl> d y oprima intro."
        +"Para Windows escriba \n <ctrl> z y oprima intro. \n\n");
        
        System.out.println("Escriba el nombre, la dirección, la nacionalidad, \n"
        +"la edad y el salario de la persona");
        
        while (entrada.hasNext()){
            
            try{
                nombre = entrada.next();
                direccion = entrada.next();
                nacionalidad = entrada.next();
                edad = entrada.nextInt();
                salario = entrada.nextDouble();
                
                objPersona = new Persona(nombre,direccion,nacionalidad,edad,salario);
                salida.writeObject(objPersona);
                
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
            
            System.out.println("Escriba el nombre, la dirección, la nacionalidad, \n"
                +"la edad y el salario de la persona");
        }
    }
    
    public void cerrarArchivo(){
        try{
            if(salida != null){
                salida.close();
                
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        CrearArchivoBinario aplicacion = new CrearArchivoBinario();
        aplicacion.abrirArchivo();
        aplicacion.agregarRegistros();
        aplicacion.cerrarArchivo();
    }
}
