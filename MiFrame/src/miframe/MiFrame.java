/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miframe;

import javax.swing.JFrame;

/**
 *
 * @author Ivan Rojo
 */
public class MiFrame extends JFrame{
    public MiFrame(){
        setSize(200, 200);
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiFrame ventana = new MiFrame();
    }
    
}
