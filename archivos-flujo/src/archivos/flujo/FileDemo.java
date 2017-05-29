/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos.flujo;

import java.io.File;

/**
 *
 * @author Ivan Rojo
 */
public class FileDemo {

    //File nombre = new File("C:/installing.exe");
    public void analizarArchivo(String ruta){
        File nombre = new File(ruta);
        
        if(nombre.exists()){
            System.out.append(nombre.getName()+"si existe\n");
            if(nombre.isFile()){
                System.out.println("Es un archivo");
                
            }
            else if(nombre.isDirectory()){
                System.out.println("Es un directorio");
            }
            if(nombre.isAbsolute()){
                System.out.println("Es ruta absoluta");
            }
            else{
                System.out.println("No es ruta absoluta");
            }
            System.out.println("La ultima modificacion fue: "+nombre.lastModified());
            System.out.println("Tamaño de archivo: "+nombre.length());
            System.out.println("Su ruta es: "+ nombre.getPath());
            System.out.println("Su ruta absoluta es: "+nombre.getAbsolutePath());
            
            if(nombre.isDirectory()){
                String directorio[] = nombre.list();
                System.out.println("Contenido del directorio: \n");
                
                for(String nombreDirectorio:directorio){
                    System.out.println("El nombre del directorio es: "+
                            nombreDirectorio);
                }
            }
            
        }
        else{
            System.out.println(ruta +"no existe");
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        FileDemo demo = new FileDemo();
        System.out.println(demo.nombre.exists());//Devuelve true si el archivo
        //se encuentra, false si no.*/
        FileDemo demo = new FileDemo();
        demo.analizarArchivo("C:/");
    }
    
}
