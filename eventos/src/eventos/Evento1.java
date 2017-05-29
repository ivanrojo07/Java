/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Ivan Rojo
 */
public class Evento1 extends JFrame{

    public Evento1(){
        
        JLabel lblSaludo = new JLabel();
        lblSaludo.setBounds(25,10,200,30);
        
        JLabel lblInstruccion = new JLabel("Ingresa tu nombre: ");
        lblInstruccion.setBounds(25,165,200,30);
        JTextField campoSaludo = new JTextField(200);
        campoSaludo.setBounds(25, 200, 200, 30);
        JButton boton = new JButton("Saludar");
        boton.setBounds(25, 235, 150, 30);
        
        
        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblSaludo.setText("Hola "+ campoSaludo.getText());
            }
        };//interfaz
        boton.addActionListener(l);//añadir escuchador
        
        /*
        MouseListener listener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getSource() == campoSaludo){
                    lblSaludo.setText("MouseClicked dentro del campo saludo");
                }
                if(e.getSource() == boton){
                    lblSaludo.setText("MouseClicked dentro del boton");
                }
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                lblSaludo.setText("MousePressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                lblSaludo.setText("MouseReleased");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblSaludo.setText("MouseEntered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
             lblSaludo.setText("MouseExited");   
            }
        };
        
        boton.addMouseListener(listener);
        campoSaludo.addMouseListener(listener);
        */
        add(lblSaludo);
        add(lblInstruccion);
        add(campoSaludo);
        add(boton);
        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new Evento1();
    }
    
}
