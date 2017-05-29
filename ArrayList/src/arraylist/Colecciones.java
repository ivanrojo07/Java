/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;
import java.util.ArrayList;
/**
 *
 * @author Ivan Rojo
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ArrayList <String> array = new ArrayList<String>();
        ArrayList <String> array = new ArrayList<>();
        array.add("Rojo");
        array.add("Azul");
        array.add("Verde");
        
        
        //for(String elemento: array)
        array.stream().forEach((elemento) -> {
            System.out.println("Valor: "+ elemento);
        });
        if(array.contains("Verde")){
            System.out.println("Si contiene el elemento verde");
        }
    }
    
}
