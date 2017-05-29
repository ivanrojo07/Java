/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;

/**
 *
 * @author Ivan Rojo
 */
public class IfElse {

    /**
     * @param args the command line arguments
     * >,>=,<,<=,==,||or, &&and, !not
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var=7;
        boolean cond;
        int var1 = 8;
        
        if ((var==5)||!(var1==8))//not
        {
            cond= true; // utilize un not entonces not true = false, 
            //te dara un adios
        }
        else
        {
            cond = false;
            
        }
        
        if (cond)
        {
            System.out.println("Hola");
        }
        else
        {
            System.out.println("Adiós");
        }
    }
    
}
