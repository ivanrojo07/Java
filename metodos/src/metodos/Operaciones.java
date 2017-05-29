/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;
import sun.applet.Main;

/**
 *
 * @author Ivan Rojo
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    
    int num1;
    int num2;
    int sumar;
    int restar;
    int multiplicar;
    int dividir;
    
    /*public void leerNumeros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer número: ");
        num1 = sc.nextInt();
        System.out.println("Escribe el segundo número: ");
        num2 = sc.nextInt();
        
    }*/
    
    public void sumar(int num1, int num2){
      sumar = num1+num2;
    }
    
    /*public void sumar(){
        sumar = num1 + num2;
       
    }*/
    
    public void restar(int num1, int num2){
        restar = num1-num2;
    }
    
    public void multiplicar(int num1, int num2){
        multiplicar = num1* num2;
      
    }
    
    public void dividir(int num1, int num2){
        dividir = num1/num2;
    }
    
    public void imprimirResultado(){
        System.out.println("El resultado de la suma es: "+sumar);
        System.out.println("El resultado de la resta es: "+restar);
        System.out.println("El resultado de la multiplicación es: "+multiplicar);
        System.out.println("El resultado de la división es: "+dividir);
    }
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer número: ");
        int n1 = sc.nextInt();//variable local del metodo
        System.out.println("Escribe el segundo número: ");
        int n2 = sc.nextInt();//variable local del metodo
        
        Operaciones op = new Operaciones();
        
        //op.leerNumeros();//metodo leerNumeros
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        op.imprimirResultado();
    }
}
