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
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Ivan Rojo
 */
public class EventosMouse extends JFrame{

    public EventosMouse(){
        
        //JLabel lblSaludo = new JLabel();
        //lblSaludo.setBounds(25,10,200,30);
        JLabel movedX = new JLabel("Moved x: ");
        movedX.setBounds(25,10,100,30);
        JLabel movedY = new JLabel("Moved y: ");
        movedY.setBounds(230,10,100,30);
        JLabel draggedX = new JLabel("Dragged x: ");
        draggedX.setBounds(25, 40, 100, 30);
        JLabel draggedY = new JLabel("Dragged y: ");
        draggedY.setBounds(230, 40, 100, 30);
        
        JLabel lblInstruccion = new JLabel("Ingresa tu nombre: ");
        lblInstruccion.setBounds(25,165,200,30);
        JTextField campoSaludo = new JTextField(200);
        campoSaludo.setBounds(25, 200, 200, 30);
        JButton boton = new JButton("Saludar");
        boton.setBounds(25, 235, 150, 30);
        
        /*MouseListener listener = new MouseListener() {
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
        };*/
        MouseListener listener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent event) {
                if(event.isAltDown()){
                    System.out.println("alt");
                }
                else if(event.isControlDown()){
                    System.out.println("control");
                }
                else if(event.isShiftDown()){
                    System.out.println("shift");
                }
                else if(event.isMetaDown()){
                    System.out.println("click derecho"); 
               }
                else if(event.getClickCount() ==2){
                    System.out.println("Doble Click izquierdo");
                }
                else {
                    System.out.println("click izquierdo");
                }
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
             
            }
        };
        
        MouseWheelListener wheel = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent event) {
                if(event.getPreciseWheelRotation()==-1){
                    System.out.println("Rueda hacia arriba");
                }
                if(event.getPreciseWheelRotation()==1){
                    System.out.println("Rueda hacia arriba");
                }
            }
        };
        
        MouseMotionListener motionListener = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                 draggedX.setText("Dragged x: "+e.getX() );
                 draggedY.setText("Dragged y: "+e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                movedX.setText("Moved x: "+e.getX());
                movedY.setText("Moved y: "+e.getY());
            }
        };
        
        //boton.addMouseListener(listener);
        //campoSaludo.addMouseListener(listener);
        campoSaludo.addMouseWheelListener(wheel);
        //Implementar la clase MouseMotionListener dentro de la Frame
        this.addMouseMotionListener(motionListener);
        
        //add(lblSaludo);
        add(draggedX);
        add(draggedY);
        add(movedX);
        add(movedY);
        add(lblInstruccion);
        add(campoSaludo);
        add(boton);
        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new EventosMouse();
    }
    
}
