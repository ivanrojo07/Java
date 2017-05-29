/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Ivan Rojo
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] arreglo1 = new String[5];//arreglo sin inicializar
        int [] arreglo2 = { 52,1602,24,29,42};
        
        arreglo1[0]="uno";
        arreglo1[1]="dos";
        arreglo1[2]="tres";
        arreglo1[3]="cuatro";
        arreglo1[4]="cinco";
       
        
        System.out.println(arreglo1[0]);
        for(int i=0; i<arreglo1.length;i++){
            System.out.println(arreglo1[i]);
        }
        
        
        for(int i=0; i<arreglo2.length;i++){
            System.out.println(arreglo2[i]);
        }
        System.out.println(arreglo2.length);
        
    }
    
}
