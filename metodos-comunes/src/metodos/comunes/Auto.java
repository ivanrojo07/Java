/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.comunes;

/**
 *
 * @author Ivan Rojo
 */
public class Auto {

    /**
     * @param args the command line arguments
     */
    private String nombre;
    private String marca;
    private String color;
    private Llanta llanta;

    
    
    public Auto(String nombre, String marca, String color, Llanta llanta){
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.llanta = llanta;
        
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Llanta getLlanta() {
        return llanta;
    }

    public void setLlanta(Llanta llanta) {
        this.llanta = llanta;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
