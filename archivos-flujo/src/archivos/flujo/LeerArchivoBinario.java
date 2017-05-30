/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos.flujo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ivan Rojo
 */
public class LeerArchivoBinario extends JFrame{
    
    private ObjectInputStream entrada;
    private DefaultTableModel modelo;
    
 public LeerArchivoBinario(){
     modelo = new DefaultTableModel();
     modelo.addColumn("Nombre");
     modelo.addColumn("Direccion");
     modelo.addColumn("Nacionalidad");
     modelo.addColumn("Edad");
     modelo.addColumn("Salario");
     
     JTable table = new JTable(modelo);
     JScrollPane scroll = new JScrollPane(table);
     
     JButton boton = new JButton("Cargar Info");
     boton.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e) {
             abrirArchivo();
             leerRegistros();
             cerrarArchivo();
         }
         
     });
     
     this.add(boton);
     this.add(scroll);
     this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     this.setVisible(true);
     this.pack();
 }   
 
 public void abrirArchivo(){
     try{
         entrada = new ObjectInputStream(new FileInputStream("C:\\archivos\\personas.ser"));
         
     }
     catch(IOException ex){
         ex.printStackTrace();
         System.err.println("Error al abrir archivo");
     }
 }
 public void leerRegistros(){
     Persona objPersona;
     
     try{
         while(true){
             objPersona = (Persona)entrada.readObject();
             String nombre = objPersona.getNombre();
             String direccion = objPersona.getDireccion();
             String nacionalidad = objPersona.getNacionalidad();
             int edad = objPersona.getEdad();
             double salario = objPersona.getSalario();
             
             String[] datosPersona = {nombre, direccion, nacionalidad, String.valueOf(edad), String.valueOf(salario)};
             modelo.addRow(datosPersona);
         }
     }
     catch(EOFException endOfFileException){
         return;//Se llego al fin del archivo
     }
     catch (IOException ex) {
            System.err.println("Error al leer el archivo");
        } catch (ClassNotFoundException ex) {
            System.err.println("No se pudo crear el objeto");
        }
 }
 public void cerrarArchivo(){
     try{
         if(entrada != null){
             entrada.close();
             
         }
         
     }
     catch(IOException ex){
         System.err.println("No se puede cerrar el archivo");
     }
     
 }
    public static void main(String[] args) {
    LeerArchivoBinario leer = new LeerArchivoBinario();
    }
}
