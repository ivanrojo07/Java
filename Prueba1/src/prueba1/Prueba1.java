/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.sql.Connection;

/**
 *
 * @author Ivan Rojo
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        //creamos un objeto de la clase conexion
        Conexion conexion= new Conexion();
        //llamamos al metodo para crear la conexion con MYSQL
        Connection con = conexion.getConexionMYSQL();
        //comprobamos que la conexion se hizo con exito
        if(con!=null){
            System.out.println("Exito en la conexion");
        }
        else{
            System.out.println("Fracaso a conexion");
        }
    }
    
}
