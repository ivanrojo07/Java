/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package envoltorios;

/**
 *
 * @author Ivan Rojo
 */
public class Wrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int numero = 9;
         Integer objInt = new Integer(numero);
         
         double numAdouble = objInt.doubleValue();
         short numeroAshort = objInt.shortValue();
         
        int comparacion = Integer.compare(15,16);
        
        System.out.println("comparacion: "+comparacion);
    }
    
}
