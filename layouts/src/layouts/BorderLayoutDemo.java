/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Ivan Rojo
 */
public class BorderLayoutDemo extends JFrame{
    
    //Variables de contenedores
    private JLabel etiquetaSu;
    private JPanel panelIz,panelDer, panelInf;
    private JButton botonIz1, botonIz2, botonIz3;
    private JButton botonDer1,botonDer2, botonDer3;
    private JButton botonInf1, botonInf2;
    private JScrollPane scroll;
    
    public void construyePanelIzquierdo(){
        panelIz = new JPanel();
        botonIz1 = new JButton("Izq1");
        botonIz2 = new JButton("Izq2");
        botonIz3 = new JButton("Izq3");
        panelIz.setLayout(new BoxLayout(panelIz, BoxLayout.Y_AXIS));
        panelIz.setBackground(Color.red);
        panelIz.add(botonIz1);
        panelIz.add(botonIz2);
        panelIz.add(botonIz3);
    }
    
    public void construyePanelInferior(){
        panelInf = new JPanel();
        botonInf1 = new JButton("Inf1");
        botonInf2 = new JButton("Inf2");
        
        panelInf.setLayout(new FlowLayout());
        panelInf.setBackground(Color.green);
        panelInf.add(botonInf1);
        panelInf.add(botonInf2);
       
    }
    public void construyePanelDerecho(){
        panelDer = new JPanel();
        botonDer1 = new JButton("Der1");
        botonDer2 = new JButton("Der2");
        botonDer3 = new JButton("Der3");
        panelDer.setLayout(new BoxLayout(panelDer, BoxLayout.Y_AXIS));
        panelDer.setBackground(Color.blue);
        panelDer.add(botonDer1);
        panelDer.add(botonDer2);
        panelDer.add(botonDer3);
    }
    
    
    public BorderLayoutDemo(){
        
        construyePanelDerecho();
        construyePanelInferior();
        construyePanelIzquierdo();
        
        scroll = new JScrollPane(new JTextArea("JTextArea", 10, 15));
        etiquetaSu = new JLabel("Demostracion BorderLayout");
        this.setLayout(new BorderLayout());
        
        this.add(etiquetaSu, BorderLayout.NORTH);
        this.add(scroll, BorderLayout.CENTER);
        this.add(panelIz, BorderLayout.WEST);
        this.add(panelDer, BorderLayout.EAST);
        this.add(panelInf, BorderLayout.SOUTH);
                
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        pack();
    }
    
    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
