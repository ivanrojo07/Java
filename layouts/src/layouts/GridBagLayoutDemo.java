/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layouts;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Ivan Rojo
 */
public class GridBagLayoutDemo extends JFrame{
    public GridBagLayoutDemo(){
        
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        JButton button = new JButton("Boton 1");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.5;
        c.gridx = 0;
        c.gridy = 0;
        this.add(button, c);
        
        JButton button2 = new JButton("Boton 2");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        this.add(button2, c);
        
        button = new JButton("Long-Named Button 4");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        this.add(button, c);
        
        button = new JButton("5");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;
        c.weighty = 0.5;
        c.anchor = GridBagConstraints.PAGE_END;
        c.insets = new Insets(20,0,0,0);
        c.gridx = 1;
        c.gridwidth = 2;
        c.gridy = 2;
        this.add(button,c );
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        pack();
    }
    public static void main(String[] args) {
        new GridBagLayoutDemo();
    }
}
