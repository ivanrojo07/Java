/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Ivan Rojo
 */
public class Objetos {
    String nombre;
    String color;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Objetos obj1 = new Objetos();
        Objetos obj2 = new Objetos();
        
        obj1.nombre = "taza";
        obj2.nombre = "pelota";
        obj1.color = "blanco";
        obj2.color = "rojo";
        
        System.out.println("El nombre del objeto 1 es: "+ obj1.nombre);
        System.out.println("El color del objeto 1 es: "+ obj1.color);
        System.out.println("El nombre del objeto 2 es: "+ obj2.nombre);
        System.out.println("El color del objeto 2 es: "+ obj2.color);
    }
    
}
