/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_conexion;
import java.sql.*;

        
/**
 *
 * @author Owner
 */
public class conectar {
   Connection con=null;
   public Connection conexion(){
       try {
           //cargar nuestro driver
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost/Blog","root","ivanrojo07@");
          
       } catch (ClassNotFoundException | SQLException e) {
         
       }
       return con;
   }
} 