/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;

/**
 *
 * @author Ivan Rojo
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i = 0;//inicializador
        while(i<100){//
            
            System.out.println("el valor de i es: "+i);
            i = i+1;//contador
        }
        System.out.println("Fin del ciclo");
    }
    
}
