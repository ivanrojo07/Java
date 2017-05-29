/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreach;

/**
 *
 * @author Ivan Rojo
 */
public class Foreach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arreglo = {87,64,42,24,29,23,32,45,16,802};
        int total =0;
        
        for (int i=0; i<arreglo.length;i++){//ciclo for normal
            total +=arreglo[i];
        }
        
        for(int numero: arreglo){//ciclo foreach
            //total += numero;
            System.out.println(numero);
            total += numero;
            
        }
        System.out.println(total);
    }
    
}
