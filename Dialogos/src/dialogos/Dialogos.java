/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogos;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
/**
 *
 * @author Ivan Rojo
 */
public class Dialogos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
        //JOptionPane.showMessageDialog(null, "Operación realizada correctamente", "Titulo ventana", JOptionPane.WARNING_MESSAGE);
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        JOptionPane.showMessageDialog(null, "hola: "+nombre);
    }
    
}
