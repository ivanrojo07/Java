/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproy;

/**
 *
 * @author Ivan Rojo
 */
public class Husky extends Perro{
    public Husky(){
        System.out.println("Constructor de Husky");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Husky amigo = new Husky();//HEREDARA TODOS LOS CONSTRUCTORES
    }
    
}
