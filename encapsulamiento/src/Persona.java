
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
public class Persona {
    private String nombre;
    private String nacionalidad;
    private double altura;
    private int edad;
    
    public String getNombre(){
    return nombre;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public String getNacionalidad(){
        return nacionalidad;
    }
    
    public void setNacionalidad(String nac){
        nacionalidad = nac;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double alt){
        if(alt>3){
            JOptionPane.showMessageDialog(null, "Altura invalida");
        }
        else{
        altura = alt;
        }
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int ed){
        if(ed<0 || ed>120){
        JOptionPane.showMessageDialog(null, "Edad invalida");
        }
        else{
            edad = ed;
        }
    }
    
    
}
