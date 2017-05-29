/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasvszombies;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Ivan Rojo
 */
public class AdminV {

    /**
     * @param args the command line arguments
     */
    private ArrayList<ObjetoGrafico> listaFiguras;
    
    public AdminV(){
        listaFiguras = new ArrayList<ObjetoGrafico>();
        
        listaFiguras.add(new BalaPlata("Plata1"));
        listaFiguras.add(new BalaPlata("Plata2"));
        listaFiguras.add(new BalaPlata("Plata3"));
        listaFiguras.add(new BalaVerde("Verde1"));
        listaFiguras.add(new Zombie("Jake"));
        listaFiguras.add(new Zombie("Herman"));
        listaFiguras.add(new Zombie("Peter"));
        listaFiguras.add(new BalaVerde("Verde2"));
        
        TimerTask tt = new TimerTask(){
          
            @Override
            public void run(){
                moverFiguras();
            }
        };
        
        Timer t = new Timer();
        t.schedule(tt, 0,5000);
    }
    public void moverFiguras(){
        for(ObjetoGrafico og: listaFiguras){
            og.mover();
        }
        
        System.out.println("---------------------------------------------------");
    }
    public static void main(String[] args) {
        AdminV admin = new AdminV();
    }
    
}
