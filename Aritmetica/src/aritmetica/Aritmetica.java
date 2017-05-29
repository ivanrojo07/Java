/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

import java.util.Scanner;

/**
 *
 * @author Ivan Rojo
 */
public class Aritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int j;
        int suma;
        int resta;
        int mult;
        int div;
        int modulo;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa el primer número: ");
        i = scan.nextInt();
        System.out.println("Ingresa el segundo número: ");
        j = scan.nextInt();
        
        suma = i+j;
        resta = i-j;
        mult = i*j;
        div = i/j;
        modulo = i%j;
        
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicación es: "+ mult);
        System.out.println("La div es: "+ div);
        System.out.println("El modulo es: "+ modulo);
        
    }
    
}
