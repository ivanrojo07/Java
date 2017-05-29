/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;
import java.sql.*;

/**
 *
 * @author Ivan Rojo
 */
public class MySQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            System.out.println("Estoy intntentando conectarmea la base de datos");
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/Blog","root","ivanrojo07@");
            System.out.println("Conexion exitosa");
            
        }
        catch(SQLException e){
            System.out.println("Error de MySQL");
            
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("Se ha encontradro el siguiente error: "+ e.getMessage());
        }
        
        }
    }
    
