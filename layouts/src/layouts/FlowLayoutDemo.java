/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layouts;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Ivan Rojo
 */
public class FlowLayoutDemo extends JFrame{

    private JButton botonEnviar;
    private JTextField cajaTexto;
    private JLabel etiqueta;
    
    
    public FlowLayoutDemo(){
        
        botonEnviar = new JButton("Enviar");
        cajaTexto = new JTextField(12);
        etiqueta = new JLabel("Escribe tu nombre: ");
        
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        this.add(etiqueta);
        this.add(cajaTexto);
        this.add(botonEnviar);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        pack();
        
    }
    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
    
}
