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
public class CocktailSort {
    public static void main(String[] args) {
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
        System.out.println("Arreglo sin ordenar: "+Arrays.toString(listanumUsuario));
        int izq =0;
        int der= listanumUsuario.length;
        int ultimo=n;
        int aux=0;
        
        boolean ordenado;
        
        do{
            
            ordenado =false;
            
            for (int i =izq; i<=  der  - 2;i++) {
                if (listanumUsuario[ i ] > listanumUsuario[ i + 1 ]) {
                    //test whether the two elements are in the wrong order
                    aux = listanumUsuario[i];
                    listanumUsuario[i] = listanumUsuario[i+1];
                    listanumUsuario[i+1]=aux;
                    ordenado = true;
                }
            }
            
            if (!ordenado) {
        //we can exit the outer loop here if no swaps occurred.
                break;
            }
            
            ordenado=false;
            
            for (int j= der - 2;j>=izq;j--) {
                if (listanumUsuario[ j ] > listanumUsuario[ j + 1 ]) {
                    aux = listanumUsuario[j];
                    listanumUsuario[j] = listanumUsuario[j+1];
                    listanumUsuario[j+1]=aux;
                    ordenado = true;
                }
            }
            
            
        }while(ordenado == true);
        
        System.out.println("Arreglo ordenado: "+Arrays.toString(listanumUsuario));
    }
}
