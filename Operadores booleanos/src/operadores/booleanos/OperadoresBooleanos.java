/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores.booleanos;

/**
 *
 * @author Ivan Rojo
 */
public class OperadoresBooleanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a =3;
        int b=10;
        //operadores relacionales
        boolean b1= a>b;
        boolean b2= a<b;
        
        //operadores booleanos o logicos
        boolean b3 = b1 && b2;
        boolean b4 = b1 || b2;
        boolean b5 = !b1;
        boolean b6 = b1 ^ b2;
        
        System.out.println(b1+"\n"+b2+"\n"+b3+"\n"+b4+"\n"+b5+"\n"+b6);
    }
    
}
