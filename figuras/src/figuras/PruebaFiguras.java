/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan Rojo
 */
public class PruebaFiguras {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Escriba 1 para dibujar rectangulos \n Escriba 2 para dibujar ovalos");
        
        int opcion = Integer.parseInt(entrada);
        
        Figuras fig = new Figuras(opcion);
        
        JFrame ventana =new JFrame();
        
        ventana.add(fig);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300,300);
        ventana.setVisible(true);
         
    }
}
