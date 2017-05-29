/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author Ivan Rojo
 */
public class Constructores {
    public Constructores(){//constructor
        
        System.out.println("Hola soy el constructor");
        
    }
    
    public Constructores(int a, int b){
        int suma = a+b;
        System.out.println("La suma es: "+suma);
    }
    
    public Constructores(final Constructores c){
        //constructor copia
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Constructores obj = new Constructores();
        Constructores ob2 = new Constructores(5,6);
        Constructores ob3 = new Constructores(ob2);
        
    }
    
}
