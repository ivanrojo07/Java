/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

/**
 *
 * @author Ivan Rojo
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v=0, x=0;
        boolean c=true;
        boolean cond=true;
        while(v<=10)//condicion logica
        {
            System.out.println("el valor de v es: "+v);
            v=v+2;//al final debes de dar tu autoincremento para que cumpla con el rango
        }
        while(c){//solo ejecuta operaciones booleanas o logicas
            System.out.println("Hola");
            c=false;//si no cambias tu variable, el while se repetira infinitamente
            
        }
        while(cond)
        {
            System.out.println("El valor de x es: "+x);
            x = x+2;
            if(x>8)
            {
                cond=false;          }
        }
        x=0;
        while(cond==false)
        {
            System.out.println("El valor de equis es: "+x);
            x = x+2;
            if(x>8)
            {
                cond=true;          }
        }
    }
    
}