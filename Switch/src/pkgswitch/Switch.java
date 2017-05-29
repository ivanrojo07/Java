/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivan Rojo
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String eleccion = JOptionPane.showInputDialog("Elige el mes: ");
        int elec = Integer.parseInt(eleccion);
        
        switch(elec){
            case 1:
                JOptionPane.showMessageDialog(null, "Enero");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Febrero");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Febrero");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Marzo");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Abril");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Mayo");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Julio");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Agosto");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Septiembre");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Octubre");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "Noviembre");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "Diciembre");
                break;
            default:
                JOptionPane.showMessageDialog(null, "No es ningun mes");
                break;
        }
    }
    
}
