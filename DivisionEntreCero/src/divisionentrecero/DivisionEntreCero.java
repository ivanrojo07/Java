/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisionentrecero;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ivan Rojo
 */
public class DivisionEntreCero {

  
    public static int cociente(int numerador, int denominador){
        return numerador/denominador;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner explorador = new Scanner(System.in);
        boolean continuarCiclo = true;
        
        do{
            try{
                System.out.println("Introduzca un numerador entero:");
                int numerador = explorador.nextInt();
                System.out.println("Introduzca un denominador entero:");
                int denominador = explorador.nextInt();
                
                int resultado = DivisionEntreCero.cociente(numerador, denominador);
                
                System.out.println("Resultado de: "+numerador+"/"+denominador+"= "+resultado);
                break;
            }
            catch(InputMismatchException exception){
                System.err.println("Se produjo una excepcion: "+exception);
                explorador.nextLine();
                
                System.out.println("Debe de introducir números enteros. Intente de nuevo. \n");
            }
            catch(ArithmeticException exception){
                System.err.println("\nExcepción "+ exception);
                System.out.println("Cero es un denominador inválido. Intente de nuevo. \n");
            }
        }while(continuarCiclo);
        
        
    }
    
}
