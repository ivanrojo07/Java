/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesstring;

/**
 *
 * @author Ivan Rojo
 */
public class OperacionesString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena1 = "Hola";
        String cadena2 = "Mundo";
        
        int enteroAUnir=20;
        double decimal= 15.32;
        
        //concatenar
        /*String concatenacion = cadena1 + " " +cadena2;
        String concatenacion2 = cadena1+ enteroAUnir;
        String concatenacion3 = cadena1.concat(cadena2);
        System.out.println("la concatenación es: "+concatenacion);
        System.out.println("la concatenación es: "+concatenacion2);
         System.out.println("la concatenación es: "+concatenacion3);
        */
        String cadena3 = "Java";
        int contarCadena=cadena3.length();
        System.out.println("La dimension es "+"java".length());
        
        
    }
    
}
