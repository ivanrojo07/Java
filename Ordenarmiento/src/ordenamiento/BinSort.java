/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Ivan Rojo
 */
public class BinSort {
    public static void main(String[] args) {
        int tamañocontenedor = 5;
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
        
        int casillero = n;
        //Determina los valores maximos y minimos
        int minimo = listanumUsuario[0];
        int maximo = listanumUsuario[0];
        for(int i=1; i<listanumUsuario.length; i++){
            if(listanumUsuario[i]<minimo){
                minimo = listanumUsuario[i];
            }
            else if (listanumUsuario[i]>maximo){
                maximo = listanumUsuario[i];
            }
        }
        
        //inicializa el ordenamiento
        int contador = (maximo-minimo)/tamañocontenedor+1;
        List<List<Integer>> contenedor;
        contenedor = new ArrayList<List<Integer>>;
        for(int i=0; i<contador;i++){
            contenedor.add(new ArrayList<I)
        
    }
}