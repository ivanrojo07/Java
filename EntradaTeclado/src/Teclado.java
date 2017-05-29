/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan Rojo
 */
import java.util.Scanner;

public class Teclado {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Escribe tu edad: ");
        int edad = scn.nextInt();
        System.out.println("Gracias por darnos tu información");
        System.out.println("Tu edad es: "+edad);
    }
}
