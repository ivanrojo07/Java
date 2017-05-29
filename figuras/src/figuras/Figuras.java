/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Ivan Rojo
 */
public class Figuras extends JPanel {

    /**
     * @param args the command line arguments
     */
    //con esta variable el usuario elegira que figura dibujar
    private int opcion;
    
    //el constructor va a establecer la opción del usuario
    public Figuras(int opcionUsuario){
        opcion = opcionUsuario;
    }
    
    //este metodo dibuja una cascada de figuras, empezando desde la esquina superior izquierda
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for(int i=0;i<10;i++){
            
            switch(opcion){
                case 1: //Dibuja rectangulos
                    int xRect = 10+i*10;
                    int yRect = 10+i*10;
                    int anchoRect = 50+i*10;
                    int altoRect = 50+i*10;
                    g.drawRect(xRect, yRect, anchoRect, altoRect);
                    break;
                
                case 2://DIBUJA OVALOS
                    int xOval = 10+i*10;
                    int yOval = 10+i*10;
                    int anchoOval = 50+i*10;
                    int altoOval = 50+i*10;
                    g.drawOval(xOval, yOval, anchoOval, altoOval);
                    break;
            }
        }
    }
    
    
}
