/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Ivan Rojo
 */
public class Label extends JFrame{
    
    public Label(){
        ImageIcon icon = new ImageIcon("foto.jpg");
        JLabel etiqueta = new JLabel(icon);
        //JLabel etiqueta = new JLabel(new ImageIcon("foto.jpg"));
    
    etiqueta.setBounds(200,200,50,20);
    //etiqueta.setIcon(new ImageIcon("foto.jpg"));
    
    add(etiqueta);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,300);
    setVisible(true);
    }
    
    public static void main(String[] args) {
        Label obj = new Label();
    }
}
