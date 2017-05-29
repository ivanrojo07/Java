/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescritura;

/**
 *
 * @author Ivan Rojo
 */
public class Sobreescritura {
    
    @Override
    public String toString(){
        return "hola";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sobreescritura obj = new Sobreescritura();
        
        System.out.println(obj.toString());
    }
    
}
