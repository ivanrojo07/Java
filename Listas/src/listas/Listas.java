/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author Ivan Rojo
 */
public class Listas extends JFrame{
    
    public Listas(){

    DefaultListModel<Persona> modelo = new DefaultListModel<Persona>();
    JList lista = new JList(modelo);
    lista.setBounds(10,10,200,300);
    
    modelo.addElement(new Persona("Juan","calle y numero", "11122999"));
    modelo.addElement(new Persona("Olivia", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Andrés", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Luis", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Jared", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Javier", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Leticia", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Francisco", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Xavier", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Pedro", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Sebastián", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Andrea", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Fabiola", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Oyuky", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Arturo", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Liliana", "calle y numero", "11122999"));    
    modelo.addElement(new Persona("Edmundo", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Paloma", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Azul", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Silab", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Sadeé", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Dominico", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Alfredo", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Cecilia", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Norberto", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Fidel", "calle y numero", "11122999"));
    modelo.addElement(new Persona("Ángel", "calle y numero", "11122999"));
    
    JScrollPane scroll = new JScrollPane(lista);
    scroll.setBounds(10,10,200,250);
    
    add(scroll);
    setSize(300,500);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
}
    public static void main(String[] args){
        new Listas();
    }
}
