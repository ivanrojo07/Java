/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcoiris;

import javax.swing.JFrame;

/**
 *
 * @author Ivan Rojo
 */
public class PruebaDibujoArcoiris extends JFrame {
    public static void main(String[] args) {
        DibujoArcoiris Panel = new DibujoArcoiris();
        JFrame aplicacion = new JFrame();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(Panel);
        aplicacion.setSize(400,250);
        aplicacion.setVisible(true);
    }
}
