/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionales;

/**
 *
 * @author Ivan Rojo
 */
public class Relacionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = -3;
        byte b = 5;
        short s = 16;
        double d = 3.14;
        
        boolean b1 = i>i;
        boolean b2 = i<b;
        boolean b3 = b<=s;
        boolean b4 = s>=d;
        boolean b5 = d!=0;
        boolean b6 = 1==s;
        
        System.out.println(b1+"\n"+b2+"\n"+b3+"\n"+b4+"\n"+b5+"\n"+b6);
        
    }
    
}
