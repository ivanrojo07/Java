/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Ivan Rojo
 */
public class dowhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        do{
            System.out.print("Ingrese un valor entre 0 y 999 (0 finaliza): ");
            valor = teclado.nextInt();
            if(valor>=100){
                System.out.println("Tiene 3 digitos");   
            }
            else{
                if(valor>=10){
                    System.out.println("Tiene 2 digitos");
                }
                else{
                    System.out.println("Tiene 1 digito");
                }
            }
        }while(valor!=0);
    }
}
