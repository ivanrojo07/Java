/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


/**
 *
 * @author Ivan Rojo
 */
public class Conexion {
    //configuracion de los datos de la BD
    private String usuario="root";
    private String pass="ivanrojo07@";
    private String host="localhost";
    private String nombre_BD="Blog";
    private String servidor="jdbc.mysql://"+host+"/"+nombre_BD;
    private Connection con=null;
    
    
    public Conexion(){
     
    //Funcion que se devuelve la conexion o null si hubo un error
    } 
    public Connection getConexionMYSQL(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            con = DriverManager.getConnection(servidor,usuario,pass);
            
            return con;
            
        }
        catch(Exception e){
            e.printStackTrace();
            
            
        }return con;
    }
}