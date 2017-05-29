/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgcontinue;

/**
 *
 * @author Ivan Rojo
 */
public class Continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int cuenta=1; cuenta <=10; cuenta ++){
            if(cuenta == 5){
                continue;
            }
            System.out.println("La cuenta es: "+ cuenta);
            System.out.println("Impresion despues del valor");
        }
        System.out.println("Se uso el continue para omitir imprimir el 5");
    }
    
}
