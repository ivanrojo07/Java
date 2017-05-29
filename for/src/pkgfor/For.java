/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfor;

/**
 *
 * @author Ivan Rojo
 */
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i =0; i<=10; i++){
            System.out.print("El valor de i es: "+i+"\n");
        }
        int c=5;
        System.out.print("El valor de c es: "+c+"\n");
        System.out.print("El valor de c es: "+ c++ +"\n");//preincremento
        System.out.print("El valor de c es: "+c+"\n");
        
        c=5;
        System.out.print("El valor de c es: "+c+"\n");
        System.out.print("El valor de c es: "+ ++c +"\n");//postincremento
        System.out.print("El valor de c es: "+c+"\n");
        
        
    }
    
}
