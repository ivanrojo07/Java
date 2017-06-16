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
public class BurbujaCero {
    
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
        int aux=0;
        System.out.println("Arreglo sin ordenar: "+Arrays.toString(listanumUsuario));

        for(int i = 1; i<=n; i++){
            for(int j=0; j<n-i;j++){
                if(listanumUsuario[j]>listanumUsuario[j+1]){
                    aux = listanumUsuario[j];
                    listanumUsuario[j] = listanumUsuario[j+1];
                    listanumUsuario[j+1]=aux;
                }
            }
        }
        System.out.println("Arreglo ordenado: "+Arrays.toString(listanumUsuario));
    }
}
