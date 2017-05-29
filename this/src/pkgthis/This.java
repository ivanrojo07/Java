/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgthis;

/**
 *
 * @author Ivan Rojo
 */
public class This {

    int variable = 5;
    Clase2 obj2 = new Clase2();
    
    public This(){
        
        this("Javier");
        System.out.println("Constructor sin parametros");
        
        
    }
    
    public This(String nombre){
        System.out.println("El nombre es: "+nombre);
        
    }
    
    public void metodo(int variable){
        System.out.println("El valor de variable es: "+ this.variable);
        System.out.println("El valor de variable es: "+ variable);
        
    }
    
    public void metodo2(){
        obj2.metodo(10);
        this.metodo(10);
    }
    
    public void metodo3(This obj){
        
    }
    
    public void metodo4(){
        this.metodo3(this);
    }
    public static void main(String[] args) {
        This obj = new This();
        obj.metodo(20);
        
    }
    
}
