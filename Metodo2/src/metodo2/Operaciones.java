/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo2;

import java.util.Scanner;

/**
 *
 * @author Ivan Rojo
 */
public class Operaciones {

    public int sumar(int num1, int num2){
      int sumar = num1+num2;
      return sumar;
    }
    
    /*public void sumar(){
        sumar = num1 + num2;
       
    }*/
    
    public int restar(int num1, int num2){
        int restar = num1-num2;
        return restar;
    }
    
    public int multiplicar(int num1, int num2){
        int multiplicar = num1* num2;
        return multiplicar;
    }
    
    public int dividir(int num1, int num2){
        int dividir = num1/num2;
        return dividir;
    }
    
    public void imprimir(int suma, int resta, int multiplica, int dividi){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplica);
        System.out.println("La división es: "+dividi);
    }
    
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer número: ");
        int n1 = sc.nextInt();//variable local del metodo
        System.out.println("Escribe el segundo número: ");
        int n2 = sc.nextInt();//variable local del metodo
        
        Operaciones op = new Operaciones();
        
        //op.leerNumeros();//metodo leerNumeros
        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int multiplica = op.multiplicar(n1, n2);
        int divide =op.dividir(n1, n2);
        
        op.imprimir(suma, resta, multiplica, divide);
    }
    
}
