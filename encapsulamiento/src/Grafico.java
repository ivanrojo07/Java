
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan Rojo
 */
public class Grafico {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre: ");
        String nacionalidad = JOptionPane.showInputDialog("Escribe tu nacionalidad: ");
        String altura = JOptionPane.showInputDialog("Escribe tu altura: ");
        String edad = JOptionPane.showInputDialog("Escribe tu edad: ");
        
        //Convertir los datos numericos
        double alt = Double.parseDouble(altura);
        int edadPer = Integer.parseInt(edad);
        
        //crear el objeto 
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setNacionalidad(nacionalidad);
        persona.setAltura(alt);
        persona.setEdad(edadPer);
        
        //enviar los datos
        JOptionPane.showMessageDialog(null,"Nombre: "+ persona.getNombre());
        JOptionPane.showMessageDialog(null,"Nacionalidad: "+ persona.getNacionalidad());
        JOptionPane.showMessageDialog(null,"Altura: "+ persona.getAltura());
        JOptionPane.showMessageDialog(null,"Edad: "+ persona.getEdad());
    }
}
