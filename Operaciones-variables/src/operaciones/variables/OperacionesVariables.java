/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones.variables;

/**
 *
 * @author Ivan Rojo
 * short = numeros cortos
 * int =numeros enteros
 * float =numeros flotantes
 * double = numeros doubles
 * byte= se maneja en bytes
 * char =caracteres
 * boolean =verdaderos o falsos
 * string =cadena
 */
public class OperacionesVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int variable1, resultado;
        variable1 = 5;
        resultado = variable1*2;
        System.out.println(variable1);
        System.out.println("el resultado es: "+resultado);
        resultado = variable1-2;
        System.out.println("el resultado es: "+resultado);
        short suma;
        suma= 3+10;
        int resta =8-17;
        long residuo= 9/2;
        float multiplicacion= 2*(15*(-2));
        double division=10/3.1415;
        
        System.out.println("El resultado de la suma es = "+suma);
        System.out.println("El resultado de la resta es = "+resta);
        System.out.println("El resultado de la multiplicación es = "+
                multiplicacion);
        System.out.println("El resultado de la división es = "+division);
        System.out.println("El resultado del residuo es = "+residuo);
    }
    
}