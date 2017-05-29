/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package envoltorios;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivan Rojo
 */
public class ConversionNumerosCadenas {
    public static void main(String[] args) {
        //numeros a cadenas de caracteres
        int i = 5;
        byte o=10;
        short s =60;
        double d= 25.4;
        float f = 96.3f;
        
        String sI=""+i;
        String sO= String.valueOf(o);
        String sS=Double.toString(d);
        String sD=Short.toString(s);
        String sF=String.valueOf(f);
        
        String valor = JOptionPane.showInputDialog("Introduzca un numero: ");
        double valor1 = Double.parseDouble(valor);
        double suma = valor1+5;
        System.out.println(suma);
    }
}
