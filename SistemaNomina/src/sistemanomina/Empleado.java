/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemanomina;

/**
 *
 * @author Ivan Rojo
 */
public abstract class Empleado {
    
    private String nombres;
    private String apPaterno;
    private String apMaterno;
    private String numeroSS;
    
    //constructor con cuatro argumentos
    public Empleado(String nom, String paterno, String materno, String nss){
        
        nombres = nom;
        apPaterno = paterno;
        apMaterno =materno;
        numeroSS = nss;
    }
    
    //geters y seters de los argumentos
    public void setNombres(String nom){
        nombres =nom;
    }
    public String getNombres(){
        return nombres;
    }
    
    public void setAppaterno(String paterno){
        apPaterno =paterno;
    }
    public String getAppaterno(){
        return apPaterno;
    }
    
    public void setApmaterno(String materno){
        apMaterno =materno;
    }
    public String getApmaterno(){
        return apMaterno;
    }
    
    public void setNumeross(String nss){
        numeroSS =nss;
    }
    public String getNumeross(){
        return numeroSS;
    }
    
    //Devuelve representación string de un objeto empleado.
    @Override
    public String toString(){
        return String.format("%s %s\nNumero de seguro social: %s", getNombres(),
                getAppaterno(), getNumeross());
    }
    
    //metodo abstracto que debe ser sobreescrito por las subclases
    public abstract double ingresos();
    
}
