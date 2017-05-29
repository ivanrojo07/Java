/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Ivan Rojo
 */
class Persona {
    
    private String nombre;
    private String direccion;
    private String telefono;
    
    public Persona(String nombre, String direccion, String telefono){
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){//para convertir los objetos en nombres
        return this.nombre;
    }
}
