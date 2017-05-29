/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estaticos;

/**
 *
 * @author Ivan Rojo
 */
public class Estaticos {

    /**
     * @param args the command line arguments
     */
    //String atrib = "Atributos";
    static String atrib = "Atributos";
    
    public static int sumar (int x, int y){
        int suma = x+y;
        return suma;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Estaticos est1 = new Estaticos();
        Estaticos est2 = new Estaticos();
        
        est1.atrib = "Atributo cambiado";
        
        String var1 = est1.atrib;
        String var2 = est2.atrib;
        
        System.out.println("Variable1 es:" +var1);
        System.out.println("Variable2 es:" +var2);
        
        int suma =Estaticos.sumar(5, 10);
        System.out.println("La suma es: "+suma);
        System.out.println("Atributo : "+Estaticos.atrib);
    }
    
}
