/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ivan Rojo
 */
public class Insersion {


    
    public static void main(String[] args) {
       Insersion orden = new Insersion();
       Scanner sc = new Scanner(System.in);
        System.out.println("Numero del arreglo: ");
        int n = sc.nextInt();
        int[] listanumUsuario = new int[n];
        for(int c=0;c<= listanumUsuario.length-1;c++){
            Scanner scan = new Scanner(System.in);
            System.out.println("Inserte un numero: ");
            int num = scan.nextInt();
            listanumUsuario[c] = num;
        }
        
        int[] ordenarInsercion = orden.ordenarInsercion(listanumUsuario);
        System.out.println("Arreglo sin ordenar: "+Arrays.toString(listanumUsuario));
        System.out.println("Ordenamiento: "+Arrays.toString(ordenarInsercion));
        
        
    }
    public int[] ordenarInsercion(int[] array){
        int aux;
        for (int i = 1; i < array.length; i++) {
            aux = array[i];
            for (int j = i-1; j >=0 && array[j]>aux; j--) {
                array[j+1]=array[j];
                array[j]=aux;
            }
        }
        return array;
    }
}
        
    

