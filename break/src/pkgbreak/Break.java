/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgbreak;

/**
 *
 * @author Ivan Rojo
 */
public class Break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cuenta;
        for(cuenta = 1; cuenta<=10;cuenta++){
            if (cuenta==5)//si cuenta es igual a 5
            {
                break;
            }
            System.out.println("Cuenta es: "+cuenta);
            
        }//fin del for
        
        System.out.println("Salio del ciclo en cuenta = "+ cuenta);
    }
    
}
