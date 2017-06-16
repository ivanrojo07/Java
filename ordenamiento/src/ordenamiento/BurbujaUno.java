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
public class BurbujaUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear cadena
//        int[] listnum = {21,24,29,50,48,15,84,2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero del arreglo: ");
        int n = sc.nextInt();
        int[] listanumUsuario = new int[n];
        System.out.println(listanumUsuario.length);
        for(int c=0;c<= listanumUsuario.length-1;c++){
            Scanner scan = new Scanner(System.in);
            System.out.println("Inserte un numero: ");
            int num = scan.nextInt();
            listanumUsuario[c] = num;
        }
        int aux;
        System.out.println("Arreglo sin ordenar: "+Arrays.toString(listanumUsuario));
        int i = 0;
        //int n = listnum.length+1;
        boolean ordenado = false;
        while(i<n && ordenado == false){
            i +=1;
            ordenado = true;
            for(int j=0; j<n-i;j++){
                if(listanumUsuario[j]>listanumUsuario[j+1]){
                    ordenado= false;
                    aux = listanumUsuario[j];
                    listanumUsuario[j] = listanumUsuario[j+1];
                    listanumUsuario[j+1]= aux;
                 }
            }
        }
        System.out.println("Arreglo ordenado: "+Arrays.toString(listanumUsuario));
        
    }
    
}
