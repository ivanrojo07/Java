/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclofor;

/**
 *
 * @author Ivan Rojo
 */
public class CicloFOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int contador=0;contador<=10;contador++)//tres partes, variable que sirve de contador, rango que delimita el for
            //y autoincremento 
        {
            System.out.println("Hola no.:"+contador);
            
        
        }
        for(int cont=10;cont>=0;cont--)
        {
            System.out.println("Adiós no.:"+cont);
        }
        for(int c=1;c<=10000;c=c*2)
        {
            
            System.out.println("El contador vale: "+c);
            
        }
        
        for(int c=1;c<=20;c++)
        {
            c=c*2;
            System.out.println("El contador vale: "+c);
            
        }
        
    }
    
}
