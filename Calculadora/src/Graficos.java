
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan Rojo
 */
public class Graficos {
    public static void main(String[] args){
    String n1 = JOptionPane.showInputDialog("Introduzca el primer numero");
    String n2 = JOptionPane.showInputDialog("Introduzca el segundo numero");
    //convertir string en variables double
    
    double num1 = Double.parseDouble(n1);
    double num2 = Double.parseDouble(n2);
    
    //Llamas a la clase
    Operaciones op = new Operaciones();
    
    //llamas a los operadores
    
    double suma = op.sumar(num1, num2);
    double resta = op.restar(num1, num2);
    double multi = op.multiplicar(num1, num2);
    double divi = op.dividir(num1, num2);
    
    //crear cuadros de dialogos
    JOptionPane.showMessageDialog(null,"Suma: "+ suma);
    JOptionPane.showMessageDialog(null,"Resta: "+ resta);
    JOptionPane.showMessageDialog(null,"Multiplicación: "+ multi);
    JOptionPane.showMessageDialog(null,"División: "+ divi);
    
           
    }
}
