/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasvszombies;

/**
 *
 * @author Ivan Rojo
 */
public class BalaPlata extends ObjetoGrafico{
    
    String nombre;
    public BalaPlata(String nom){
        nombre = nom;
    }
    
    
    @Override
    public void mover(){
        System.out.println("Movimiento de bala plata. Yo me llamo "+nombre);
    }
}
